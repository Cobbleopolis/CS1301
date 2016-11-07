//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: IdenticalArrays

package com.cobble.cs.hw8;

import java.util.Scanner;

public class IdenticalArrays {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /** Stores if the user wants to re-run the program. */
        boolean reRun;

        do {
            /** The first array inputted by the user. */
            int[][] arr1 = getArr("1");

            /** The second array inputted by the user. */
            int[][] arr2 = getArr("2");

            System.out.printf("The two arrays are%s strictly identical%n", equals(arr1, arr2)? "" : " not");

            System.out.print("Do you want to re-run the program? [y/n]: "); // Prompts the user to re-run the program
            reRun = scanner.next().toLowerCase().charAt(0) == 'y'; // Checks the user input to re-run the program
        } while (reRun);
    }

    /**
     * Gets a 3x3 matrix from the user.
     * @param tag The tag to use when prompting the user for input.
     * @return The 3x3 matrix that the user inputted.
     */
    private static int[][] getArr(String tag) {
        System.out.println("Enter 3x3 matrix #" + tag + ":");
        int[][] out = new int[3][3];
        for(int[] anArr : out)
            for(int i = 0; i < anArr.length; i++)
                anArr[i] = scanner.nextInt();
        return out;
    }

    /**
     * Checks if two two-dim arrays are equal.
     * @param arr1 The first array to check.
     * @param arr2 The second array to check.
     * @return True if the two arrays are equal.
     */
    private static boolean equals(int[][] arr1, int[][] arr2) {
        if(arr1.length != arr2.length) // If the # of rows are not the same return false.
            return false;
        for(int i = 0; i < arr1.length; i++) {
            if (arr1[i].length != arr2[i].length)  // If the # of columns in the row i are not the same return false.
                return false;
            for (int j = 0; j < arr1[0].length; j++)
                if (arr1[i][j] != arr2[i][j]) // If any value in the row is not the same return false.
                    return false;
        }
        return true; // Return true if all pass.
    }
}