package com.nt.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.comp.Flipkart;
import com.nt.config.AppConfig;

public class StragetyPatternTest {
	
	public static void main(String[] args) {		
		// create ioc container
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		//get target Spring bean class obj refer
		Flipkart fpkt= ctx.getBean("fpkt",Flipkart.class);
		//invoke the bussiness method
		try {
		String resultMsg=fpkt.shopping(new String[] {"kurta","pyjama","attar"},new double [] {1547.23,1255.36,589.78} );
		System.out.println(resultMsg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		//close the container'
		ctx.close();

	}
}
