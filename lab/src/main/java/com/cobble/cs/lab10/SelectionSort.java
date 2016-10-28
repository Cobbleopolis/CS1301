//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: SelectionSort

package com.cobble.cs.lab10;

import java.util.Scanner;

public class SelectionSort {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /** Stores if the user wants to re-run the program. */
        boolean reRun;

        do {
            System.out.print("Enter the number of students: "); // Prompts the user to enter the number of students.
            /** Stores the names inputted from the user. */
            String[] names = new String[scanner.nextInt()];

            System.out.print("Enter the names of the students: ");
            for (int i = 0; i < names.length; i++) // Fills the names array w/ input from the user.
                names[i] = scanner.next();

            System.out.print("List Before Sorting: "); // Prints the list before sorting.
            for (String name : names)
                System.out.print(name + " ");
            System.out.println();

            sortStrings(names); // Calls sortStrings on the names array.

            System.out.print("List After Sorting: "); // Prints the list after sorting.
            for (String name : names)
                System.out.print(name + " ");
            System.out.println();

            System.out.print("Do you want to re-run the program? [y/n]: "); // Prompts the user to re-run the program.
            reRun = scanner.next().toLowerCase().charAt(0) == 'y'; // Checks the user input to re-run the program.
        } while (reRun);
    }

    /**
     * Sorts an array of strings using a selection sort.
     *
     * @param arr The array of strings to sort.
     */
    private static void sortStrings(String[] arr) {
        for (int i = 0; i < arr.length; i++) { // Preforms the actual selection sort.
            /** Stores the index to swap with. */
            int swapIndex = i;
            for (int j = i + 1; j < arr.length; j++) // Finds the lowest value after index i.
                if (arr[j].compareTo(arr[swapIndex]) < 0)
                    swapIndex = j;
            // Swaps the current index w/ the lowest value after it.
            String tmp = arr[i];
            arr[i] = arr[swapIndex];
            arr[swapIndex] = tmp;
        }
    }
}
