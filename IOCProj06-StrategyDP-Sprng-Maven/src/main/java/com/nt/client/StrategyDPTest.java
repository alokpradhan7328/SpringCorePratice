package com.nt.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.Vehicle;

public class StrategyDPTest{

	public static void main(String[] args) {

		//create the IOC Container
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		//get Target SpringBeanClass Obj...
		Vehicle vehicle= ctx.getBean("vehicle",Vehicle.class);
		//invoke the bussiness Method
		vehicle.journey("Hyd", "BAM");
		//close the Container
		ctx.close();
	}

}
