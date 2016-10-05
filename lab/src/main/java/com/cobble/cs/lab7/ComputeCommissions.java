//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: ComputeCommissions

package com.cobble.cs.lab7;

public class ComputeCommissions {

    public static void main(String[] args) {
        System.out.printf("%s    %s%n", "Sales Amount", "Commission"); // Prints header
        System.out.println("--------------------------"); // Prints separator
        for (int i = 10; i <= 100; i += 5) // Loops over all needed values
            System.out.printf("%12.2f %13.2f%n", i * 1000.0, computeCommission(i * 1000.0)); // Prints the value and its commission amount
    }

    /**
     * Computes the commission based on a sales amount
     * @param salesAmount The sales amount to get the commission of.
     * @return The commission based on {@code salesAmount}.
     */
    private static double computeCommission(double salesAmount) {
        double commissionPercent;
        if (salesAmount > 0 && salesAmount <= 5000)
            commissionPercent = 0.08;
        else if (salesAmount < 10000)
            commissionPercent = 0.1;
        else
            commissionPercent = 0.12;
        return salesAmount * commissionPercent;
    }
}