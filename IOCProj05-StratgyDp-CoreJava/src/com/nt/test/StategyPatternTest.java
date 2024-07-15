package com.nt.test;

import com.nt.Factory.VehicleFactory;
import com.nt.comp.Vehicle;

public class StategyPatternTest {

	public static void main(String[] args) {
		Vehicle v= VehicleFactory.getInstance("DieselEngine");
		String result = v.drive("Bus");
		System.out.println(result);

	}

}
