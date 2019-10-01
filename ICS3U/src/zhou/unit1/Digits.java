package zhou.unit1;

import java.util.Scanner;

/**Digits.java
 * This program prompts the user for a number between 0 and 999 and returns the number in hundreds, tens, and ones separately.
 * Date created: September 30th, 2019
 * @ author Sarah Zhou
 */

public class Digits {

	/**
	 * This is the entry point to the program.
	 * @param args
	 */

	public static void main(String[] args) {

		int inputNumber ;
		int hundredsNumber;
		int tensNumber;
		int onesNumber;

		Scanner sc = new Scanner(System.in);

		System.out.println("Input a whole number between 0 and 999.");
		inputNumber = sc.nextInt();

		if (inputNumber>999) {
			System.out.println(inputNumber + " is not less than 999.");
		}

		else {
			hundredsNumber = inputNumber / 100;
			tensNumber = (inputNumber - hundredsNumber*100) / 10;
			onesNumber = (inputNumber - hundredsNumber*100 - tensNumber*10);

			System.out.println(inputNumber);
			System.out.println("Hundreds: " + hundredsNumber);
			System.out.println("Tens: " + tensNumber);
			System.out.println("Ones: " + onesNumber );
		}


	}

}
