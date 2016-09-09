//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: Lab_3_3

package com.cobble.cs.lab3;

import java.util.Scanner;

public class Lab_3_3 {

    private static Scanner scanner = new Scanner(System.in);

    /** The flat cost of the call. */
    private static final double CONNECTION_COST = 1.99;

    /** When to swap from `EARLY_MIN_FEE` and `LATE_MIN_FEE`. */
    private static final double FEE_SWAP = 3.0;

    /** Constant for the fee for every min before `FEE_SWAP` min. */
    private static final double EARLY_MIN_FEE = 2.00;

    /** Constant for the fee for every min after `FEE_SWAP` min. */
    private static final double LATE_MIN_FEE = 0.45;

    public static void main(String[] args) {
        System.out.print("Call duration: "); // Prompts the user for the call duration

        /** Stores the duration of the call. */
        int duration = (int) Math.ceil(scanner.nextDouble()); // Gets the call duration from the user

        /** used to store the cost of the call. */
        double cost = CONNECTION_COST;

        // Calculates the cost.
        for(int i = 1; i <= duration; i++)
            if (i <= FEE_SWAP)
                cost += EARLY_MIN_FEE;
            else
                cost += LATE_MIN_FEE;

        System.out.println("Call cost: $" + String.format("%.2f", cost)); //Prints the cost
    }
}