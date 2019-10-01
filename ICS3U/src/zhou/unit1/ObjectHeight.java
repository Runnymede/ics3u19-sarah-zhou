package zhou.unit1;

import java.util.Scanner;

/**ObjectHeight.java
 * This program prompts the user for a time less than 4.5 seconds and returns the height of an object in meters.
 * Date created: September 23rd, 2019.
 * @author Sarah Zhou
 */

public class ObjectHeight {

	/**
	 * This is the entry point to the program.
	 * @param args
	 */

	public static void main(String[] args) {

		double objectHeight = 0;

		double time = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a time less than 4.5 seconds.");
		time = sc.nextDouble();

		if (time>4.5) {
			System.out.println(time + " is not less than 4.5 seconds.");

		}
		else {
			objectHeight = 100 - 2.9 * time * time;

			System.out.println("The height of the object is " + objectHeight + " meters.");
		}

	}

}
