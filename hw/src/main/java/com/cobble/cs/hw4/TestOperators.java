//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: TestOperators

package com.cobble.cs.hw4;

import java.util.Scanner;

public class TestOperators {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter an integer: ");

        /** Stores the inputted integer. */
        int in = scanner.nextInt();

        /** Stores if `in` is divisible by 5. */
        boolean divBy5 = in % 5 == 0;

        /** Stores if `in` is divisible by 6. */
        boolean divBy6 = in % 6 == 0;

        System.out.println("Is " + in + " divisible by 5 and 6? " + (divBy5 && divBy6));
        System.out.println("Is " + in + " divisible by 5 or 6? " + (divBy5 || divBy6));
        System.out.println("Is " + in + " divisible by 5 or 6, but not both? " + (divBy5 ^ divBy6));
    }
}