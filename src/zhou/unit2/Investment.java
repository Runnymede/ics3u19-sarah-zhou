package zhou.unit2;

import java.util.Scanner;
import java.text.DecimalFormat;

/**Investment.java
 * This program calculates how many years it will take for an investment of $2500 to be worth at least $5000 if compounded annually at 7.5%.
 * Date created: October 29nd, 2019
 * @author Sarah Zhou
 */

public class Investment {

	public static void main(String[] args) {
		
		// Variables
		double money = 2500;
		double compoundRate = 0.075;
		int counter = 0;
		
		DecimalFormat moneyFormat = new DecimalFormat("$##,###.00");
		
		// Loop for adding 
		while (money < 5000) {
			money += money*compoundRate;
			counter ++;
		}
		
		System.out.println("In " + counter + " years, the investment will be worth " + moneyFormat.format(money) + ".");
	}

}
