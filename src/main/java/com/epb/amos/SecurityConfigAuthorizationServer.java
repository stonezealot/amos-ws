package com.epb.amos;

import java.security.MessageDigest;
import java.util.Optional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerSecurityConfiguration;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import com.epb.amos.entity.EpUser;
import com.epb.amos.repository.EpUserRepository;

@Profile("oauth")
@Configuration
/*
 * Do NOT use "@EnableAuthorizationServer". It will break CORS configuration.
 * Extends "AuthorizationServerSecurityConfiguration" instead.
 */
// @EnableAuthorizationServer
public class SecurityConfigAuthorizationServer
		extends AuthorizationServerSecurityConfiguration
		implements UserDetailsService, PasswordEncoder {

	//
	// beans
	//

	@Bean
	public CorsConfigurationSource corsConfigurationSource() {
		final CorsConfiguration config = new CorsConfiguration();
		config.addAllowedOrigin("*");
		config.addAllowedHeader("*");
		config.addAllowedMethod("*");

		final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", config);

		return source;
	}

	//
	// overridden
	//

	@Override
	protected void configure(final HttpSecurity http)
			throws Exception {

		// customization
		http.cors();
		// default behaviors
		super.configure(http);
	}

	@Override
	protected void configure(final AuthorizationServerSecurityConfigurer oauthServer)
			throws Exception {

		// customization
		oauthServer.checkTokenAccess("permitAll()");
		// default behaviors
		super.configure(oauthServer);
	}

	//
	// implemented
	//

	@Override
	public UserDetails loadUserByUsername(final String username)
			throws UsernameNotFoundException {

		final Optional<EpUser> epUser = epUserRepository
				.findByUserId(username);
		if (!epUser.isPresent()) {
			throw new UsernameNotFoundException(username);
		}
		return User.withUsername(username)
				.password(epUser.get().getUserPwd())
				.roles("USER")
				.build();
	}

	@Override
	public String encode(final CharSequence rawPassword) {
		try {
			final String password = rawPassword.toString();
			final MessageDigest messageDigest = MessageDigest.getInstance("SHA");
			final byte[] digests = messageDigest.digest(password.getBytes());

			final StringBuilder stringBuilder = new StringBuilder();
			for (int i = 0; i < digests.length; i++) {
				int halfbyte = (digests[i] >>> 4) & 0x0F;
				for (int j = 0; j <= 1; j++) {
					stringBuilder.append(
							((0 <= halfbyte) && (halfbyte <= 9))
									? (char) ('0' + halfbyte)
									: (char) ('a' + (halfbyte - 10)));
					halfbyte = digests[i] & 0x0F;
				}
			}

			return stringBuilder.toString();
		} catch (final Throwable throwable) {
			this.log.error("error converting password", throwable);
			return null;
		}
	}

	@Override
	public boolean matches(
			final CharSequence rawPassword,
			final String encodedPassword) {

		final String calculatedPassword = this.encode(rawPassword);
		// this.log.info("rawPassword: " + rawPassword + "\n"
		// + "calculatedPassword: " + calculatedPassword + "\n"
		// + "encodedPassword: " + encodedPassword);
		return calculatedPassword.equals(encodedPassword);
	}

	//
	// fields
	//

	private final Log log = LogFactory.getLog(SecurityConfigAuthorizationServer.class);

	private final EpUserRepository epUserRepository;

	//
	// constructor
	//

	@Autowired
	public SecurityConfigAuthorizationServer(
			final EpUserRepository epUserRepository) {

		super();
		this.epUserRepository = epUserRepository;
	}

}
