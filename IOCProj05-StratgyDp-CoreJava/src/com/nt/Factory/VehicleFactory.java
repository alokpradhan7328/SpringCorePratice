package com.nt.Factory;

import com.nt.comp.DieselEngine;
import com.nt.comp.EletricEngine;
import com.nt.comp.Engine;
import com.nt.comp.PetrolEngine;
import com.nt.comp.Vehicle;

public class VehicleFactory {
	
	public static Vehicle getInstance(String vehicleType) {
		Engine eng =null;
		if(vehicleType.equalsIgnoreCase("electrice"))
			eng= new EletricEngine();
		else if(vehicleType.equalsIgnoreCase("dieselEngine"))
			eng = new DieselEngine();
		else if(vehicleType.equalsIgnoreCase("petrolengine"))
			eng = new PetrolEngine();
		else
			throw new IllegalArgumentException("In -valid vehicleType");
		//creates targer class Obj
		Vehicle v= new Vehicle();
		v.setEngine(eng);
		return v;
	}
}
