//AppConfig.java (Configuration class)
package com.nt.config;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.nt.sbeans")
//@Lazy(true)
public class AppConfig {
	
	public AppConfig() {
		System.out.println("AppConfig:: 0-param constructor");
	}
	
	@Bean(name="ldt")
	//@Lazy(true)
	public   LocalDateTime createLDT() {
		System.out.println("AppConfig.createLDT()");
		return  LocalDateTime.now();
	}

	@Bean(name="dt1")
	public  Date  createDate() {
		return  new Date();
	}
}
