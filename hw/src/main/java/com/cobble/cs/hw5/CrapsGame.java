//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: CrapsGame

package com.cobble.cs.hw5;

import java.util.Random;

public class CrapsGame {

    private static Random rand = new Random(System.currentTimeMillis());

    public static void main(String[] args) {

        /** Stores the first dice. */
        int d1 = rollDice();

        /** Stores the scond dice. */
        int d2 = rollDice();

        /** Stores the sum of the two dice. */
        int sum = d1 + d2;

        if (sum == 2 || sum == 3 || sum == 12) { // If win condition is met.
            System.out.printf("You rolled %d + %d = %d%n", d1, d2, sum);
            System.out.println("You loose.");
        } else if (sum == 7 || sum == 11) { // If loose condition is met.
            System.out.printf("You rolled %d + %d = %d%n", d1, d2, sum);
            System.out.println("You win.");
        } else { // If point condition is met
            int point;
            do {
                d1 = rollDice();
                d2 = rollDice();
                point = sum;
                sum = d1 + d2;
                System.out.printf("You rolled %d + %d = %d%n", d1, d2, sum);
                System.out.println("point is " + sum);
            } while (sum != point && sum != 7); // Loop until either condition is met.
            if (sum == 7) // If loose condition is met.
                System.out.println("You loose.");
            else // Win condition must be met.
                System.out.println("You win.");
        }
    }

    /**
     * Simulates rolling a dice.
     * @return A random number between 1 and 6.
     */
    private static int rollDice() {
        return rand.nextInt(6) + 1;
    }
}