package zhou.unit2;

import java.util.Scanner;

/**GuessingGame.java
 * <p> This program generates a random number form 1-20, then prompts the user to guess the number.
 * <br> It will display whether or not the user guessed correctly or not.
 * <br> Date created: October 22nd, 2019
 * @author Sarah Zhou
 */

public class GuessingGame {


	/**
	 * This is the entry point to the program.
	 * @param args
	 */
	public static void main(String[] args) {

		// Variables
		int number = (int) (Math.random()*20)+1;
		int userNumber;

		Scanner sc = new Scanner(System.in);

		// User input
		System.out.println("Try to guess the number I'm thinking of! \nEnter an integer from 1 - 20.");
		userNumber = sc.nextInt();

		// Outputs that the user has won if the number inputed is the same as the randomly generated number.
		if (number == userNumber) {
			System.out.println("You won! \nThe number was: " + number + ".");
		}
		// If the user's inputed number does not match the randomly generated number, output the randomly generated number.
		else {
			System.out.println("Your number: " + userNumber + "\nMy number: " + number + "\nBetter luck next time!");
		}

	}

}