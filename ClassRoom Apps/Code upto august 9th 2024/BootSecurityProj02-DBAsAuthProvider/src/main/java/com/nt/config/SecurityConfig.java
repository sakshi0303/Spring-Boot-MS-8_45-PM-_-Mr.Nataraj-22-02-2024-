package com.nt.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebMvcSecurity
public class SecurityConfig extends  WebSecurityConfigurerAdapter{
	@Autowired
	private  DataSource ds;
	
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		  // DB s/w  as the Authentication provider
	   auth.jdbcAuthentication().dataSource(ds).passwordEncoder(new BCryptPasswordEncoder())
	   .usersByUsernameQuery("SELECT UNAME,PWD,STATUS FROM USERS WHERE UNAME=?")
	   .authoritiesByUsernameQuery("SELECT UNAME,ROLE FROM USERS_ROLES WHERE UNAME=?");
		
	}
	
	@Override
	public  void configure(HttpSecurity http) throws Exception {
		// configure   Authentication + Authorization on  the urls
	    http.authorizeHttpRequests().antMatchers("/").permitAll()
	     .antMatchers("/offers").authenticated()
	     .antMatchers("/balance").hasAnyAuthority("CUSTOMER","MANAGER")
	     .antMatchers("/loanApprove").hasAuthority("MANAGER")
	     .anyRequest().authenticated()
	     .and().formLogin()  //for FORM based authentication
	     //.and().rememberMe()
	     .and().logout()
	    // .and().httpBasic()   //enables BASIC Authentication (uses the browser generated dialog box for asking username,password)
	     .and().exceptionHandling().accessDeniedPage("/denied")  // For configuring custom page  for authorization failure
	    .and().sessionManagement().maximumSessions(2).maxSessionsPreventsLogin(true);
	     
	
	}

}
