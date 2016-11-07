//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: LargestRowColumn

package com.cobble.cs.hw8;

import java.util.Random;
import java.util.Scanner;

public class LargestRowColumn {

    private static Random rand = new Random(System.currentTimeMillis());

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /** Stores if the user wants to re-run the program. */
        boolean reRun;

        do {
            int[][] arr = genArray();

            for(int[] anArr : arr) { // Prints the array
                for(int i : anArr)
                    System.out.print(i + " ");
                System.out.println();
            }

            System.out.println("Largest row is at index: " + largestRow(arr));
            System.out.println("Largest column is at index: " + largestColumn(arr));

            System.out.print("Do you want to re-run the program? [y/n]: "); // Prompts the user to re-run the program
            reRun = scanner.next().toLowerCase().charAt(0) == 'y'; // Checks the user input to re-run the program
        } while (reRun);
    }

    /**
     * Generates the 4 x 4 matrix.
     * @return A 4 x 4 matrix containing 1s and 0s.
     */
    private static int[][] genArray() {
        int[][] arr = new int[4][4];

        for (int[] anArr : arr)
            for (int j = 0; j < anArr.length; j++)
                anArr[j] = rand.nextInt(2);
        return arr;
    }

    /**
     * Locates the largest row in an array.
     * @param arr The array to look through.
     * @return The index of the largest row in the array.
     */
    private static int largestRow(int[][] arr) {
        /** Stores the index of the largest row */
        int largestRow = 0;
        /** Stores the largest row value. */
        int largestVal = Integer.MIN_VALUE;
        //Loops over every row and compares its value to the current largest value.
        for(int i = 0; i < arr.length; i++) {
            int rowVal = 0;
            for(int j : arr[i])
                rowVal += j;
            if (rowVal > largestVal){ // If the current row value is larger than the current largest value, update the values.
                largestVal = rowVal;
                largestRow = i;
            }
        }
        return largestRow;
    }

    /**
     * Locates the largest column in an array.
     * @param arr The array to look through.
     * @return The index of the largest column in the array.
     */
    private static int largestColumn(int[][] arr) {
        /** Stores the index of the largest column. */
        int largestColumn = 0;
        /** Stores the value of the largest column. */
        int largestVal = 0;
        //Loops over every column and compares its value to the current largest value.
        for(int i = 0; i < arr[0].length; i++) {
            int columnVal = 0;
            for (int j = 0; j < arr.length; j++)
                columnVal += arr[j][i];
            if (columnVal > largestVal) { // If the current column value is larger than the current largest value, update the values.
                largestVal = columnVal;
                largestColumn = i;
            }
        }
        return largestColumn;
    }
}