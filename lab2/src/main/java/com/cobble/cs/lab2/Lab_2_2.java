//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: Lab 2_2

package com.cobble.cs.lab2;

import java.util.Scanner;

public class Lab_2_2 {

    /** A static variable used to get input from the user */
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double r = getDouble("R"); //Gets an floating-point number from the user and assigns it to r.
        double t = getDouble("T"); //Gets an floating-point number from the user and assigns it to t.
        System.out.println("The value of R is: " + r); //Prints the value of r
        System.out.println("The value of T is: " + t); //Prints the value of t
    }

    /**
     * Prompts the user to input an floating-point number
     * @param name The name of the floating-point number that the user is inputting
     * @return The floating-point number that the user inputted
     */
    private static double getDouble(String name) {
        System.out.print("Please type an integer(" + name + "): "); //Prompts the user to input an floating-point number
        return scanner.nextDouble(); // Waits until the user inputs an integer and returns it
    }

}
