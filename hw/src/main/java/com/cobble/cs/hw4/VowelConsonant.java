//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: VowelConsonant

package com.cobble.cs.hw4;

import java.util.Scanner;

public class VowelConsonant {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a letter: "); // Prompts the user for `str`

        /** Stores the first character of the inputted string. */
        String str = scanner.next().substring(0, 1);

        if (str.toLowerCase().matches("[aeiou]")) // Checks if `str.toLowerCase()` is any vowel
            System.out.println(str + " is a vowel");
        else if(str.toLowerCase().matches("[a-z&&[^aeiou]]")) // Checks if `str.toLowerCase()` is not a vowel and it's a letter
            System.out.println(str + " is a consonant");
        else // Will be called if `str.toLowerCase()` is not a-z
            System.out.println(str + " is an invalid input");
    }
}