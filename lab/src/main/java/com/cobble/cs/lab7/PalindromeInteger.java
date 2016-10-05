//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: PalindromeInteger

package com.cobble.cs.lab7;

import java.util.Scanner;

public class PalindromeInteger {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        /** Stores if the user wants to re-run the program. */
        boolean reRun;

        do {
            System.out.print("Enter a number: "); // Prompts the user for the number

            /** Stores the inputted int from the user. */
            int n = scanner.nextInt();

            System.out.printf("%d is %sa palindrome.%n", n, isPalindrome(n) ? "" : "not "); // Prints if n is a palindrome.

            System.out.print("Do you want to re-run the program? [y/n]: "); // Prompts the user to re-run the program
            reRun = scanner.next().toLowerCase().charAt(0) == 'y'; // Checks the user input to re-run the program
        } while (reRun);
    }

    /**
     * Reverses the digits of the passed integer.
     *
     * @param n The integer to reverse the digits of.
     * @return {@code n} with its digits reversed.
     */
    private static int reverse(int n) {
        int reversedInt = 0;
        while (n > 0) {
            reversedInt = reversedInt * 10 + n % 10;
            n /= 10;
        }
        return reversedInt;
    }

    /**
     * Calculates if the passed int is a palindrome.
     *
     * @param n The integer to check if it is a palindrome.
     * @return {@code true} if n is a palindrome, {@code false} otherwise.
     */
    private static boolean isPalindrome(int n) {
        return n == reverse(n);
    }
}