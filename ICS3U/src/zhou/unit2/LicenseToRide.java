package zhou.unit2;

/**LicenseToRide.java
 * <p> This program solves the License to Ride problem from Waterloo's Problem of the Week.
 * <br> This program solves the License to ride problem by using a single for-loop.
 * <br>Date created: November 14, 2019
 * @author Sarah Zhou
 */

public class LicenseToRide {

	/**
	 * This is the entry point to the program.
	 * @param args
	 */
	public static void main(String[] args) {

		// Variables

		double totalNumbers = Math.pow(10, 4);
		String numberSet;
		int numLength;
		char numChar;
		int sum = 0;
		int number;
		int over34 = 0;
		int counter = 0;
		double percentage;


		/*
		 * Nested loops (while loop inside of for loop) for determining the number of possible combinations of four-digit numbers (0-9).
		 * Also determines how many of those combinations are equal to or greater than 34.
		 */

		//
		for (int num = 9999; num >= 0 ; num--) {
			// Convert the variable num into the String numberSet
			numberSet = String.valueOf(num);
			// Get the length of numberSet and store it into numLength
			numLength = numberSet.length();

			// Takes each individual character in numberSet, turns it into a number, then adds it into the variable sum.
			while (counter < numLength) {
				numChar = numberSet.charAt(counter);
				number = Character.getNumericValue(numChar);
				sum += number;
				counter ++;
			}

			// If the sum of the number is greater than or equal to 34, add one to the counter over34.
			if (sum >= 34) {
				over34 ++;
			}
			// Resets sum and counter to 0 for the next time going through the loop.
			sum = 0;
			counter = 0;
		}

		// Converts the result of over34 into a percentage.
		percentage = over34 / totalNumbers * 100;

		// Output.
		System.out.print("There are " + over34 + " posssible combinations of four digit numbers that are equal to or over 34. \n"
				+ "This means that the percentage of four digit numbers equal to or greater than 34 is " + percentage + "%.");

	}

}
