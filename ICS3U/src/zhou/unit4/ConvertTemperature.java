package zhou.unit4;
import java.util.Scanner;

/**
 * <p> This program asks the user whether they want to convert from Fahrenheit.
 * <b> Date created: December 18, 2019
 * @author Sarah Zhou
 */

public class ConvertTemperature {

	public static void main(String[] args) {

		int conversion;
		double input;

		Scanner sc = new Scanner(System.in);

		// User input
		System.out.println("How would you like to convert? Enter the number that applies: \n 0 - Fahrenheit --> Celsius \n 1 - Celsius --> Fahrenheit");
		conversion = sc.nextInt();

		System.out.println("Enter the number you wish to convert to the other.");
		input = sc.nextDouble();

		if (conversion == 0) {
			System.out.println(input + "° Fahrenheit in Celsius is: " + fahrenheitToCelsius(input) + "°C.");
		}
		if (conversion == 1) {
			System.out.println(input + "° Celcius in Fahrenheit is: " + celsiusToFahrenheit(input) + "°F.");
		}


	}

	public static double fahrenheitToCelsius(double input){
		double fahrenheit = input;
		double celsius = (fahrenheit - 32.0) * (5.0/9.0);
		return celsius;
	}

	public static double celsiusToFahrenheit(double input) {
		double fahrenheit = input * 1.8 + 32;
		return fahrenheit;
	}

}
