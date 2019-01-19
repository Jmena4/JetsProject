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
//		jetApplication();

		sc.close();
	}

	public void launchProgram(Scanner sc) {
		
		System.out.println("\n1) List fleet\n" + "2) Fly all jets\n" + "3) View fastest jet\n" + "4) View jet with longest range\n" + "5) Load all Cargo Jets\n" + "6) Dogfight!\n" + "7) Add a jet to Fleet\n" + "8) Quit\n");
		displayUserMenu();

		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			Airfield afb = new Airfield();

			break;
		case 2:
			Airfield afb1 = new Airfield();
			afb1.fly();
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			
			break;
		case 6:
			
			break;
		case 7:
			
			break;
		case 8:
			
			break;
		default:

		}

	}

	private void displayUserMenu() {
		System.out.println("Tester Menu");
	}
}