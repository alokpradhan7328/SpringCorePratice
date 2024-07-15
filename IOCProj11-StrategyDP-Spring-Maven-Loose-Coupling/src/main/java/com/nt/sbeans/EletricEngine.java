package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("eEngine")
public final class EletricEngine implements IEngine {
	
	public EletricEngine()
	{
		System.out.println("EletricEngine:0-ParamConstructor..");
	}

	@Override
	public void startEngine() {
		System.out.println("EletricEngine::EletricEngine Started");
	}

	@Override
	public void stopEngine() {
		System.out.println("EletricEngine::EletricEngine Stoped");

	}

}
