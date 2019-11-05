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
		int sum =0;
		int numberLength;
		int counter = 0;
		
		Scanner sc = new Scanner(System.in);

		// User input
		System.out.println("Enter a positive integer.");
		userNumber = sc.nextInt();
		
		
		numberSet = String.valueOf(userNumber);
		numberLength = numberSet.length();
		
		
		do {
			numChar = numberSet.charAt(counter);
			number = Character.getNumericValue(numChar);
			sum += number;
			counter ++;
		} while(counter < numberLength);
		
		System.out.println("The sum of the digits in " + userNumber + " is " + sum + ".");
	}

}
