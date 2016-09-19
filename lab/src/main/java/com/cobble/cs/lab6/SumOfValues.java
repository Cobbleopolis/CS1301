//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: SumOfValues

package com.cobble.cs.lab6;

public class SumOfValues {
    public static void main(String[] args) {
        /** Stores the sum of all the values. */
        int sum = 0;

        /** Used to store current location in the loop. */
        int i = 1;

        while(i <= 100) { //While i is less then or equal to 100
            sum += i; // Add i to sum
            i++; //Increments i
        }

        System.out.println("The sum of all integers from 1 to 100 is " + sum);
    }
}