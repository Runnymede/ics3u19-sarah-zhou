package zhou.unit2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Printing.java This program prompts the users for the number of copies that
 * they would like to print, then returns the price per copy and total cost
 * depending. Date created: October 3rd, 2019
 * 
 * @author Sarah Zhou
 */

public class Printing {

	/**
	 * This is the entry point to the program.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		// Variables
		int copies;
		double copyPrice;
		double totalCost;
		DecimalFormat priceFormat = new DecimalFormat("$##,###,###.00");

		Scanner sc = new Scanner(System.in);

		// User input
		System.out.println("How many copies would you like to print?");
		copies = sc.nextInt();

		// Determines the price per copy depending on the number of copies wanted.
		if (copies > 1000) {
			copyPrice = 0.25;
		} else if (copies > 749) {
			copyPrice = 0.26;
		} else if (copies > 499) {  
			copyPrice = 0.27;
		} else if (copies > 99) {
			copyPrice = 0.28;
		} else {
			copyPrice = 0.30;
		}
		
		totalCost = copies * copyPrice;

		System.out.println("The price per copy is: " + priceFormat.format(copyPrice) + ". The total cost is: " + priceFormat.format(totalCost) +".");
	}

}
