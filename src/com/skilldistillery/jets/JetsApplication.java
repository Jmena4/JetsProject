package com.skilldistillery.jets;

import java.util.Scanner;

public class JetsApplication {
	public JetsApplication() {

	}

	public static void main(String[] args) {

		/* make private Scanner? */
		Scanner sc = new Scanner(System.in);
		JetsApplication app = new JetsApplication();
		app.launchProgram(sc);

		sc.close();
	}

	public void launchProgram(Scanner sc) {
		Airfield afb = new Airfield();
		int choice;
		do {
			displayUserMenu();

			choice = sc.nextInt();
			switch (choice) {
			case 1:
				afb.listJets();
				break;
			case 2:
				afb.flyJets();

				break;
			case 3:
				afb.fastestJet();
				break;
			case 4:
				afb.longestRange();
				break;
			case 5:
				afb.loadCargoJets();
				break;
			case 6:
				afb.dogFight();
				break;
			case 7:

				afb.addANewJet(choice);
				break;
			case 8:

				break;
			default:

			}
//			go = true;
		} while (choice != 8);
		System.out.println("Quiting...");
	}

	private void displayUserMenu() {
		System.out.print("\nList Options(1-8):\n" + "\n1) List fleet\n" + "2) Fly all jets\n" + "3) View fastest jet\n"
				+ "4) View jet with longest range\n" + "5) Load all Cargo Jets\n" + "6) Dogfight!\n"
				+ "7) Add a jet to Fleet\n" + "8) Quit\n");
	}
}