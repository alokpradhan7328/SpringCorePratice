package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fpkt")
public final class Flipkart {
	
	//HAS-A property
	@Autowired
	//@Qualifier("dtdc")
	private ICourier courier;
	
	public Flipkart() {
		System.out.println("Flipkart:0-ParamConstructor");
	}
	
	//b.mnethod
	public String shopping(String[]items,double[]prices) {
		double billAmount=0;
		for(double p:prices) {
			billAmount=billAmount+p;
		}
		//generate the random number is order id
		int oid= new Random().nextInt(1000);
		
		//use the courier
		String courierMsg=courier.deliver(oid);
		//generate message for shopping and delivering
		String resultMsg=Arrays.toString(items)+" are purchased having prices "+Arrays.toString(prices)+" with billAmount:: "+billAmount+"-->"+courierMsg;
		return resultMsg;
	}

}
