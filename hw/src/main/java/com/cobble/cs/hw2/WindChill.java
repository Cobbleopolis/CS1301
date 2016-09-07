//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: WindChill

package com.cobble.cs.hw2;

import java.util.Scanner;

public class WindChill {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the temperature between -58\u00b0F and 48\u00b0F: "); //Prompts the user for the actual temp

        /** The actual temp inputted by the user. */
        double tempActual = scanner.nextDouble();

        System.out.print("Enter the wind speed (>=2) in miles per hour: "); //Prompts the user for the wind speed in mph

        /** The wind speed inputted by the user. */
        double windSpeed = scanner.nextDouble();

        /** The wind chill index calculated from the formula given. */
        double windChillIndex = 35.74 + 0.6215 * tempActual - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * tempActual * Math.pow(windSpeed, 0.16);

        System.out.println("The wind chill index is " + windChillIndex);
    }
}