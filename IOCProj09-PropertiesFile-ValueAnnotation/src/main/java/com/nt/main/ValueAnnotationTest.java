package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.PersonDetails;

public class ValueAnnotationTest {

	public static void main(String[] args) {
		//create ioc container
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		//get Springbean class obj ref from the ioc container
		PersonDetails details= ctx.getBean("pDetails",PersonDetails.class);
		System.out.println(details);
		
		ctx.close();
	}

}
