package com.nt.comp;

public final class EletricEngine implements Engine {

	public EletricEngine() {
		System.out.println("DieselEngine:0-ParamConstructor..");
	}
	
	
	@Override
	public String eng(String vehicle) {
		
			return vehicle+" is ready to Start";
		
	}

}
