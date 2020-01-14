package zhou.unit2;

import java.util.Scanner;

/**DigitsDisplay.java
 * <br> This program prompts the user for a non-negative integer and then displays each digit on a separate line.
 * <br> Date created: October 29nd, 2019
 * @author Sarah Zhou
 */

public class DigitsDisplay {

	public static void main(String[] args) {

		// Variables
		int userNumber;

		int numberLength;
		double num;
		double modValue;
		double divValue;
		int counter = 0;

		Scanner sc = new Scanner(System.in);

		// User input.
		System.out.println("Enter a positive integer.");
		userNumber = sc.nextInt();

		// Determines the length of the variable userNumber and stores it into the variable numberLength.
		numberLength = String.valueOf(userNumber).length();

		// Determines the value to modulus userNumber by; ten to the power of the numberLength.
		modValue = Math.pow(10, numberLength);

		// Determines the value to divide by.
		divValue = 1 * Math.pow(10, numberLength - 1);

		// Sets counter to the same value as numberLength.
		counter = numberLength;

		// While loop that runs until the dividing value (divValue) is greater than or equal to one.
		while (divValue >= 1) {

			num = (int)((userNumber % modValue) / divValue);

			System.out.println((int) num);

			num /= Math.pow(10, counter);

			modValue /= 10;
			divValue /= 10;
			counter ++;
			num --;
		}

	}
}