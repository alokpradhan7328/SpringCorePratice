package com.nt.Factory;

import com.nt.comp.BlueDart;
import com.nt.comp.DTDC;
import com.nt.comp.Flipkart;
import com.nt.comp.ICourier;

public class FlipkartFactory {

	//static method having factory design Pattern 
	public static Flipkart getInstance(String courierType) {
		ICourier courier= null;
		if(courierType.equalsIgnoreCase("dtdc"))
			courier= new DTDC();
		else if(courierType.equalsIgnoreCase("bdart"))
			courier=new BlueDart();
		else
			throw new IllegalArgumentException("Invalid Courier Type");
		//creates obj for target class
		Flipkart fpkt = new Flipkart();
		//set courier to Flipkart obj
		fpkt.setCourier(courier);
		return fpkt;
	}
	
}
