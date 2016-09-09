//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: Lab_2_1

package com.cobble.cs.lab2;

import java.util.Scanner;

public class Lab_2_1 {

    /** A static variable used to get input from the user */
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        final int x = getInt("X"); //Gets an integer from the user and assigns it to x.
        final int y = getInt("Y"); //Gets an integer from the user and assigns it to y.
        final int z = getInt("Z"); //Gets an integer from the user and assigns it to z.
        System.out.println("The value of X is: " + x); //Prints the value of x
        System.out.println("The value of Y is: " + y); //Prints the value of y
        System.out.println("The value of Z is: " + z); //Prints the value of z

        System.out.println("Average of x, y, and z: " + ((x + y + z) / 3)); //Prints and calculates the average of x, y, and z
    }

    /**
     * Prompts the user to input an integer
     * @param name The name of the integer that the user is inputting
     * @return The integer that the user inputted
     */
    private static int getInt(String name) {
        System.out.print("Please type an integer (" + name + "): "); //Prompts the user to input an integer
        return scanner.nextInt(); // Waits until the user inputs an integer and returns it
    }

}
