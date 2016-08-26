//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: Lab_2_7

package com.cobble.cs.lab2;

import java.util.Scanner;

public class Lab_2_7 {

    /** A scanner class used to get input from the user */
    private static Scanner scanner = new Scanner(System.in);

    /**
     * The specific heat of water.
     * Doesn't need to be a double in this case but not true for all materials.
     * */
    private static final double SPECIFIC_HEAT = 4184.0;

    public static void main(String[] args) {
        System.out.print("Enter the mass of the water (kg): "); //Prompts the user for the mass of the water
        double mass = scanner.nextDouble(); //Gets the mass of the water from the user

        System.out.print("Enter the initial temperature of the water (\u00b0C): "); //Prompts the user for the initial temperature of the water
        double t0 = scanner.nextDouble(); //Gets the initial temperature of the water from the user

        System.out.print("Enter the finial temperature of the water (\u00b0C): "); //Prompts the user for the finial temperature of the water
        double t1 = scanner.nextDouble(); //Gets the finial temperature of the water from the user

        System.out.println("The energy needed (J): " + (mass  * (t1 - t0) * SPECIFIC_HEAT)); //Prints and calculates the energy needed
    }
}