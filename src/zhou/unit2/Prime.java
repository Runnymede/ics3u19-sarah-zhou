package zhou.unit2;

import java.util.Scanner;

/** Prime.java
 * <br><p>This program prompts the user for a number and will state whether or not the inputed number is a prime number or not.
 * <br> Date created: November 4th, 2019
 * @author Sarah Zhou
 */

public class Prime {

	/**
	 * This is the entry point to the program.
	 * @param args
	 */

	public static void main(String[] args) {

		// Variables

		int userNum;
		int divNum = 2;
		boolean prime = true;

		Scanner sc = new Scanner(System.in);

		// Prompt for user input of an integer
		System.out.println("Enter an integer.");
		userNum = sc.nextInt();

		if (userNum == 0 || userNum == 1) {
			System.out.println("The number inputed, " + userNum + ", is not a prime number.");	
		}
		
		else if (userNum ==2) {
			System.out.println("The number inputed, " +userNum+ ", is a prime number.");
		}
		
		else {
			do {
				if(userNum % divNum == 0) {
					prime = false;
				}
				else {
					prime = true;
				}

				divNum ++;

			} while(divNum <= Math.sqrt(userNum));

			/**
			 * If the variable prime is set to true, than display to the user that the number inputed was a prime number.
			 * Otherwise, display that it was not a prime number.
			 */
			if (prime) {
				System.out.println("The number inputed, " + userNum + ", is a prime number.");	
			}
			else {
				System.out.println("The number inputed, " + userNum + ", is not a prime number.");
			}
		}
	}

}
