package com.nt.client;

import com.nt.Factory.FlipkartFactory;
import com.nt.comp.Flipkart;

public class StragetyPatternTest {

	public static void main(String[] args) {
		//use factory
		Flipkart fpkt= FlipkartFactory.getInstance("dtdc");
		String msg = fpkt.shopping(new String[]{"sweet","pants","shirt"},new double[] {1200,2003,1500});
		System.out.println(msg);
		
	}

}
