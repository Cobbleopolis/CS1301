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

        //TODO print all of the coin counts

        //TODO print the total
    }

    /**
     * Prompts the user for the amount of coins
     * @param coinName The name of the coin to ask for
     * @return The amount of the coin the user inputs
     */
    public static int promptCoinCount(String coinName) {
        System.out.print("# of " + coinName); //Prompt the user for an amount of couins
        return scanner.nextInt();
    }
}
