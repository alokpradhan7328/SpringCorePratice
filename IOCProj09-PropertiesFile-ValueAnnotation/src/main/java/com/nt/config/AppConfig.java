package com.nt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@ComponentScan(basePackages = "com.nt.sbeans")
@Configuration
@PropertySource(value = "com/nt/commons/Info.properties")
public class AppConfig {

}
