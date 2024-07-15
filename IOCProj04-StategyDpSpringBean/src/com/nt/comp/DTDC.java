package com.nt.comp;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dtdc")
//@Primary
public final class DTDC implements ICourier {
	public DTDC() {
		System.out.println("DTDC::0-Param Constructor");
	}

	public String deliver(int oid) {
		return oid+" order id ready to deliver using DTDC courier Services";	}
	 
	
}
