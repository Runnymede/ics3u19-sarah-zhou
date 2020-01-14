package zhou.unit2;

import java.util.Scanner;

/** Necklace.java
 * <p> This program prompts the user for two single digit integers then 10 then solves and outputs the necklace problem with the two numbers using a loop.
 * <br> Date created: November 6th, 2019
 *
 * @author Sarah Zhou
 */

public class Necklace {

	/**
	 * This is the entry point to the program.
	 *
	 * @param args
	 */

	public static void main(String[] args) {

		// Variables
		int num1;
		int num2;

		int check1;
		int check2;

		int numA;
		int numB;
		int numC;

		Scanner sc = new Scanner(System.in);

		// User input prompt.
		System.out.println("Enter an integer less than 10.");
		num1 = sc.nextInt();
		System.out.println("Enter an integer less than 10.");
		num2 = sc.nextInt();

		// Assigns the user inputed values into the variables numA and numB.
		numA = num1;
		numB = num2;

		// Prints out num1 and num2
		System.out.print(num1 + " " + num2);

		// Loop
		do {

			// Adds the values of the variables numB and numA and stores it into the variable numC.
			numC = numB + numA;
			numC = numC % 10;

			System.out.print(" " + numC + " ");

			numA = numB;
			numB = numC;


		} while (numA != num1 || numB != num2); //
		System.out.println(" — Necklace done!");
	}

}
