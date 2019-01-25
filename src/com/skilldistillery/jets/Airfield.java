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

//		System.out.println();
	}

	public Airfield(String model, double speed, int range, long price) {
	}

	public void listJets() {
		for (Jet jet : jets) {
			if (jet instanceof Jet) {
				System.out.println(jet.toString());

			} else {
				break;
			}
		}
	}

	public void flyJets() {
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] instanceof Jet) {
				System.out.println("Jet model " + jets[i].toString() + " is flying");
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
				System.out.println("Loading Cargo Planes: " + "\t" + jet.toString());
			}
		}
	}

	public void dogFight() {
		for (Jet jet : jets) {
			if (jet instanceof FighterJet) {
				((FighterJet) jet).fight();
				System.out.print("Dog Fighting: " + "\t" + jet.toString() + " ");
				System.out.println((Character.toChars(0x1F680)));

			}
		}
	}

	public void addANewJet(Scanner sc, int choice) {
		int j;

		for (j = 0; j < jets.length; j++) {
			Jet addANewJet = jets[j];
			if (jets[j] == null) {
				System.out.print("\nList Options(1-8):\n" + "\n1)CargoPlane: " + "\n2)FighterJet ");
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					addANewJet = new CargoPlane();
					break;
				case 2:
					addANewJet = new FighterJet();
					break;

				default:
					addANewJet = new JetImplNew("C-17", 590, 6456, 218000000); // Test values for
					break;
				}
				System.out.print("Please enter a Jet Aircraft Model: ");
				String model = sc.next();
				addANewJet.setModel(model);

				System.out.print("Please enter an Aircraft Speed: ");
				double speed = sc.nextDouble();
				addANewJet.setSpeed(speed);

				System.out.print("Please enter an Aircraft Range: ");
				int range = sc.nextInt();
				addANewJet.setRange(range);

				System.out.print("Please enter an Aircraft Price");
				long price = sc.nextLong();
				addANewJet.setPrice(price);

				jets[j] = addANewJet;

				System.out.println("I parked the new " + " " + addANewJet.toString());
				break;
			}
		}
	}
}
