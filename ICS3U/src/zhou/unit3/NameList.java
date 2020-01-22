package zhou.unit3;

import java.util.Scanner;

/** NameList.java
 * <p> This program reads a list of names from the user, then outputs the list twice.
 * First in the order of the input, then in the reverse order.
 * <br> Date created: November 23rd, 2019
 *
 * @author Sarah Zhou
 */

public class NameList {

	/**
	 * This is the entry point to the program.
	 * @param args
	 */

	public static void main(String [] args) {

		// Variables
		int length;

		Scanner sc = new Scanner(System.in);

		// User input for how many names on the list
		System.out.println("How many names will be on the list?");
		length = sc.nextInt();

		String[] names = new String[length];

		// User input for the names
		System.out.println("Enter the list of names. Press 'Enter' key after each name.");

		for (int i = 0; i < names.length; i++) {
			names[i] = sc.next();
		}

		// First output: The names in the order of the input.
		System.out.println("Inputed names in order:");
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

		// Second output: the names in the reverse order of the input.
		System.out.println();
		System.out.println("Inputed names in reverse order:");
		for (int i = names.length-1; i >= 0; i--) {
			System.out.println(names[i]);
		}

	}
}
