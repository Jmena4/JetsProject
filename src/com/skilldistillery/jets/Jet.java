package com.skilldistillery.jets;

public abstract class Jet {
	/*
	 * All Jets must have a model, speed, range, and price associated with them.
	 * Speed is in MPH, but your Jet can also output the speed in mach. Jets have
	 * a fly() method that prints out the Jet details and the amount of time the Jet
	 * can fly until it runs out of fuel (based on speed and range).
	 */
	private String model;
	private int speed;
	private double range;
	private long price;

	public Jet() {
		super();
	}

	public Jet(String model, int speed, double range, long price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	public void fly() {

	}

	public double getSpeedinMach() {
		// math to convert speed ft/s to speed in Mach
		this.speed = speed / 980;
		return speed;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public double getRange() {
		return range;
	}

	public void setRange(double range) {
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
