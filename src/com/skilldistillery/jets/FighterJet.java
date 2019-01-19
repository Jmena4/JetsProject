package com.skilldistillery.jets;

public abstract class FighterJet extends Jet implements CombatReady {

	public FighterJet() {
	}

	public FighterJet(String model, int speed, double range, long price) {
		super(model, speed, range, price);
	}

	public void fight() {

	}

}
