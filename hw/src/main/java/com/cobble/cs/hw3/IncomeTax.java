//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: IncomeTax

package com.cobble.cs.hw3;

import java.util.Scanner;

public class IncomeTax {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter your annual income: ");
        double income = scanner.nextDouble();
        if (income <= 50000) // Checks if `income` is in first bracket
            printIncome(income, 5);
        else if (income > 50000  && income <= 100000) // Checks if `income` is in second bracket
            printIncome(income, 15);
        else if (income > 100000 && income <= 150000) // Checks if `income` is in third bracket
            printIncome(income, 20);
        else if (income > 150000 && income <= 250000) // Checks if `income` is in fourth bracket
            printIncome(income, 30);
        else if (income > 250000 && income <= 500000) // Checks if `income` is in fith bracket
            printIncome(income, 35);
        else if (income > 500000) // Checks if `income` is in sixth bracket
            printIncome(income, 50);
    }

    /**
     * Util function to format and print the income and tax bracket.
     * @param income The income to format and print.
     * @param taxBracket The tax bracket that the income is in.
     */
    private static void printIncome(double income, int taxBracket) {
        System.out.println("Your income is $" + String.format("%.2f", income) + " so your income tax is " + taxBracket + "%.");
    }
}