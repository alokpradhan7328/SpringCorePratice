package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("dEngine")
public final class DieselEngine implements IEngine {

	public DieselEngine()
	{
		System.out.println("DieselEngine:0-ParamConstructor..");
	}
	
	@Override
	public void startEngine() {
		System.out.println("DieselEngine::DieselEngine Started");
	}

	@Override
	public void stopEngine() {
		System.out.println("DieselEngine::DieselEngine Stoped");

	}

}
