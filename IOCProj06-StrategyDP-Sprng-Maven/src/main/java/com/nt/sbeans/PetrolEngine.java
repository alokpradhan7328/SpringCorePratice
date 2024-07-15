package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("pEngine")
public final class PetrolEngine implements IEngine {
	
	public PetrolEngine()
	{
		System.out.println("PetrolEngine:0-ParamConstructor...");
	}

	@Override
	public void startEngine() {
		System.out.println("PetrolEngine::PetrolEngine Started");
	}

	@Override
	public void stopEngine() {
		System.out.println("PetrolEngine::PetrolEngine Stoped");

	}

}
