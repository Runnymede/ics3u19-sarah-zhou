package zhou.unit2;

import java.util.Scanner;

/**GuessingGame.java
 * This program generates a random number form 1-20, then prompts the user to guess the number. It will display whether or not the user guessed correctly or not.
 * Date created: October 22nd, 2019
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
		
		if (number == userNumber) {
			System.out.println("You won! \nThe number was: " + number + ".");
		}
		else {
			System.out.println("Your number: " + userNumber + "\nMy number: " + number + "\nBetter luck next time!");
		}

	}

}