package com.nt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("com/nt/commons/Voter_Info.properties")
@ComponentScan(basePackages = "com.nt.sbeans")
public class AppConfig {

}
