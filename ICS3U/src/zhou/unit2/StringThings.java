package zhou.unit2;

import java.util.Scanner;

/** StringThings.java
 * This program:
 * 	-
 * Date created: October 8th, 2019
 * @author Sarah Zhou
 */

public class StringThings {
	/**
	 * This is the entry point to the program.
	 * @param args
	 */

	public static void main(String[] args) {

		//Variables
		String word1;
		int index;
		String word2;
		String word3;
		String trueUsername = "Cup o Java";
		String truePassword = "withsugar";
		String userUsername;
		String userPassword;

		Scanner sc = new Scanner(System.in);

		// User input
		System.out.println("Enter a word that is more than seven characters in length.");
		word1 = sc.nextLine();

		System.out.println("Your word is: " + word1);
		System.out.println("Your word in upper case is: " + word1.toUpperCase());
		System.out.println("Your word in lower case is: " + word1.toLowerCase());
		System.out.println("The length of the word is: " + word1.length() + " characters");
		System.out.println("The character at index 6 of your word is: " + word1.charAt(6));

		// bonus- have user enter which index to print
		System.out.println("Input an index number you would like to see for your word.");
		index = sc.nextInt();
		System.out.println("The letter at index " + index + " is " + word1.charAt(index));
		sc.nextLine();

		System.out.println();

		// User input
		System.out.println("Enter two words separately.");
		sc.hasNextLine();
		word2 = sc.nextLine();
		sc.hasNextLine();
		word3 = sc.nextLine();

		System.out.println("The two words entered were: " + word2 + " and " + word3 + ".");
		if (word2.equals(word3)) {
			System.out.println("The words " + word2 + " and " + word3 + " are the same.");
		}
		else{
			System.out.println("The words " + word2 + " and " + word3 + " are not the same.");
		}
		if (word2.compareTo(word3) < 0) {
			System.out.println("In ASCII, the word " + word2 + " comes before the word " + word3 + ".");
		}
		else if (word2.compareTo(word3) > 0){
			System.out.println("In ASCII, the word " + word2 + " comes after the word " + word3 + ".");
		}
		else if (word2.equals(word3)){
			System.out.println("The words " + word2 + " and " + word3 + " are the same.");
		}

		System.out.println();

		// User input
		System.out.println("Enter username.");
		userUsername = sc.nextLine();
		System.out.println("Enter password.");
		sc.hasNextLine();
		userPassword = sc.nextLine();

		if (userUsername.equals(trueUsername) && userPassword.equals(truePassword)) {
			System.out.println("Welcome, " + trueUsername + "!!");
		}
		else {
			System.out.println("Access denied.");
			if (! userUsername.equals(trueUsername)) {
				System.out.println("The username is incorrect.");
			}
			if (! userPassword.equals(truePassword)) {
				System.out.println("The password is incorrect.");
			}
		}
	}
}
