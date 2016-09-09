//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: Lab_4_3

package com.cobble.cs.lab4;

import java.util.Scanner;

public class Lab_4_3 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter two integers: ");

        /** First number. */
        int num1 = scanner.nextInt();

        /** Second number. */
        int num2 = scanner.nextInt();

        //Prints the options
        System.out.println("To preform the addition of the two numbers enter:       1");
        System.out.println("To preform the subtraction of the two numbers enter:    2");
        System.out.println("To preform the multiplication of the two numbers enter: 3");
        System.out.println("To preform the division of the two numbers enter:       4");
        System.out.println("To preform the remainder of the two numbers enter:      5");

        /** Used to store the desired operator. */
        int opp = scanner.nextInt();

        switch (opp) {
            case 1: //Runs if opp = 1
                System.out.println("num1 + num2 = " + (num1 + num2));
                break;
            case 2: //Runs if opp = 2
                System.out.println("num1 - num2 = " + (num1 - num2));
                break;
            case 3: //Runs if opp = 3
                System.out.println("num1 * num2 = " + (num1 * num2));
                break;
            case 4: //Runs if opp = 4
                System.out.println("num1 / num2 = " + (num1 / num2));
                break;
            case 5: //Runs if opp = 5
                System.out.println("num1 % num2 = " + (num1 % num2));
                break;
            default: //Runs if opp < 1 || opp > 5
                System.out.println("Unknown option!");
        }
    }
}