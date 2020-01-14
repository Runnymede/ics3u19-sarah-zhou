package zhou.unit2;

/** PowersTable.java
 * This program displays a table of powers.
 * Date created: November 11, 2019
 * @author Sarah Zhou
 */

public class PowersTable {
	/**
	 *This is the entry point to the program
	 * @param args
	 */
	public static void main(String[] args) {

		// Variables
		int x = 0;
		int power = 1;
		int product;

		//		// Formats the doubles from Math.pow() into integers.
		//		DecimalFormat print = new DecimalFormat("######.#");

		// Formatted table headers.
		System.out.format("%6s %5s %5s %5s %5s", "x^1", "x^2", "x^3", "x^4", "x^5");

		// Loops the following code 6 times.
		for (int i = 1 ; i < 7; i++) {

			// Stores the current value of i into the variable x — which will increase by one every time into the loop.
			x = i;
			System.out.println();

			for (power = 1; power < 6 ; power++) {
				product = (int) Math.pow(x, power);
				System.out.format("%6s", product);

			}
		}


	}

}