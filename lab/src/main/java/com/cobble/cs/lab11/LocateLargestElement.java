//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: LocateLargestElement

package com.cobble.cs.lab11;

import java.util.Arrays;
import java.util.Scanner;

public class LocateLargestElement {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /** Stores if the user wants to re-run the program. */
        boolean reRun;

        do {
            System.out.print("Enter the number of rows and columns of the matrix: ");

            /** Stores the matrix inputted by the user. */
            double[][] mat = new double[scanner.nextInt()][scanner.nextInt()];

            System.out.println("Enter the array:");
            // Populates mat w/ values from the user.
            for (int i = 0; i < mat.length; i++)
                for (int j = 0; j < mat[i].length; j++)
                    mat[i][j] = scanner.nextDouble();

            /** Stores the coordinates of the largest value in mat. */
            int[] largestCoord = locateLargest(mat);

            // Prints the largest coordinate in mat.
            System.out.printf("The location of the largest element is at (%d, %d)%n", largestCoord[0], largestCoord[1]);

            System.out.print("Do you want to re-run the program? [y/n]: "); // Prompts the user to re-run the program
            reRun = scanner.next().toLowerCase().charAt(0) == 'y'; // Checks the user input to re-run the program
        } while (reRun);

    }

    /**
     * Finds the largest double in the passed array.
     *
     * @param mat The array to search through.
     *
     * @return The coordinates of the largest value in the passed array.
     */
    private static int[] locateLargest(double[][] mat) {
        int[] coord = new int[2];
        double currMax = Double.MIN_VALUE;
        for (int i = 0; i < mat.length; i++)
            for (int j = 0; j < mat[i].length; j++)
                if (mat[i][j] > currMax) {
                    currMax = mat[i][j];
                    coord[0] = i;
                    coord[1] = j;
                }
        return coord;
    }
}