//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: MyTriangle

package com.cobble.cs.hw5;

public class MyTriangle {

    /**
     * If the sides of a triangle are valid.
     * @param side1 The first side of the triangle.
     * @param side2 The second side of the triangle.
     * @param side3 The third side of the triangle.
     * @return true if the sides of the triangle are valid, false otherwise.
     */
    public static boolean isValid(double side1, double side2, double side3) {
        return (side1 + side2) > side3 && (side2 + side3) > side1 && (side1 + side3) > side2;
    }

    /**
     * Calculates the area of the triangle.
     * @param side1 The first side of the triangle.
     * @param side2 The second side of the triangle.
     * @param side3 The third side of the triangle.
     * @return The area of the triangle.
     */
    public static double area(double side1, double side2, double side3) {
        double p = (side1 + side2 + side3) / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }
}