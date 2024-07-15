package com.nt.comp;

public final class DTDC implements ICourier {
	
	public DTDC() {
		System.out.println("DTDC::0-Param Constructor");
	}

	public String deliver(int oid) {
		return oid+" order id ready to deliver using DTDC courier Services";	}
	 
	
}
