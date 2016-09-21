//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: StringMethods

package com.cobble.cs.hw4;

import java.util.Scanner;

public class StringMethods {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter string 1: ");

        /** Stores string 1. */
        String string_1 = scanner.nextLine();

        System.out.print("Enter string 2: ");

        /** Stores string 1. */
        String string_2 = scanner.nextLine();

        System.out.println("Length of string 1: " + string_1.length());
        System.out.println("Length of string 2: " + string_2.length());
        System.out.println("Concatenation of string 1 and string 2: " + string_1 + string_2);
        System.out.println("Are string 1 and string 2 the same (case sensitive): " + string_1.equals(string_2));
        System.out.println("string 1 to upper case: " + string_1.toUpperCase());
        System.out.println("string 2 to upper case: " + string_2.toUpperCase());
        System.out.println("Random substring of string 1: " + string_1.substring((int) (Math.random() * string_1.length())));
    }
}