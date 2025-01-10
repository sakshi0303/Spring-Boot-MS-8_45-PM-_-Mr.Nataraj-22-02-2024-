package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.nt.sbeans.Company;

@SpringBootApplication
@PropertySource("com/nt/commons/Info.properties")
public class BootProj07BulkDataInjectionUsingConfigurationPropertiesApplication {

	public static void main(String[] args) {
		//get IOC container
		ApplicationContext ctx=SpringApplication.run(BootProj07BulkDataInjectionUsingConfigurationPropertiesApplication.class, args);
		
		//get Spring bean calss obj ref
		Company company=ctx.getBean("company",Company.class);
		System.out.println(company);
		
		//close the container
		 ((ConfigurableApplicationContext) ctx).close();
		
	}

}
