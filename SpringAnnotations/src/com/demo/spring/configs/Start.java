package com.demo.spring.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.demo.spring.entity.Address;

@Configuration
@ComponentScan(basePackages= {"com.demo.spring"})
public class Start {

	
	
	
	@Bean(name="address")
	public Address getAddress() {
		
		return new Address("Bijapur","India");
		
	}
	
	
	
	
	
}
