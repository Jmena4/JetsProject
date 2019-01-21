package com.skilldistillery.jets;

import java.util.Scanner;

public class Airfield {

	private Jet[] jets = new Jet[10];
	Scanner sc = new Scanner(System.in);
	public Airfield() {
		super();
		jets[0] = new FighterJet("F-35", 1200, 1200, 85000000);
		jets[1] = new FighterJet("F-22", 1498, 1839, 150000000);
		jets[2] = new FighterJet("F-16", 1500, 2622, 18600000);
		jets[3] = new CargoPlane("C-5", 597, 7273, 224290000);
		jets[4] = new CargoPlane("C-130", 398, 2361, 30000000);
		jets[5] = new CargoPlane("C-17", 590, 6456, 218000000);

//		populateAirfield(jets);
	}

	public Airfield(String model, double speed, int range, long price) {
	}

	public void listJets() {
		for (Jet jet : jets) {
			if (jet != null) // if ( jet instanceof Jet )
			{
				System.out.println("Jet model is: " + jet.getModel() + " Max speed(MPH): " + jet.getSpeed()
						+ " Max range(Miles): " + jet.getRange() + " Price/Unit cost is($): " + jet.getPrice());

			} else {
				break;
			}

		}
	}

	public void flyJets() {
		for (Jet jet : jets) {
			if(Airfield instanceof jets) {
				
			}
//			if (jet != null) {
//				System.out.println("Jet Model " + jet.getModel() + " is Flying");
//			} else {
//				break;
//			}

		}
	}

	public void fastestJet() {
		double MAX_SPEED = jets[0].getSpeed();
		for (int j = 0; j < jets.length; j++) {
			if (jets[j] != null) {
				if (jets[j].getSpeed() > MAX_SPEED) {
					MAX_SPEED = jets[j].getSpeed();
				}
				System.out.println("Fastest aircraft is: " + "\t" + jets[j].getModel() + "\t" + jets[j].getSpeed());
				System.out.println("\tMAX_RANGE is: " + +MAX_SPEED);
			} else {
				break;
			}
		}
	}

	public void longestRange() {
		double MAX_RANGE = jets[0].getRange();
		for (int j = 0; j < jets.length; j++) {
			if (jets[j] != null) {
				if (jets[j].getRange() > MAX_RANGE) {
					MAX_RANGE = jets[j].getRange();
				}
				System.out
						.println("Longest Range aircraft is: " + "\t" + jets[j].getModel() + "\t" + jets[j].getRange());
				System.out.println("\tMAX_RANGE is: " + MAX_RANGE);
			} else {
				break;
			}
		}

	}

	public void loadCargoJets() {
		for (Jet CargoPlane : jets) {
//				if (drawable != null) { also works 
			if (CargoPlane instanceof CargoCarrier) {
				((CargoCarrier) CargoPlane).loadCargo();
				System.out.println("Loading Cargo Planes: " + "\t" + CargoPlane.getModel());

			}
		}
	}

	public void dogFight() {
//		for (Jet FighterJet : jets) {
//				if (drawable != null) { also works 
//			if (FighterJet instanceof CombatReady) {
//				((CombatReady) FighterJet).fight();
				
//				System.out.println("Dog Fighting: " + "\t" + FighterJet.getModel() + "\t" + (FighterJet.getRandomElement(FighterJet.getModel())));
						/*
						 * 
						 */
//						( (int)(Math.random()*100)
	}

	public void JetImpl() {
		JetImplNew();
	}

	private void JetImplNew() {
		for (Jet jet : jets[i]) {
			if (jets[i] == null) {
				System.out.println("Please enter an Aircraft Model type: ");
				String model = sc.next();
				
				
				System.out.println("Please enter an Aircraft Speed: ");
				double speed = sc.nextDouble();
				
				System.out.println("Please enter an Aircraft Range: ");
				int range = sc.nextInt();
				
				System.out.println("Please enter an Aircraft Price");
				long price = sc.nextLong();
				
				System.out.print(jet.setModel(model));
			}
			
			
			
		}
		
		
		sc.close();
		
	}
}