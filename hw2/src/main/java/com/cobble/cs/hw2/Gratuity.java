//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: Gratuity

package com.cobble.cs.hw2;

import java.util.Scanner;

public class Gratuity {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter subtotal: "); // Prompts the user for the subtotal

        /** The subtotal inputted by the user. */
        double subtotal = scanner.nextDouble(); // Gets the subtotal from the user

        System.out.print("Enter gratuity rate: "); // Prompts the user for the gratuity rate

        /** The gratuity rate inputted by the user. */
        double rate = scanner.nextDouble(); // Gets the gratuity rate from the user

        /** The gratuity rate applied to the subtotal. */
        double grat = subtotal * (rate / 100);

        System.out.println("The gratuity rate is $" + grat + " and the total is $" + (grat + subtotal));
    }
}