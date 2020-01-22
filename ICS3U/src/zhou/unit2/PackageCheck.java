package zhou.unit2;

import java.util.Scanner;

/** PackageCheck.java
 * This program prompts the user for the dimensions of their package, and prints out a message if the package is too heavy, large, both, or can be accepted.
 * Date created: October 15, 2019
 * @author Sarah Zhou
 */
public class PackageCheck {
	
	/**
	 * This is the entry point to the program.
	 * @param args
	 */

	public static void main(String[] args) {
		
		// Variables
		double packageWeight;
		double packageLength;
		double packageWidth;
		double packageHeight;
		double packageVolume;
		
		int maxWeight = 27;
		double maxVolume = 100000; // 0.1 cubic meters = 100000 cubic centimeters
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Delivery Service: Package Checker. \nCheck to see if your package is too large / heavy and will thus not be shipped.\n");
		
		// User input
		System.out.println("Enter the weight of the package in kilograms.");
		packageWeight = sc.nextDouble();
		System.out.println("Enter the length of the package in centimeters.");
		packageLength = sc.nextDouble();
		System.out.println("Enter the width of the package in centimeters.");
		packageWidth = sc.nextDouble();
		System.out.println("Enter the height of the volume in centimeters.");
		packageHeight = sc.nextDouble();
		
		packageVolume = packageLength * packageWidth * packageHeight;
		
		// Prints out user input
		System.out.println("Results:\nPackage Weight: " + packageWeight + "kg\nPackage Length: " + packageLength + "cm\nPackage Width: " + packageWidth +
		"cm\nPackageHeight: " + packageHeight + "cm\nPackage Volume: " + packageVolume + " cubic centimeters\n");
		
		// Prints results- whether or not the package will be accepted for delivery and why not.
		if (packageWeight > maxWeight && packageVolume > maxVolume) {
			System.out.println("Your package will not be delivered. It is too heavy and too large. Its weight cannot exceed 27kg and its volume cannot exceed 0.1 cubic meters / 100,000 cubic centimeters.");
		}
		else if(packageWeight > maxWeight) {
			System.out.println("Your package will not be delivered. It is too heavy. Its weight cannot exceed 27kg.");
		}
		else if (packageVolume > maxVolume) {
			System.out.println("Your package will not be delivered. It is too large. Its volume cannot exceed 0.1 cubic meters / 100,000.0 cubic centimeters.");
		}
		else {
			System.out.println("Your package will be accepted for delivery!");
		}

	}

}
