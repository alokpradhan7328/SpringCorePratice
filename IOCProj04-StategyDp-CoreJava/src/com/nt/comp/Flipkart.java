package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

public final class Flipkart {
	
	//HAS-A property
	private ICourier courier;
	
	//setter method for injection
	public void setCourier(ICourier courier) {
		this.courier=courier;
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
