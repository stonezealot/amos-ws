package com.epb.amos;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Profile("security-off")
@Configuration
public class SecurityConfigSecurityOff
		extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(final HttpSecurity http)
			throws Exception {

		http
				.csrf().disable()
				.cors()
				.and()
				.authorizeRequests().anyRequest().permitAll();
	}

}
