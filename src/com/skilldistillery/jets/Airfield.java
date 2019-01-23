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

	public Jet listJets() {
		for (Jet jet : jets) {
			if (jet != null) {
				System.out.println("Jet model is: " + jet.getModel() + " Max speed(MPH): " + jet.getSpeed()
						+ " Max range(Miles): " + jet.getRange() + " Price/Unit cost is($): " + jet.getPrice());

			} else {
				break;
			}
		}
		return null;
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

	public Jet addANewJet(int choice) {
		// jets[5] = new CargoPlane("C-17", 590, 6456, 218000000); Test values for
		Jet addAJNewJet = jets[null];
		displayAircraftSelectionMenu();
		choice = sc.nextInt();
		for (Jet jet : jets) {
			if (jets == null)
				switch (choice) {
				case 1:
					System.out.println("Please enter an Cargo Jet Aircraft Model type: ");
					String model = sc.next();
					jet.setModel(model);

					System.out.println("Please enter an Aircraft Speed: ");
					double speed = sc.nextDouble();
					jet.setSpeed(speed);

					System.out.println("Please enter an Aircraft Range: ");
					int range = sc.nextInt();
					jet.setRange(range);
					;

					System.out.println("Please enter an Aircraft Price");
					long price = sc.nextLong();
					jet.setPrice(price);

					addAJNewJet = new CargoPlane(model, speed, range, price);
					System.out.println("I parked the new CargoJet");
					break;

				case 2:
					System.out.println("Please enter an Fighter Jet Aircraft Model type: ");
					model = sc.next();
					jet.setModel(model);

					System.out.println("Please enter an Aircraft Speed: ");
					speed = sc.nextDouble();
					jet.setSpeed(speed);

					System.out.println("Please enter an Aircraft Range: ");
					range = sc.nextInt();
					jet.setRange(range);
					;

					System.out.println("Please enter an Aircraft Price");
					price = sc.nextLong();
					jet.setPrice(price);

					addAJNewJet = new FighterJet(model, speed, range, price);
					System.out.println("I parked the new ighterJet");
					break;
				default:
					addAJNewJet = new JetImplNew("C-17", 590, 6456, 218000000);
					break;

				}
			for (Jet jet2 : jets) {
				if (jet == null) {
					jet = addAJNewJet;
					System.out.println("Parked jet");
					break;
				}
				while (go)
					;
				sc.close();

				return addANewJet;
			}
		}
	}

	private void displayAircraftSelectionMenu() {
		System.out
				.println("\nList Aircraft Type options to create(1 or 2):\n" + "\n1) Cargo Plane" + "\n2) Fighter Jet");

	}
}
