package zhou.unit2;

import java.util.Scanner;

/** PrimeV2.java
 * <br><p>This program prompts the user for two numbers and displays the prime numbers in between those two numbers.
 * <br> Date created: November 4th, 2019
 * @author Sarah Zhou
 */

public class PrimeV2 {

	/**
	 * This is the entry point to the program.
	 * @param args
	 */

	public static void main(String[] args) {

		// Variables

		int num1;
		int num2;

		int minNum;
		int maxNum;

		int divNum = 2;

		//int result;
		boolean prime = true;
		int currentNum;
		int[] primes;

		Scanner sc = new Scanner(System.in);

		// Prompt for user input for the integers num1 and num2
		System.out.println("Enter the first integer.");
		num1 = sc.nextInt();
		System.out.println("Enter a second integer");
		num2 = sc.nextInt();

		// Assigns num1 and num2 into the variables minNum and maxNum depending on which is the larger integer.
		minNum = Math.min(num1, num2);
		maxNum = Math.max(num1, num2);

		currentNum = minNum;
		primes = new int[maxNum];

		do {

			do {
				if(currentNum % divNum == 0) {
					prime = false;
				}
				else{
					prime = true;
					for (int i = 0; i < maxNum-minNum; i++) {
						primes[i] = currentNum;
					}
				}
				
				divNum++;

			} while(divNum <= Math.sqrt(currentNum));

			currentNum ++;
			divNum = 2;


		} while (currentNum <= maxNum);

		System.out.println("The following prime numbers between " +minNum+ " and " +maxNum+ " are:");
		for (int i = 0; i < maxNum-minNum; i++) {
			System.out.println(primes[i]);
		}

	}
}
