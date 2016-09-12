//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: Pentagon

package com.cobble.cs.lab5;

import java.util.Scanner;

public class Pentagon {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the length from the center to a vertex: ");

        /** The value for `s` in the formula. */
        double s = 2 * scanner.nextDouble() * Math.sin(Math.PI / 5);

        /** The area of the pentagon. */
        double area = (5 * s) / (4 * Math.tan(Math.PI / 5));

        System.out.println("The area of the pentagon is " + area);
    }
}