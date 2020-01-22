package zhou.unit1;

import java.util.Scanner;

/**Quadratic.java
 * This program prompts the user for the values a, b, and c of the quadratic formula and returns the two possible values for x in said formula.
 * Date created: September 30, 2019
 * @author Sarah Zhou
 */
public class Quadratic {

	/**
	 * This is the entry point to the program.
	 * @param args
	 */

	public static void main(String[] args) {

		// Variables
		double aValue;
		double bValue;
		double cValue;
		double x1Value;
		double xDivide;
		double x2Value;

		// User input
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number as the 'a' value.");
		aValue = sc.nextDouble();
		System.out.println("Input a number as the 'b' value.");
		bValue = sc.nextDouble();
		System.out.println("Input a number as the 'c' value.");
		cValue = sc.nextDouble();

		// Calculates the value of 'a' times 2, to be divided later.
		xDivide = 2 * aValue;

		// Calculates the first possible value for x.
		x1Value = Math.sqrt((bValue*bValue)- 4 * aValue * cValue);
		x1Value = -bValue + x1Value;
		x1Value = x1Value / xDivide;

		// Calculates the second possible value for x.
		x2Value = Math.sqrt((bValue*bValue) - 4 * aValue * cValue);
		x2Value = -bValue - x2Value;
		x2Value = x2Value / xDivide;

		System.out.println("The value of x1 is " + x1Value);
		System.out.println("The value of x2 is " + x2Value);
	}

}
