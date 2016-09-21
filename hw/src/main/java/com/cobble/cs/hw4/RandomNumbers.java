//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: RandomNumbers

package com.cobble.cs.hw4;

import java.util.Random;

public class RandomNumbers {

    /** Random object used to get random numbers. */
    private static Random rand = new Random(System.currentTimeMillis());

    public static void main(String[] args) {
        //Part A: Rand int between 30 and 50
        System.out.println("Random integer between 30 and 50 (inc): " + randInt(30, 50));
        //Part B: Rand int between 20 and -20
        System.out.println("Random integer between 20 and -20 (inc): " + randInt(-20, 20));
        //Part C: Rand int between -20 and -60
        System.out.println("Random integer between -20 and -60 (inc): " + randInt(-60, -20));
        //Part D: Rand floating-point between 0.0 and 15.9999
        System.out.println("Random floating-point number between 0.0 and 15.9999 (inc): " + (rand.nextDouble() * 16.0));
    }

    /**
     * Gets a random integer with bounds (inclusive).
     * @param lowerBound The lower bound of the random integer.
     * @param upperBound The upper bound of the random integer (inclusive).
     * @return A random integer.
     */
    private static int randInt(int lowerBound, int upperBound) {
        return rand.nextInt(upperBound - lowerBound + 1) + lowerBound;
    }
}