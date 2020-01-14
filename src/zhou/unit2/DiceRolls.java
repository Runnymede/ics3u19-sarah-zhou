package zhou.unit2;

/** DiceRolls.java
 * This program displays five random rolls from two six-sided dice, also showing the total for each roll.
 * Date created: November 12, 2019
 * @author Sarah Zhou
 */
public class DiceRolls {

	/**
	 * This is the entry point to the program.
	 * @param args
	 */
	public static void main(String[] args) {

		// Variables
		int die1;
		int die2;
		int total;

		// Header for the table.
		System.out.format("%-6s %-6s %-6s", "Dice 1", "Dice 2", "Total");

		/*
		 * For-loop to generate and print the random rolls from two dice, six times.
		 * Prints out the the individual rolls of each dice as well as the total of the two rolls.
		 */
		for (int i = 0; i < 6 ; i++) {
			die1 = (int) (Math.random()*6 + 1);
			die2 = (int) (Math.random()*6 + 1);
			total = die1 + die2;
			System.out.println();
			System.out.format("%3s %6s %6s", die1, die2, total);
		}
	}


}
