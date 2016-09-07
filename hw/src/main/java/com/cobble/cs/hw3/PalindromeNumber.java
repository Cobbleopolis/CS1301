//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: PalindromeNumber

package com.cobble.cs.hw3;

import java.util.Scanner;

public class PalindromeNumber {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a three-digit number: ");

        /** Stores the number inputted by the user. */
        String num = Integer.toString(scanner.nextInt());

        /** Used to store the string if `num` is a palindrome. */
        String notString = (num.charAt(0) == num.charAt(num.length() - 1)) ? "" : " not";

        System.out.println(num + " is" + notString + " a palindrome.");
    }
}