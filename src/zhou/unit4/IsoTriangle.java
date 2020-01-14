package zhou.unit4;

import java.util.Scanner;

/** IsoTriangle.java
 * <p>This program gets a number from the user, then prints out an Isotriangle that is the height of the number inputed from the user.
 * <b> Example output, userNumber = 4:
 * <b>   *
 * <b>  ***
 * <b> *****
 * <b>*******
 * <b> Date created: December 17, 2019
 * @author Sarah Zhou
 *
 */

public class IsoTriangle {


	public static void main(String[] args) {


		int userNumber;
		int spaceNumber;
		int drawNumber;
		boolean done  = false;

		Scanner sc = new Scanner(System.in);

		// User input.
		System.out.println("Input an integer.");
		userNumber = sc.nextInt();

		spaceNumber = userNumber;
		drawNumber = 1;

		while (!done) {
			drawSpaces(spaceNumber);
			draws(drawNumber);

			spaceNumber --;
			drawNumber += 2;

			if (spaceNumber <=0) {
				done = true;
			}
		}
	}

	/**
	 * This method prints out the number of spaces as specified with the parameter spaces.
	 * @param spaces
	 */
	public static void drawSpaces(int spaces) {
		for (int x = 0; x < spaces; x++) {
			System.out.print(" ");
		}
	}

	/**
	 * This method prints out the number of stars.
	 * @param symbolMax
	 */
	public static void draws(int symbolMax) {

		for (int i = 0 ; i < symbolMax ; i++) {
			System.out.print("*");
		}
		System.out.println();

	}

}
