//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: EvenAndOdd

package com.cobble.cs.lab6;

public class EvenAndOdd {

    public static void main(String[] args) {

        /** Number to start at. */
        int start = 50;

        /** Number to end at (inclusive). */
        int end = 100;

        System.out.print("Even numbers between " + start + " and " + end + ": ");
        for (int i = start; i <= end; i++) // Loops from start to end
            if (i % 2 == 0) // If i is even
                System.out.print(i + ", "); // Prints i

        System.out.println(); // Moves to next line

        System.out.print("Odd numbers between " + start + " and " + end + ": ");
        for (int i = start; i <= end; i++) // Loops from start to end
            if (i % 2 == 1) // If i is odd
                System.out.print(i + ", "); // Prints i
    }
}