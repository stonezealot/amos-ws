package com.epb.ah;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Profile("oauth")
@Configuration
@EnableResourceServer
public class SecurityConfigResourceServer
		extends ResourceServerConfigurerAdapter {

	//
	// overridden
	//

	@Override
	public void configure(final HttpSecurity http)
			throws Exception {

		// customization
		http
				.cors() // insert CORS filter first
				.and()
				.authorizeRequests()
				.antMatchers(
						"/actuator/info", // always allow actuator info
						"/api/images/*", // always allow getting images (redirection) 
						"/api/files/*") // temporary solution for getting files
				.permitAll();

		// default behaviors
		super.configure(http);
	}

}
