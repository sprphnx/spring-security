package com.sprphnx.springsecurity.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		UserBuilder users = User.withDefaultPasswordEncoder();
		
		auth.inMemoryAuthentication().withUser(users.username("rohananoop").password("test123").roles("EMP"));
		auth.inMemoryAuthentication().withUser(users.username("ramyarohan").password("test123").roles("EMP","MGR"));
		auth.inMemoryAuthentication().withUser(users.username("nayanarohan").password("test123").roles("EMP","ADM"));
	}

	
	/*
	 * If below overide is not given the application will use spring's default user login page.
	 * @see org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter#configure(org.springframework.security.config.annotation.web.builders.HttpSecurity)
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests().antMatchers("/resources/**").permitAll()
		.and().authorizeRequests().antMatchers("/").hasRole("EMP")
		.and().authorizeRequests().antMatchers("/leaders/**").hasRole("MGR")
		.and().authorizeRequests().antMatchers("/admins/**").hasRole("ADM")
		.and().authorizeRequests().anyRequest()
				.authenticated().and().formLogin().loginPage("/showLoginPage").loginProcessingUrl("/authenticateUser")
				.permitAll().and().logout().permitAll();
	
		
	}
	
	
	
}
