package zhou.unit2;

import java.util.Scanner;

/** DigitsSum.java
 * <br>This program prompts the user for an integer then outputs the sum of the digits in the integer.
 * <br> Date created: October 29th, 2019
 * @author Sarah Zhou
 */
public class DigitsSum {


	public static void main(String[] args) {

		// Variables
		int userNumber;
		int number = 0;
		String numberSet;
		char numChar;
		int sum = 0;
		int numberLength;
		int counter = 0;

		Scanner sc = new Scanner(System.in);

		// User input
		System.out.println("Enter a positive integer.");
		userNumber = sc.nextInt();

		// Converts userNumber into a String stored into the variable numberSet.
		numberSet = String.valueOf(userNumber);

		// Determines the length of the String numberSet and stores it into the variable numberLength.
		numberLength = numberSet.length();

		/*
		 * Do-while loop that loops while the counter is less than the numberLength.
		 * Gets each individual character from the number by using the String numberSet.
		 * Converts the character into its numeric value.
		 * Accumulates the numbers from each run through the loop into the variable sum.
		 * increases the counter.
		 */
		do {
			numChar = numberSet.charAt(counter);
			number = Character.getNumericValue(numChar);
			sum += number;
			counter ++;
		} while (counter < numberLength);

		// Output displaying the sum of the digits of the user's inputed number.
		System.out.println("The sum of the digits in " + userNumber + " is " + sum + ".");
	}

}
