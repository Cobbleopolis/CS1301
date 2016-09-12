//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: Hexagon

package com.cobble.cs.lab5;

import java.util.Scanner;

public class Hexagon {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the length of a side: ");

        /** The area of the pentagon. */
        double area = (6 * scanner.nextDouble()) / (4 * Math.tan(Math.PI / 6));

        System.out.println("The area of the hexagon is " + area);
    }
}