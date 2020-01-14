package zhou.unit2;

import java.util.Scanner;

/** NumberCheck.java
 * This program prompts the user for an integer, then determines and returns whether it is positive or negative and if it is divisible by seven.
 * Date Created: October 2nd, 2019
 * @author Sarah Zhou
 */

public class NumberCheck {
	
	/**
	 * This is the entry point to the program.
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		// Variables
		int inputNumber;
		double divisible7;
		
		Scanner sc = new Scanner(System.in);
		
		// User input
		System.out.println("Input a mathematical integer (whole number).");
		inputNumber = sc.nextInt();
		
		// Calculates if the number is divisible by 7.
		divisible7 = inputNumber % 7;
		
		// Prints results depending on the values of inputNumber and divisible7.
		if (inputNumber == 0) {
			System.out.println("The number 0 is neither positive nor negative.");
		}
		
		if (inputNumber < 0) {
			System.out.println("The number " + inputNumber + " is a negative number.");
		}
		if (inputNumber > 0) {
			System.out.println("The number " + inputNumber + " is a positive number.");
		}
		if (divisible7 == 0) {
			System.out.println(inputNumber + " is also divisible by 7.");
		}
		else {
			System.out.println(inputNumber + " is not divisible by 7.");
		}
		
	}

}
