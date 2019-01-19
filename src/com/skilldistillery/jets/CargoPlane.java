package com.skilldistillery.jets;

public abstract class CargoPlane extends Jet implements CargoCarrier{

	public CargoPlane() {
		
	}

	public CargoPlane(String model, int speed, double range, long price) {
		super(model, speed, range, price);
	}
	
	public void loadCargo() {
		
	}

}
