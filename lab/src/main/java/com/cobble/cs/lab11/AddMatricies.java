//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: AddMatricies

package com.cobble.cs.lab11;

import java.util.Arrays;
import java.util.Scanner;

public class AddMatricies {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /** Stores if the user wants to re-run the program. */
        boolean reRun;

        do {
            System.out.print("Enter matrix1: ");
            /** The first matrix inputted by the user. */
            double[][] mat1 = new double[3][3];
            populate(mat1);

            System.out.print("Enter matrix2: ");
            /** The second matrix inputted by the user. */
            double[][] mat2 = new double[3][3];
            populate(mat2);

            /** Stores the sum of mat1 and mat2 */
            double[][] add = addMatrix(mat1, mat2);

            for (int i = 0; i < 3; i++)
                System.out.printf("%s  %s  %s  %s  %s%n",
                        getArrayRowString(mat1[i]), //Prints the row of mat1
                        (i == 1) ? "+" : " ",       //Prints the "+" if needed
                        getArrayRowString(mat2[i]), //Prints the row of mat2
                        (i == 1) ? "=" : " ",       //Prints the "=" if needed
                        getArrayRowString(add[i])); //Prints the row of add

            System.out.print("Do you want to re-run the program? [y/n]: "); // Prompts the user to re-run the program
            reRun = scanner.next().toLowerCase().charAt(0) == 'y'; // Checks the user input to re-run the program
        } while (reRun);

    }

    /**
     * Populates a 3 x 3 array with input from the user.
     *
     * @param mat The matrix to populate.
     */
    private static void populate(double[][] mat) {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                mat[i][j] = scanner.nextDouble();
    }


    /**
     * Takes the array, converts it to a string, and cleans it.
     *
     * @param arr The array to convert to a string.
     *
     * @return The array's cleaned string.
     */
    private static String getArrayRowString(double[] arr) {
        return Arrays.toString(arr).replaceAll("[\\[\\],]", "");
    }

    /**
     * Adds two 3 x 3 arrays.
     *
     * @param mat1 The first array to add.
     * @param mat2 The second array to add.
     *
     * @return The sum of mat1 and mat2.
     */
    private static double[][] addMatrix(double[][] mat1, double[][] mat2) {
        double[][] add = new double[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                add[i][j] = mat1[i][j] + mat2[i][j];
        return add;
    }


}