package com.skilldistillery.jets;


public abstract class Jet {
	/*
	 * All Jets must have a model, speed, range, and price associated with them.
	 * Speed is in MPH, but your Jet can also output the speed in mach. Jets have
	 * a fly() method that prints out the Jet details and the amount of time the Jet
	 * can fly until it runs out of fuel (based on speed and range).
	 */
	private String model;
	@Override
	public String toString() {
		return "Jet [model=" + model + ", speed=" + speed + ", range=" + range + ", price=" + price + "]";
	}

	private double speed;
	private int range;
	private long price;

	public Jet() {
		super();
	}
	

	public Jet(String model, double speed, int range, long price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	public void fly() {
//		System.out.println("Aircraft is Flying: ");
//		double flightTime = (this.range/this.speed);
		
	}

	public double getSpeedinMach() {
		// math to convert speed ft/s to speed in Mach
		this.speed = (speed / 767.27);
		return speed;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public static void jetApplication() {

	}
	
}
