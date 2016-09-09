//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: Lab_2_4

package com.cobble.cs.lab2;

import java.util.Scanner;

public class Lab_2_5 {

    /** A scanner class used to get input from the user */
    private static Scanner scanner = new Scanner(System.in);

    /** A constant for the value of a quarter */
    private static final double QUARTER_VALUE = 0.25;

    /** A constant for the value of a dime */
    private static final double DIME_VALUE = 0.1;

    /** A constant for the value of a nickel */
    private static final double NICKEL_VALUE = 0.05;

    /** A constant for the value of a penny */
    private static final double PENNY_VALUE = 0.01;

    public static void main(String[] args) {
        int quarterCount = promptCoinCount("quarters");
        int dimeCount = promptCoinCount("dimes");
        int nickelCount = promptCoinCount("nickels");
        int pennyCount = promptCoinCount("pennies");

        System.out.println("--------"); //Just used for separating the input from the output
        printCoinCount("quarters", quarterCount);
        printCoinCount("dimes", dimeCount);
        printCoinCount("nickel", nickelCount);
        printCoinCount("pennies", pennyCount);

        /** The total amount of money in dollars */
        double total = quarterCount * QUARTER_VALUE + dimeCount * DIME_VALUE + nickelCount * NICKEL_VALUE + pennyCount * PENNY_VALUE;
        System.out.println("Total: " + (int) Math.floor(total) + " Dollars and " + (int) ((total % 1) * 100) + " Cents"); //Prints and formats the the total
    }

    /**
     * Prompts the user for the amount of coins
     * @param coinName The name of the coin to ask for
     * @return The amount of the coin the user inputs
     */
    private static int promptCoinCount(String coinName) {
        System.out.print("# of " + coinName + ": "); //Prompt the user for an amount of couins
        return scanner.nextInt();
    }

    /**
     * Prints the count of a coin
     * @param coinName The name of the coin
     * @param coinCount The amount of coins
     */
    private static void printCoinCount(String coinName, int coinCount) {
        System.out.println("# of " + coinName + ": " + coinCount);
    }
}
