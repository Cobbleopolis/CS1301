//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: DrivingCost

package com.cobble.cs.hw2;

import java.util.Scanner;

public class DrivingCost {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the distance traveled (miles): "); //Prompts the user for dist
        /** The distance traveled inputted by the user. */
        double dist = scanner.nextDouble();

        System.out.print("Enter the miles per gallon: "); //Prompts the user for mpg
        /** The mpg inputted by the user. */
        double mpg = scanner.nextDouble();

        System.out.print("Enter the cost per gallon: "); //Prompts the user for costPerGallon
        /** The cost per gallon inputted by the user. */
        double costPerGallon = scanner.nextDouble();

        System.out.print("The cost of driving is $" + String.format("%.2f", dist / mpg * costPerGallon)); //Prints, calculates, and formats the cost of driving
    }
}