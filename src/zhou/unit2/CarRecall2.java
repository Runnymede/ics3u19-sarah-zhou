package zhou.unit2;

import java.util.Scanner;

/**
 * CarRecall.java This program prompts the user to input their car model number
 * and returns whether or not the car model is has a defect and must be
 * repaired. Date created: October 28th, 2019
 *
 * @author Sarah Zhou
 */

public class CarRecall2 {

	/**
	 * This is the entry point to the program.
	 *
	 * @param args
	 */

	public static void main(String[] args) {

		// Variables
		int carModel;
		boolean carDefect;

		int continueProgram = 1;

		Scanner sc = new Scanner(System.in);

		/**
		 * A do-while loop that allows users to input as many car models as they would like.
		 * Entering a model of 0 will exit the loop.
		 */
		do {

			// User input
			System.out.println("Enter your car's model number. Enter a model of 0 to exit.");
			carModel = sc.nextInt();

			if (carModel == 0) {
				continueProgram = 0;
				System.out.println("Thank you for checking your car. You are done.");
			}

			else {

				/*
				 * Determines whether the car model inputed has a defect or not by checking for the car model numbers.
				 * Each case is a different defected car model, and if the case returns true, the variable carDefect is turned to true.
				 */
				switch (carModel) {

				case (179):
					carDefect = true;

				case (189):
					carDefect = true;

				case (190):
					carDefect = true;

				case (191):
					carDefect = true;

				case (192):
					carDefect = true;

				case (193):
					carDefect = true;

				case (194):
					carDefect = true;

				case (195):
					carDefect = true;

				case (199):
					carDefect = true;

				case (221):
					carDefect = true;

				case (780):
					carDefect = true;
				break;
				default:
					carDefect = false;
					break;
				}

				System.out.println("Your car's model number is: " + carModel + ".");

				if (carDefect) {
					System.out.println("Your car is defective. It must be repaired.");
				} else {
					System.out.println("Your car is not defective. \n");
				}
			}
			// If the user last entered any number other than 0, the loop will continue.
		} while (continueProgram != 0);

	}

}
