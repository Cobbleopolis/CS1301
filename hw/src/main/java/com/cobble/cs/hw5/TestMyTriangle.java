//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: TestMyTriangle

package com.cobble.cs.hw5;

import java.util.Scanner;

public class TestMyTriangle {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        /** Stores if the user wants to re-run the program. */
        boolean reRun;

        do {
            System.out.print("Input side 1: ");

            /** The first side of the triangle. */
            double side1 = scanner.nextDouble();

            System.out.print("Input side 2: ");

            /** The second side of the triangle. */
            double side2 = scanner.nextDouble();

            System.out.print("Input side 3: ");

            /** The third side of the triangle. */
            double side3 = scanner.nextDouble();

            if (MyTriangle.isValid(side1, side2, side3)) {
                System.out.println("The triangle is valid.");
                System.out.println("Its area is " + MyTriangle.area(side1, side2, side3));
            } else
                System.out.println("The triangle is invalid.");

            System.out.println("Do you want to re-run the program? [y/n]: ");
            reRun = scanner.next().toLowerCase().charAt(0) == 'y';
        } while (reRun);


    }

}