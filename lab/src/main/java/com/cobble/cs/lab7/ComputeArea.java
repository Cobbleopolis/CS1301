//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: ComputeArea

package com.cobble.cs.lab7;

import java.util.Scanner;

public class ComputeArea {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /** Stores if the user wants to re-run the program. */
        boolean reRun;

        do {
            // Square
            System.out.print("Square Side: "); // Prompts the user for square side.
            System.out.println("Square Area: " + squareArea(scanner.nextDouble())); // Prints the area of the square.

            // Rectangle
            System.out.print("Rectangle Width: "); // Prompts the user for rectangle width.

            /** Stores the width of the rectangle. */
            double rectWidth = scanner.nextDouble();

            System.out.print("Rectangle Height: "); // Prompts the user for rectangle height.
            System.out.println("Rectangle Area: " + rectangleArea(rectWidth, scanner.nextDouble())); // Prints the are of the rectangle.

            //Circle
            System.out.print("Circle Radius: "); // Prompts the user for circle radius.
            System.out.println("Circle Area: " + circleArea(scanner.nextDouble())); // Prints the area of the circle.

            //Triangle
            System.out.print("Triangle Base: "); // Prompts the user for triangle base.

            /** Stores the base of the triangle. */
            double triangleBase = scanner.nextDouble();

            System.out.print("Triangle Height: "); // Prompts the user for triangle height.
            System.out.println("Triangle Area: " + triangleArea(triangleBase, scanner.nextDouble())); // Prints the area of the triangle.

            System.out.print("Do you want to re-run the program? [y/n]: "); // Prompts the user to re-run the program
            reRun = scanner.next().toLowerCase().charAt(0) == 'y'; // Checks the user input to re-run the program
        } while (reRun);
    }

    /**
     * Calculates the area of a square.
     *
     * @param side The length of the sides of the square.
     * @return The area of a square with a side length of {@code side}.
     */
    private static double squareArea(double side) {
        return side * side;
    }

    /**
     * Calculates the area of a rectangle.
     *
     * @param width  The width of the rectangle.
     * @param length The length of the rectangle.
     * @return The area of a rectangle with a width of {@code width} and a length of {@code length}.
     */
    private static double rectangleArea(double width, double length) {
        return width * length;
    }

    /**
     * Calculates the area of a circle.
     *
     * @param radius The radius of the circle.
     * @return The are of a circle with a radius of {@code radius}.
     */
    private static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    /**
     * Calculates the area of a triangle
     *
     * @param base   The length of the base of the triangle.
     * @param height The height of the triangle.
     * @return The are of a triangle with a base of {@code base} and a height of {@code height}.
     */
    private static double triangleArea(double base, double height) {
        return 0.5 * base * height;
    }
}