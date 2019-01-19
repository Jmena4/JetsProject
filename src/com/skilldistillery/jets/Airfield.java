package com.skilldistillery.jets;


public class Airfield extends Jet{
	
	private Jet[] jets = new Jet[10];
	
	public Airfield() {
		super();
		jets[0] = new FighterJet("F-35", 1200, 1200, 85000000);
		jets[1] = new FighterJet("F-22", 1498, 1839, 150000000);
		jets[2] = new FighterJet("F-16", 1500, 2622, 18600000);
		jets[3] = new CargoPlane("C-5", 597, 7273, 224290000);
		jets[4] = new CargoPlane("C-130", 398, 236, 30000000);
		
	
		populateAirfield(jets);
	}

	private void populateAirfield(Jet[] jets) {
		for (Jet jet : jets) {
			if (jet != null)
//			if ( jet instanceof Jet ) 
			{
				System.out.println("Jet model is: " + jet.getModel() + " Max speed: " + jet.getSpeed() + " Max range: " + jet.getRange() + " Price/Unit cost is: " + jet.getPrice());
				
			} else {
				break;
			}
		}
	}


}
