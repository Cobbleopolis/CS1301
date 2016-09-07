//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: PhoneBill

package com.cobble.cs.hw3;

import java.util.Scanner;

public class PhoneBill {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter your account number: ");

        /** Stores the account number.*/
        int accountNumber = scanner.nextInt();

        System.out.print("Enter your service code: ");

        /** Stores the service code. */
        char serviceCode = scanner.next().toLowerCase().charAt(0);

        if (serviceCode == 'r')
            handleRegular(accountNumber, serviceCode);
        else if (serviceCode == 'p')
            handlePremium(accountNumber, serviceCode);
    }

    /**
     * Handles a regular account.
     * @param accountNumber The account number.
     * @param serviceCode The account code.
     */
    private static void handleRegular(int accountNumber, char serviceCode) {
        System.out.print("Enter number of minutes used: ");

        /** Stores the number of minutes used. */
        double minUsed = Math.ceil(scanner.nextDouble());

        /** Stores the cost. */
        double cost = 10 + (Math.max(minUsed - 50, 0) * 0.2);

        printData(accountNumber, serviceCode, minUsed, cost);
    }

    /**
     * Handles a premium account.
     * @param accountNumber The account number.
     * @param serviceCode The account code.
     */
    private static void handlePremium(int accountNumber, char serviceCode) {
        System.out.print("Enter number of minutes used during the day: ");

        /** Stores the minutes used during the day. */
        double minUsedDay = Math.ceil(scanner.nextDouble());

        System.out.print("Enter number of minutes used at night: ");

        /** Stores the minutes used at night. */
        double minUsedNight = Math.ceil(scanner.nextDouble());

        /** Stores the cost. */
        double cost = 25;

        cost += Math.max(minUsedDay - 75, 0) * 0.1; //Adds the cost of time used during the day

        cost += Math.max(minUsedNight - 100, 0) * 0.05; //Adds the cost of time used at night

        printData(accountNumber, serviceCode, minUsedDay + minUsedNight, cost);
    }

    /**
     * Prints the output for the assignment
     * @param accountNumber The account number to print.
     * @param serviceCode The service code to print.
     * @param minUsed The minutes used to print.
     * @param cost The total cost to print.
     */
    private static void printData(int accountNumber, char serviceCode, double minUsed, double cost) {
        System.out.println("Account Number: " + accountNumber);               //Prints the account number
        System.out.println("Service Code: "   + serviceCode);                 //Prints the service code
        System.out.println("Minutes Used: "   + minUsed);                     //Prints the minutes used
        System.out.println("Cost: $"          + String.format("%.2f", cost)); //Prints the cost
    }
}