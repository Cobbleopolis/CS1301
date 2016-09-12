//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: ASCII_Code

package com.cobble.cs.lab5;

import java.util.Scanner;

public class ASCII_Code {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter an ASCII code: ");

        char c = scanner.next().charAt(0);

        System.out.println("The character for ASCII code " + (int) c + " is " + c);
    }
}