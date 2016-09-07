//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: CheckNumber

package com.cobble.cs.hw3;

import java.util.Scanner;

public class CheckNumber {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();
        if (num > 0) // If `num` is above 0
            System.out.println(num + " is a positive number.");
        else if (num < 0) // If `num` is below 0
            System.out.println(num + " is a negative number.");
        else // `num` must be 0
            System.out.println(num + " is zero.");
    }
}