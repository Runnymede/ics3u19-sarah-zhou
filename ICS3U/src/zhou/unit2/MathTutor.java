package zhou.unit2;

import java.util.Scanner;
import java.text.DecimalFormat;

/** MathTutor.java
 * This program generates two random numbers and a random operator as a math question, and then prompts the user for the answer.
 * Date created: October 24, 2019
 * @author Sarah Zhou
 */

public class MathTutor {
	
	/**
	 * This is the entry point to the program.
	 * @param args
	 */

	public static void main(String[] args) {
		
		// Variables
		double num1 = (int) (Math.random()*10 + 1);
		double num2 = (int) (Math.random()*10 + 1);
		int operator = (int) (Math.random()*4);
		double answer;
		double userAnswer;
		char operatorSymbol;
		DecimalFormat numberFormat = new DecimalFormat("#,###.##");
		
		Scanner sc = new Scanner(System.in);
		
		
		// Assigns answers and an operator symbol based on the random number generated from the variable operator
		if (operator == 0) {
			answer = num1 - num2;
			operatorSymbol = '-';
		}
		else if (operator == 1) {
			answer = num1 + num2;
			operatorSymbol = '+';
		}
		else if (operator == 2) {
			answer = num1 * num2;
			operatorSymbol = '*';
		}
		else {
			answer = num1 / num2 * 100;
			answer = Math.rint(answer) / 100;
			operatorSymbol = '/';
		}
		
		// User input
		System.out.println("What is " + numberFormat.format(num1) + operatorSymbol + numberFormat.format(num2) + "?");
		userAnswer = sc.nextDouble();
		
		// Displays different message if user's answer matches the math answer
		if (userAnswer != answer) {
			System.out.println("Incorrect! The answer is: " + numberFormat.format(answer));
		}
		else if (userAnswer == answer) {
			System.out.println("Correct!");
		}
	}

}
