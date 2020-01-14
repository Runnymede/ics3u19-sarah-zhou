package zhou.unit4;

import java.util.Arrays;

/** MathPlus.java
 * <p> This program contains various methods for various mathematical problems.
 * <b> Date created: Debember 19, 2019
 * @author Sarah Zhou
 */
public class MathPlus {

	public static void main(String[] args) {
		double[] testArray = {8, 2, 3, 6, 1, 5, 4, 7, 9};
		double[] test = {1.1, 2.2, 3.3, 4.4, 5.5};
		int userNumber = 32;

		//		System.out.println("Sum: " + sum(test));
		//		System.out.println("Average: " + average(test));
		//		System.out.println("Minimum Index: " + min(test));
		//		System.out.println("Maximum Index: " + max(test));
		System.out.println("Median: " + median(testArray));

		//		int[] factor = factors(userNumber);
		//		for (int i = 0; i < factor.length; i++) {
		//			System.out.println(factor[i]);
		//		}
		//System.out.println("factors: " + factors(userNumber));
		System.out.println("median: " +median(test));
	}

	// ****************************************************************************

	/**
	 * This method returns the index of smallest integer in the array.
	 * @param numbers- the array of integer values to be used.
	 * @return minIndex- the index of the smallest number in int[] numbers.
	 */
	public static int min(int[] numbers) {
		int min = numbers[0];
		int minIndex = 0;

		for (int i = 1; i < numbers.length; i++ ) {
			if (numbers[i] < min) {
				min = numbers[i];
				minIndex = i;
			}
		}

		return minIndex;
	}

	/**
	 * This method returns the index of the largest integer in the array.
	 * @param numbers- the array of integer values to be used.
	 * @return maxIndex- the index of the largest number in int[] numbers.
	 */
	public static int max(int[] numbers) {
		int max = numbers[0];
		int maxIndex = 0;

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}

	/**
	 * This method adds together then returns the sum of all of the integers in the array.
	 * @param numbers- the array of integer values to be used.
	 * @return sum- the sum of all of the integers in int[] numbers.
	 */
	public static int sum(int[] numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
	}

	/**
	 * This method gets the sum of the integers in the array, then divides the array by its length,
	 * and returns the average of all of the integers in the array as a double.
	 * @param numbers- the array of integer numbers to be used.
	 * @return average- the average value of all of the integers in int[] numbers.
	 */
	public static double average(int[] numbers) {
		double average = sum(numbers);
		average /= numbers.length;
		return average;
	}

	// ****************************************************************************

	/**
	 * This method returns the index of smallest double in the array.
	 * @param numbers- the array of double values to be used.
	 * @return minIndex- the index of the smallest number in double[] numbers.
	 */
	public static int min(double[] numbers) {
		double min = numbers[0];
		int minIndex = 0;

		for (int i = 1; i < numbers.length; i++ ) {
			if (numbers[i] < min) {
				min = numbers[i];
				minIndex = i;
			}
		}

		return minIndex;
	}

	/**
	 * This method returns the index of the largest double in the array.
	 * @param numbers- the array of double values to be used.
	 * @return maxIndex- the index of the largest number in double[] numbers.
	 */
	public static int max(double[] numbers) {
		double max = numbers[0];
		int maxIndex = 0;

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}

	/**
	 * This method adds together, then returns the sum of all doubles in the array.
	 * @param numbers- the array of double values to be used.
	 * @return sum- the sum of all of the doubles in the double[] numbers.
	 */
	public static double sum(double[] numbers) {
		double sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
	}

	/**
	 * This method gets the sum of the double in the array, then divides the array by its length,
	 * and returns the average of all of the doubles in the array.
	 * @param numbers- the array of double values to be used.
	 * @return average- the average number of all of the doubles in double[] numbers.
	 */
	public static double average(double[] numbers) {
		double average = sum(numbers);
		average /= numbers.length;
		return average;
	}

	// ****************************************************************************

	/**
	 * This method calculates the median number in the array of doubles and returns the value to the user.
	 * This method checks if the array is even or odd in length. If even, it will calculate the median by using the value at
	 * @param numbers- the array of double values to be used.
	 * @return median- the number in the center of the list of double values provided.
	 */
	public static double median(double[] numbers) {
		double median;
		int numLength = numbers.length / 2;

		Arrays.sort(numbers);
		if(numbers.length % 2 == 0) {
			median = (numbers[numLength] + numbers[numLength+1]) / 2;
		}
		numLength = (int)Math.ceil(numLength);
		median = numbers[numLength];
		return median;
	}

	/**
	 * This method determines the value that is most commonly found in the given array, and will return that value.
	 * @param numbers- the arrya of doubles to be used.
	 * @return mode- returns the mode of the double[] numbers.
	 */
	public static double mode(double[] numbers) {
		double mode = numbers[0];
		int counter = 0;
		int oldCounter = 0;
		double current;

		// for-loop that will go through each number in the array.
		for (int x = 0; x < numbers.length-1; x++) {
			current = numbers[x];
			oldCounter = 0;

			/*
			 * for-loop for each number in the array that checks to see if the other numbers in the array are the same.
			 * If so, add one to oldCounter.
			 */

			for (int i = 1; i < numbers.length; i++) {


				if (numbers[i] == current) {
					oldCounter ++;
				}

				/*
				 * If the old counter exceeds the current counter, the mode is now the value of the double current,
				 * and the counter is now the value of oldCounter.
				 */
				if (oldCounter > counter) {
					mode = current;
					counter = oldCounter;
				}
			}
		}

		return mode;
	}

	/**
	 * This method takes a number from the user, and determines whether or not the number is a prime
	 * number or not, returning true if it is, false if it is not.
	 * @param oneNum- the integer value to be used.
	 * @return prime- indicates whether or not the number passed in is a prime or
	 * not (true if it is false if it is not)
	 */
	public static boolean prime(int oneNum) {
		boolean check = false;
		int divide = 2;

		if (oneNum < 1) {
			check = false;
		}

		else if (oneNum ==2) {
			check = true;
		}
		else {
			do {
				if (oneNum % divide == 0) {
					check = false;
				}
				else {
					check = true;
				}
				divide ++;
			} while(divide <= Math.sqrt(oneNum));
		}
		return check;
	}


	/**
	 * This method calculates then returns the factorial of the given number.
	 * If the value inputed is less than 0, this method will return a value of -1.
	 * @param oneNum- the integer value to be used.
	 * @return total- the user inputed integer as a factorial.
	 */
	public static long factorial(int oneNum) {
		// 1! or !0 = 1, no negatives
		int total = 0;
		if (oneNum == 0 || oneNum == 1) {
			total = 1;
			return total;
		}

		else if (oneNum < 0) {
			total = -1;
			return total;
		}
		else {
			total = oneNum;
			for (int i = oneNum - 1; i >= 1; i--) {
				total *= i;
			}
			return total;
		}
	}


	/**
	 * This method calculates and returns the number of positive factors for the given integer.
	 * @param oneNum- the integer value to be used.
	 * @return factorNum- the number of factors for the given integer value.
	 */
	public static int numOfFactors(int oneNum) {
		int factorNum = 0;

		for (int i = 1; i <= oneNum; i++) {
			if (oneNum % i == 0) {
				factorNum ++;
			}
		}
		return factorNum;
	}


	/**
	 * This method calculates and then stores the factors of the given number and returns them as an int[].
	 * @param oneNum- the integer value to be used.
	 * @return factors- an int[] containing all of the factors in the given integer value.
	 */
	public static int[] factors(int oneNum) {
		int[] factors = new int[numOfFactors(oneNum)];
		int spot = 0;

		for (int i = 1; i <= oneNum; i++) {
			if (oneNum % i == 0) {
				factors[spot] = i;
				spot ++;
			}
		}
		return factors;
	}

}
