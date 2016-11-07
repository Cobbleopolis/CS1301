//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: ColumnSorting

package com.cobble.cs.hw8;

import java.util.Scanner;

public class ColumnSorting {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /** Stores if the user wants to re-run the program. */
        boolean reRun;

        do {
            System.out.print("Enter column and rows of the matrix: ");

            /** Stores the matrix inputted by the user. */
            int[][] arr = new int[scanner.nextInt()][scanner.nextInt()];

            System.out.println("Enter the matrix: ");
            for(int[] anArr : arr) // Reads the array in from the user.
                for(int i = 0; i < anArr.length; i++)
                    anArr[i] = scanner.nextInt();

            System.out.println("The array before sorting: ");
            printArray(arr);

            int[][] out = sortColumn(arr);

            System.out.println("The array after sorting: ");
            printArray(out);

            System.out.print("Do you want to re-run the program? [y/n]: "); // Prompts the user to re-run the program
            reRun = scanner.next().toLowerCase().charAt(0) == 'y'; // Checks the user input to re-run the program
        } while (reRun);
    }


    /**
     * Prints an array to the console.
     * @param arr The array to print.
     */
    private static void printArray(int[][] arr) {
        for(int[] anArr : arr) {
            for (int i : anArr)
                System.out.print(i + " ");
            System.out.println();
        }
    }

    /**
     * Sorts a 2D array's columns
     * @param arr The array to sort.
     * @return A new array with the sorted values.
     */
    private static int[][] sortColumn(int[][] arr) {
        /** Stores the values to return. */
        int[][] out = new int[arr.length][];
        // Copies arr to out.
        for(int i = 0; i < arr.length; i++)
            out[i] = arr[i].clone();

        for (int col = 0; col < out[0].length; col++) {
            for(int i = 0; i < out.length; i++) {
                int swp = i;
                for (int j = i; j < out.length; j++) {
                    if (out[j][col] < out[swp][col])
                        swp = j;
                }
                int tmp = out[i][col];
                out[i][col] = out[swp][col];
                out[swp][col] = tmp;
            }
        }

        return out;
    }
}