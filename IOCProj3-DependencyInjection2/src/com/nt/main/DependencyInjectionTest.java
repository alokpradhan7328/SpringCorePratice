package com.nt.main;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		//create IOC container having @components class
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		//get target Spring bean class obj ref
		WishMessageGenerator generator = ctx.getBean("wmg",WishMessageGenerator.class);
		
		//invoke the b.method
		String result = generator.showWishMessage("Alok");
		System.out.println(result);
		ctx.close();  
	}

}
