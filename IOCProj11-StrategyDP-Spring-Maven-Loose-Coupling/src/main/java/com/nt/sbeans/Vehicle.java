package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("vehicle")
public final class Vehicle {
	@Autowired// Field Injection
	//@Qualifier("eEngine")
	//@Qualifier("${engine.id}") --invalid ,we can't place placeholders inside the @Qualifier(-) 
	//@Qualifier(@Value("${engine.id}")) --invalid,we can not place @Value annotation inside the @Qualifier(-) annotation
	@Qualifier("motor")
	private IEngine engg;
//	@Value("${engine.id}")
//	private String id;
	//b.method
	
	public void journey(String startPlace,String destPlace)
	{
		System.out.println("Vehicle.journey()");
		engg.startEngine();
		
		System.out.println("Journey Started From: "+startPlace);
		
		System.out.println("Journey Is Goining On...");
		
		System.out.println("Journey Ended at: "+destPlace);
		engg.stopEngine();
		
	}

}
