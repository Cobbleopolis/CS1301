//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: MathMethods

package com.cobble.cs.hw4;

import java.util.Scanner;

public class MathMethods {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Part A: Absolute Value
        System.out.print("Enter a negative integer: "); // Prompts the user for `absInt`.

        /** Stores the integer to get the absolute value of. */
        int absInt = scanner.nextInt();

        System.out.printf("The absolute value of %d is %d \n", absInt, Math.abs(absInt)); // Prints the absolute value of `absInt`.

        // Part B: Sine, Cosine, and Tangent
        System.out.print("Enter an angle: "); // Prompts the uer for `angle`.

        /** Stores the angle inputted by the user. */
        double angle = scanner.nextDouble();

        System.out.printf("The sine of %f is %f\n", angle, Math.sin(Math.toRadians(angle))); // Prints the sine of `angle`.
        System.out.printf("The cosine of %f is %f\n", angle, Math.cos(Math.toRadians(angle))); // Prints the cosine of `angle`.
        System.out.printf("The tangent of %f is %f\n", angle, Math.tan(Math.toRadians(angle))); // Prints the tangent of `angle`.

        // Part C: Floor and Ceiling
        System.out.print("Enter a floating-point number: "); // Prompts the user for `floorCeil`.

        /** Stores the double to get the floor and ceil. */
        double floorCeil = scanner.nextDouble();

        System.out.printf("The floor of %f is %d\n", floorCeil, (int) Math.floor(floorCeil)); // Prints the floor of `floorCeil`.
        System.out.printf("The ceiling of %f is %d\n", floorCeil, (int) Math.ceil(floorCeil)); // Prints the ceiling of `floorCeil`.

        // Part D: Power
        System.out.print("Enter floating-point number x: "); // Prompts the user for `x`.

        /** Stores the value the user inputted for `x`.*/
        double x = scanner.nextDouble();

        System.out.print("Enter floating-point number y: "); // Prompts the user for `y`.

        /** Stores the value the uesr inputted for `y`.*/
        double y = scanner.nextDouble();

        System.out.println("The value of x^y is " + Math.pow(x, y)); // Prints the value of `x` to the power of `y`.

        //Part E: Square root
        System.out.print("Enter an integer: "); // Prompts the user for `sqrtInt`.

        /** Stores the int to get the square root of. */
        int sqrtInt = scanner.nextInt();

        System.out.printf("The square root of %d id %f\n", sqrtInt, Math.sqrt(sqrtInt)); // Prints the square root of `sqrtInt`.

    }
}