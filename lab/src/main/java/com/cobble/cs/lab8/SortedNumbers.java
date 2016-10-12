//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: SortedNumbers

package com.cobble.cs.lab8;

import java.util.Scanner;

public class SortedNumbers {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /** Stores if the user wants to re-run the program. */
        boolean reRun;

        do {
            displaySortedNumbers(getDouble("first"), getDouble("second"), getDouble("third"), getDouble("fourth"), getDouble("fifth"));

            System.out.print("Do you want to re-run the program? [y/n]: "); // Prompts the user to re-run the program
            reRun = scanner.next().toLowerCase().charAt(0) == 'y'; // Checks the user input to re-run the program
        } while (reRun);
    }

    /**
     * Prompts the user for a double and returns the inputted value.
     * @param label The label to use while prompting.
     * @return The double inputted by the user.
     */
    private static double getDouble(String label) {
        System.out.printf("Enter the %s number: ", label);
        return scanner.nextDouble();
    }

    /**
     * Displays the passed numbers in order.
     * @param n1 The first number to sort.
     * @param n2 The second number to sort.
     * @param n3 The third number to sort.
     * @param n4 The fourth number to sort.
     * @param n5 The fifth number to sort.
     */
    private static void displaySortedNumbers(double n1, double n2, double n3, double n4, double n5) {
        /** Stores the passed numbers in an array to sort. */
        double[] sortArray = {n1, n2, n3, n4, n5};

        /** Preforms a selection sort on the sort array. */
        for(int i = 0; i < sortArray.length; i++) {
            int swapIndex = i;
            for (int j = i; j < sortArray.length; j++) {
                if(sortArray[j] < sortArray[swapIndex])
                    swapIndex = j;
            }
            double tmp = sortArray[i];
            sortArray[i] = sortArray[swapIndex];
            sortArray[swapIndex] = tmp;
        }
        for (double d : sortArray)
            System.out.print(d + " ");
        System.out.println();
    }
}