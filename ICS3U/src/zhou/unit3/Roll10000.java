package zhou.unit3;

/**
 * <p> This program simulates rolling two six-sided dice, keeping track of their total; this repeats 10,000 times.
 * The program will output the totals and the number of times that the totals were rolled.
 * <br> Date created: November 25, 2019
 * @author Sarah Zhou
 */

public class Roll10000 {

	/**
	 * This is the entry point to the program.
	 * @param args
	 */
	public static void main(String[] args) {

		// Variables
		int roll1;
		int roll2;
		int total;

		int[] totals = new int[10000-1];
		for (int i = 10000 ; i > 0 ; i--) {
			roll1 = (int) (Math.random()*6 + 1);
			roll2 = (int) (Math.random()*6 + 1);
			total = roll1 + roll2;
			if (total == 2) {
				totals[0] += 1;
			}
			if (total == 3) {
				totals[1] += 1;
			}
			if (total == 4) {
				totals[2] += 1;
			}
			if (total == 5) {
				totals[3] += 1;
			}
			if (total == 6) {
				totals[4] += 1;
			}
			if (total == 7) {
				totals[5] += 1;
			}
			if (total == 8) {
				totals[6] += 1;
			}
			if (total == 9) {
				totals[7] += 1;
			}
			if (total == 10) {
				totals[8] += 1;
			}
			if (total == 11) {
				totals[9] += 1;
			}
			if (total == 2) {
				totals[10] += 1;
			}
		}

		// Output
		System.out.format("%-6s %6s", "Total" , "Times Rolled");
		System.out.println();
		for (int i = 2; i <=12 ; i++) {
			System.out.format("%-4s %9s", i , totals[i-2]);
			System.out.println();
		}
	}
}
