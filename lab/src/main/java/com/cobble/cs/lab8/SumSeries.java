//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: SumSeries

package com.cobble.cs.lab8;

public class SumSeries {

    public static void main(String[] args) {
        /** Stores the format to print table with. */
        String format = "%-3d   %5.4f%n";

        System.out.printf("%-3s   %6s%n", "i", "m(i)"); // Prints the header.
        System.out.println("------------"); // Prints the separator.
        System.out.printf(format, 1, m(1)); // Prints when i is 1.
        for(int i = 101; i <= 901; i += 100) // Loops all desired values.
            System.out.printf(format, i, m(i));
    }

    /**
     * Approximates pi.
     * @param i How many iterations to run through.
     * @return The approximate value of pi.
     */
    private static double m(int i) {
        double mult = 1;
        for (int j = 2; j <= i; j++) {
            mult += Math.pow(-1, j + 1) / (2.0 * j - 1);
        }
        return 4 * mult;
    }

}