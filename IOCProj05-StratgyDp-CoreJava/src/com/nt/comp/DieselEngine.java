package com.nt.comp;

public final class DieselEngine implements Engine {

	public DieselEngine() {
		System.out.println("DieselEngine:0-ParamConstructor..");
	}
	

	@Override
	public String eng(String vehicle) {
		return vehicle+" is ready to Start";
	}

}
