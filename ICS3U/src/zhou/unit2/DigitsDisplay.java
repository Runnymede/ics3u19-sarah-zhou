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
		int userNumber; // user inputed number
	
		int numberLength;
		double printNum;
		double modValue;
		double divValue;
		int counter = 0;
		
		Scanner sc = new Scanner(System.in);
		
		/**
		 * Prompts for the users input of an integer.
		 * 
		 * eg.
		 * Enter a positive integer.
		 *     24
		 */
		System.out.println("Enter a positive integer.");
		userNumber = sc.nextInt();
		
		numberLength = String.valueOf(userNumber).length();
		modValue = Math.pow(10, numberLength);
		divValue = 1 * Math.pow(10, numberLength-1);
		counter = numberLength;
		
		while (divValue >= 1) {
			
			printNum = (int)((userNumber % modValue) / divValue);
			
			//printNum = printNum * divValue;
			
			System.out.println((int)printNum);
			
			printNum /= Math.pow(10,counter);
			
			modValue /= 10;
			divValue /= 10;
			counter ++;
			printNum --;
		}
		
	/**	do {
			System.out.println((int)(userNumber / (1 * Math.pow(10, numberLength - counter))));
			counter ++;
			
		} while ( counter < numberLength); */
		
		
		
	}
}