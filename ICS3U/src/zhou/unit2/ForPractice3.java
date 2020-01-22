package zhou.unit2;

/** ForPractice.java
 * <p> This program counts down from 10 to 1, then prints "Blast off!", with delays of one second between each print statement.
 * <br> Date created: November 11, 2019.
 * @author Sarah Zhou
 *
 */

public class ForPractice3 {
	/**
	 * This is the entry point to the program
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		// Prints out the numbers from 10 to 1 with a one second interval between each print.
		for (int i = 10 ; i > 0 ; i--) {
			System.out.println(i);
			Thread.sleep(1000);
		}
		// Outputs "Blast off!"
		System.out.println("Blast off!");
	}
}
