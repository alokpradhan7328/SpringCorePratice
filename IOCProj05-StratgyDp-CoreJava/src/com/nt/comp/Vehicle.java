package com.nt.comp;
//target Class
public final class Vehicle {
	
	public Vehicle() {
		System.out.println("Vehicle::0-ParamConstructor");
	}
	//HAS-A propery
	private Engine eng;
	public void setEngine(Engine eng) {
		System.out.println("Vehicle.setEngine() Called");
		this.eng=eng;
	}
	public String drive(String vehicle) {
		String msg = eng.eng(vehicle);
		return msg;
	}

}
