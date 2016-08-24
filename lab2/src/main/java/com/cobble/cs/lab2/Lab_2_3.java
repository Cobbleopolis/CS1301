//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: Lab_2_3

package com.cobble.cs.lab2;

import java.util.Scanner;

public class Lab_2_3 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input byte value: "); //Gets the byte value
        byte byte_value = scanner.nextByte(); //Waits for a byte value

        System.out.print("Input short value: "); //Gets the short value
        short short_value = scanner.nextByte(); //Waits for a short value

        System.out.print("Input int value: "); //Gets the int value
        int int_value = scanner.nextInt(); //Waits for a int value

        System.out.print("Input long value: "); //Gets the long value
        long long_value = scanner.nextInt(); //Waits for a long value

        System.out.print("Input float value: "); //Gets the float value
        float float_value = scanner.nextInt(); //Waits for a float value

        System.out.print("Input double value: "); //Gets the double value
        double double_value = scanner.nextDouble(); //Waits for a double value

        System.out.println("Byte Value: " + byte_value); //Prints the byte value that was inputted
        System.out.println("Short Value: " + short_value); //Prints the short value that was inputted
        System.out.println("Int Value: " + int_value); //Prints the int value that was inputted
        System.out.println("Long Value: " + long_value); //Prints the long value that was inputted
        System.out.println("Float Value: " + float_value); //Prints the float value that was inputted
        System.out.println("Double Value: " + double_value); //Prints the double value that was inputted
    }
}
