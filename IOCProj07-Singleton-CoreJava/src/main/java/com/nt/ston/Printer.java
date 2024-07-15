package com.nt.ston;

public class Printer {

	//private static ref variable to hold that single obj of singleton class (2)
	private static Printer INSTANCE;
	
	
	//private Constructor (1)
	private Printer()
	{
		System.out.println("Printer:0-Param Constructor");	
	}
	//static factory method having singleton logic (3)
	public static Printer getInstance()
	{
		
		//write singleton logic
		if(INSTANCE==null)
			INSTANCE = new Printer();
		return INSTANCE;
	}
	//b.method
	public void printData(String Data)
	{
		System.out.println(Data);
	}
}
