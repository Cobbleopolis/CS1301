//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: Lab_3_4

package com.cobble.cs.lab3;

import java.util.Scanner;

public class Lab_3_4 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the x and y coordinates of a point: ");

        /** x coordinate. */
        double x = scanner.nextDouble();

        /** y coordinate. */
        double y = scanner.nextDouble();

        /** Used to store the formatted x and y values to print. */
        String coordStr = "(" + x + ", " + y + ")";

        if (x == 0 && y == 0)
            System.out.println(coordStr + " is on the origin.");
        else if (x == 0)
            System.out.println(coordStr + " is on the x-axis.");
        else if (y == 0)
            System.out.println(coordStr + " is on the y-axis.");
        else if (x > 0 && y > 0)
            System.out.println(coordStr + " is in fist quadrant.");
        else if (x < 0 && y > 0)
            System.out.println(coordStr + " is in second quadrant.");
        else if (x < 0 && y < 0)
            System.out.println(coordStr + " is in third quadrant.");
        else if (x > 0 && y < 0)
            System.out.println(coordStr + " is in fourth quadrant.");
    }
}