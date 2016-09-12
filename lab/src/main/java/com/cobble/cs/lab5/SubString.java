//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: SubString

package com.cobble.cs.lab5;

import java.util.Scanner;

public class SubString {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter string str1: "); // Prompts the user for str1

        /** Stores first string. */
        String str1 = scanner.next();

        System.out.print("Enter string str2: "); // Prompts the user for str2

        /** Stores second string. */
        String str2 = scanner.next();

        /** Stores if `str2` is in `str1`.*/
        String notStr = str1.contains(str2) ? "" : "not ";

        System.out.println(str2 + " is " + notStr + "a substring of " + str1);
    }
}