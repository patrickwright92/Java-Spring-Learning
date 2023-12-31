package com.pwright.rest.webservices.restfulwebservices.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class SpringSecurityConfiguration {

	@Bean
	public SecurityFilterChain filterchain(HttpSecurity http) throws Exception {
		
//		http.authorizeHttpRequests(
//				auth -> auth.anyRequest().authenticated()
//				);
		
		// have to static import withDefaults
		http.httpBasic(withDefaults());
		
		http.csrf(csrf -> csrf.disable());
		
		return http.build();	
	}
}
