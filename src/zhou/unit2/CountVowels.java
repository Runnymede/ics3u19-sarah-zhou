package zhou.unit2;

import java.util.Scanner;

/** CountVowels.java
 * <p> This program prompts the user for a String then outputs the number of vowels that are in the String.
 * <br> Date created: November 12, 2019
 * @author Sarah Zhou
 */
public class CountVowels {

	public static void main(String[] args) {
		// Variables
		String userString;
		int length;
		char letter;
		int counter = 0;

		Scanner sc = new Scanner(System.in);

		// User input
		System.out.println("Enter some text, I'll tell you how many vowels there are in it!");
		userString = sc.nextLine();
		length = userString.length();

		// For loop set to run the same number of times the length of the String userString is.
		for (int i = 1 ; i < length ; i++) {
			letter = userString.charAt(i);

			// Switch checking the variable letter, if it is any of the five vowels, it will add one to the counter and break out of the loop.
			switch (letter) {
			case 'a':
				counter ++;
				break;
			case 'e':
				counter ++;
				break;
			case 'i':
				counter ++;
				break;
			case 'o':
				counter ++;
				break;
			case 'u':
				counter ++;
				break;
			}
		}
		System.out.println("The number of vowels in the string '" + userString + "' is " + counter + ".");
	}

}
