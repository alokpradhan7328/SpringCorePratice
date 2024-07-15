package com.nt.comp;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("courier")
@Lazy(true)
public final class BlueDart implements ICourier {
	
	public BlueDart() {
		System.out.println("BlueDart::0-Param Constructor");
	}

	
	public String deliver(int oid) {
		
		return oid+" order id ready to deliver using BlueDart courier Services";	}
	 
	
}
