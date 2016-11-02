//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: SumArrayColumns

package com.cobble.cs.lab11;

import java.util.Scanner;

public class SumArrayColumns {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /** Stores if the user wants to re-run the program. */
        boolean reRun;

        do {

            System.out.println("Enter a 3x4 matrix: ");

            /** Stores the matrix inputted by a user. */
            double[][] mat = new double[3][4];
            for(int i = 0; i < 3; i++)
                for(int j = 0; j < 4; j++)
                    mat[i][j] = scanner.nextDouble();

            for(int i = 0; i < mat[0].length; i++)
                System.out.printf("Sum of the elements at column %d is %f%n", i, sumColumn(mat, i));

            System.out.print("Do you want to re-run the program? [y/n]: "); // Prompts the user to re-run the program
            reRun = scanner.next().toLowerCase().charAt(0) == 'y'; // Checks the user input to re-run the program
        } while (reRun);
    }

    /**
     * Calculates the sum of a column of a 3 x 4 matrix
     * @param mat The matrix to calculate the sum of one of its column.
     * @param columnIndex The index of the column to get the sum of.
     * @return The sum of the column at columnIndex int the matrix.
     */
    private static double sumColumn(double[][] mat, int columnIndex) {
        double sum = 0;
        for (double[] aMat : mat)
            sum += aMat[columnIndex];
        return sum;
    }
}