//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: PerimeterPoint

package com.cobble.cs.lab4;

import java.util.Scanner;

public class PerimeterPoint {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input side 1: ");
        /** Used to store side 1.*/
        double s1 = scanner.nextDouble();

        System.out.print("Input side 2: ");
        /** Used to store side 2.*/
        double s2 = scanner.nextDouble();

        System.out.print("Input side 3: ");
        /** Used to store side 3.*/
        double s3 = scanner.nextDouble();

        if (isValid(s1, s2, s3)){
            System.out.println("The perimeter is " + (s1 + s2 + s3));
        } else {
            System.out.println("Sides are not valid!");
        }

    }

    /**
     * Used to determine if the sides are valid.
     * @param s1 Length of side 1.
     * @param s2 Length of side 2.
     * @param s3 Length of side 3.
     * @return `true` if the data is valid. `false` otherwise.
     */
    private static boolean isValid(double s1, double s2, double s3) {
        return (s1 + s2 > s3) && (s1 + s3 > s2) && (s2 + s3 > s1);
    }
}