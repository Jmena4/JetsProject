package com.skilldistillery.jets;

import java.util.Scanner;

public class Airfield {

	boolean go = true;
	private Jet[] jets = new Jet[10];
	Scanner sc = new Scanner(System.in);

	public Airfield() {
		super();
		jets[0] = new FighterJet("F-35", 1200, 1200, 85000000);
		jets[1] = new FighterJet("F-22", 1498, 1839, 150000000);
		jets[2] = new FighterJet("F-16", 1500, 2622, 18600000);
		jets[3] = new CargoPlane("C-5 ", 597, 7273, 224290000);
		jets[4] = new CargoPlane("C-130", 398, 2361, 30000000);

//		populateAirfield(jets);
	}

	public Airfield(String model, double speed, int range, long price) {
	}

	public void listJets() {
		for (Jet jet : jets) {
			if (jet instanceof Jet) {
				System.out.println((" model: " + jet.getModel() + " speed(MPH): " + jet.getSpeed() + " range(Miles): "
						+ jet.getRange() + " Price/Unit cost is($): " + jet.getPrice()));

			} else {
				break;
			}
		}
	}

	public void flyJets() {
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] instanceof Jet) {
				System.out.println("Jet model " + jets[i].getModel() + " is flying");
			} else {
				break;
			}
		}
	}

	public Jet fastestJet() {
		Jet theFastestJet = jets[0];
		for (Jet jet : jets) {
			if (jet != null && (jet.getSpeed() > theFastestJet.getSpeed())) {
				theFastestJet = jet;
			}
		}
		return theFastestJet;
	}

	public Jet longestRange() {
		Jet theLongestRange = jets[0];
		for (Jet jet : jets) {
			if (jet != null && (jet.getRange() > theLongestRange.getRange())) {
				theLongestRange = jet;
			}
		}
		return theLongestRange;
	}

	public void loadCargoJets() {
		for (Jet jet : jets) {
			if (jet instanceof CargoPlane) {
				((CargoPlane) jet).loadCargo();
				System.out.println("Loading Cargo Planes: " + "\t" + jet.getModel());
			}
		}
	}

	public void dogFight() {
		for (Jet jet : jets) {
			if (jet instanceof FighterJet) {
				((FighterJet) jet).fight();
				System.out.print("Dog Fighting: " + "\t" + jet.getModel());
				System.out.println((Character.toChars(0x1F680)));
			}
		}
	}

	public void addANewJet() {
		// jets[5] = new CargoPlane("C-17", 590, 6456, 218000000); Test values for
		boolean go = true;
		for (int i = 0; i < jets.length; i++) {
			if (jets == null) {
				Jet addANewJet = jets[i];
				while (go) {
					System.out.println("Please enter a Jet Aircraft Model: ");
					String model = sc.next();

					System.out.println("Please enter an Aircraft Speed: ");
					double speed = sc.nextDouble();

					System.out.println("Please enter an Aircraft Range: ");
					int range = sc.nextInt();
					;

					System.out.println("Please enter an Aircraft Price");
					long price = sc.nextLong();

					Jet addAJNewJet = jets[i];
					System.out.println("I parked the new Jet");
					break;

				}
			}
			go = false;
			sc.close();
		}

	}
}