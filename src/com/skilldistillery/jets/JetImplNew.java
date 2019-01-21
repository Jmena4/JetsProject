package com.skilldistillery.jets;

import java.util.Scanner;

public class JetImplNew extends Airfield{
	Scanner sc = new Scanner(System.in);

	public JetImplNew() {
		System.out.println("Test inside JetImpl");
		
	}

	public JetImplNew(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		
//		System.out.println("Please enter an Aircraft Model type: ");
//		String model1 = sc.next();
//		
//		
//		System.out.println("Please enter an Aircraft Speed: ");
//		double speed1 = sc.nextDouble();
//		
//		
//		
//		System.out.println(model1 + speed1);
//		
//		
//		sc.close();
		
 	};
	
	
	

}
