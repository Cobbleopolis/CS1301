//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: Lab_2_6

package com.cobble.cs.lab2;

import java.util.Scanner;

public class Lab_2_6 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter v0 (m/s): "); //Prompts the user for v0
        double v0 = scanner.nextDouble(); //Gets v0 from the user
        System.out.print("Enter v1 (m/s): "); //Prompts the user for v1
        double v1 = scanner.nextDouble(); //Gets v1 from the user
        System.out.print("Enter t (s): "); //Prompts the user for t
        double t = scanner.nextDouble(); //Gets t from the user
        System.out.println("Average velocity is: " + ((v1 - v0) / t)); //Prints and calculates the average velocity
    }

}
