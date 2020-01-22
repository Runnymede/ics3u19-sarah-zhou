package zhou.unit2;

import java.util.Scanner;

public class PowersTableBonus {

	public static void main(String[] args) {

		// Variables
		int x = 0;
		int power = 1;
		int product;

		int maxExponent;
		int maxBase;

		Scanner sc = new Scanner(System.in);

		// User input.
		System.out.println("Enter the highest exponent for the table.");
		maxExponent = sc.nextInt();
		System.out.println("Enter the highest base of the table");
		maxBase = sc.nextInt();

		System.out.println();


		//
		for (x = 1 ; x < maxBase; x++){

			System.out.println();

			for (power = 1; power < maxExponent ; power++) {
				product = (int) Math.pow(x, power);
				System.out.format("%6s", product);
			}

		}

	}

}
