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

        /** Number to store the current count*/
        int count = start;

        System.out.print("Even numbers between " + start + " and " + end + ": ");
        while (count <= end) { // Loops from start to end
            if (count % 2 == 0) // If i is even
                System.out.print(count + ", "); // Prints i
            count++;
        }

        System.out.println(); // Moves to next line

        count = start; // Resets count to be at start

        System.out.print("Odd numbers between " + start + " and " + end + ": ");
        while (count <= end) { // Loops from start to end
            if (count % 2 == 1) // If i is odd
                System.out.print(count + ", "); // Prints i
            count++;
        }
    }
}