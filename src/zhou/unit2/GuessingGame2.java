package zhou.unit2;

import java.util.Scanner;

/**GuessingGame.java
 * <p> This program generates a random number form 1-20, then prompts the user to guess the number.
 * <br> It will display whether or not the user guessed correctly or not.
 * <br> Date created: October 28th, 2019
 * @author Sarah Zhou
 */

public class GuessingGame2 {


	/**
	 * This is the entry point to the program.
	 * @param args
	 */
	public static void main(String[] args) {

		// Variables
		int number = (int) (Math.random()*20)+1;
		int userNumber;

		boolean win = false;
		int counter = 0;

		Scanner sc = new Scanner(System.in);



		// User input
		System.out.println("Try to guess the number I'm thinking of! \nEnter an integer from 1 - 20.");
		userNumber = sc.nextInt();

		do {
			if (number == userNumber) {
				counter ++;
				System.out.println("You won! \nThe number was: " + number + ". \nIt took you " + counter + " tries!");
				win = true;
			}
			else {
				counter ++;
				System.out.println("Incorrect! Guess again!\nNumber of tries so far: " + counter + "\nTry again: ");
				userNumber = sc.nextInt();
			}

		} while (win == false);
	}

}
