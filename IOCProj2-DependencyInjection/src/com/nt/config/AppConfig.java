package com.nt.config;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.nt.sbeans")
public class AppConfig {
	
	public AppConfig() {
		System.out.println("AppConfig:0-Param Constructor");
	}
	
	@Bean(name="ld")
	public LocalDate createLD() {
		return LocalDate.now();
	}
}
