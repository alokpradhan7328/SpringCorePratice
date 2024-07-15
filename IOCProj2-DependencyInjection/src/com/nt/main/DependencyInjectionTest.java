package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.getSeason;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		//Create IOC container
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		getSeason sf=ctx.getBean("sf",getSeason.class);
		String Result = sf.showSeasos("Alok");
		String Result2=sf.showWeekDays("Alok");
		System.out.println(Result);
		System.out.println(Result2);
		ctx.close();
	}

}
