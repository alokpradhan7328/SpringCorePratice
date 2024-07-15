package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public final class Vehicle {
	@Autowired// Field Injection
	@Qualifier("pEngine")
	private IEngine engg;
	
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
