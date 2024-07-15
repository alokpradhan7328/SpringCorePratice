package com.nt.comp;

public final class PetrolEngine implements Engine {

	public PetrolEngine() {
		System.out.println("PetrolEngine:0-ParamConstructor..");
	}
	
	

	@Override
	public String eng(String vehicle) {
		return vehicle+" is ready to Start";
	}

}
