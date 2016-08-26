//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: Lab_2_8

package com.cobble.cs.lab2;

import java.util.Scanner;

public class Lab_2_8 {

    /** A scanner class used to get input from the user */
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /** Point 1 */
        double[] p1 = promptPoint(1);

        /** Point 2 */
        double[] p2 = promptPoint(2);

        /** Point 3 */
        double[] p3 = promptPoint(3);

        /** Side 1 (p1 -> p2) */
        double side1 = lineLength(p1, p2);

        /** Side 2 (p2 -> p3) */
        double side2 = lineLength(p2, p3);

        /** Side 3 (p1 -> p3) */
        double side3 = lineLength(p1, p3);

        /** The s constant */
        double s = (side1 + side2 + side3) / 2;

        System.out.println("Area of a triangle is: " + Math.sqrt(s * (s - side1) * (s - side2) * (s - side3))); //Prints and calculates the area of a triangle
    }

    /**
     * Gets the coordinates of a point from the user
     * @param pointNum The number of the point
     * @return The coordinates of the point stored in an array in order of {x, y}
     */
    private static double[] promptPoint(int pointNum) {
        System.out.print("Enter the coordinates of point " + pointNum + ": "); //Prompts the user to input the coordinates of the point
        double[] point = new double[2];
        point[0] = scanner.nextDouble();
        point[1] = scanner.nextDouble();
        return point;
    }

    /**
     * Calculates the length of a line
     * @param p1 An array of length 2 with the x, y values of p1
     * @param p2 An array of length 2 with the x, y values of p2
     * @return The length of the side
     */
    private static double lineLength(double[] p1, double[] p2) {
        double dX = p2[0] - p1[0];
        double dY = p2[1] - p1[1];

        return Math.sqrt( dX * dX + dY * dY);
    }
}