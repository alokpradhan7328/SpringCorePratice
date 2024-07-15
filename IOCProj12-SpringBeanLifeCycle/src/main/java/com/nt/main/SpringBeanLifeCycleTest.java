package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.VoterDetails;

public class SpringBeanLifeCycleTest {

	public static void main(String[] args) {
		
		//create ioc container
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		//get springbean class object
		VoterDetails details = ctx.getBean("voter",VoterDetails.class);
		//invole the b.method
		String result = details.checkVotionEligibility();
		
		System.out.println(result);

		//close the container
		ctx.close();
	}

}
