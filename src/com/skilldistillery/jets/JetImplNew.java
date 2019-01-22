package com.skilldistillery.jets;

import java.util.Scanner;

public class JetImplNew extends Jet{
	Scanner sc = new Scanner(System.in);

	public JetImplNew() {
		System.out.println("Test inside JetImpl");
		
	}

	public JetImplNew(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		
 	};
	
	
	

}
