//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: RowSorting

package com.cobble.cs.lab11;

import java.util.Arrays;
import java.util.Scanner;

public class RowSorting {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /** Stores if the user wants to re-run the program. */
        boolean reRun;

        do {
            System.out.println("Enter a 3x3 matrix row by row: ");
            double[][] mat = new double[3][3];
            for(int i = 0; i < mat.length; i++)
                for(int j = 0; j < mat[i].length; j++)
                    mat[i][j] = scanner.nextDouble();

            double[][] sorted = sortRows(mat);

            System.out.println("The sorted array is");
            for(double[] arr : sorted)
                System.out.println(Arrays.toString(arr).replaceAll("[\\[\\],]", ""));

            System.out.print("Do you want to re-run the program? [y/n]: "); // Prompts the user to re-run the program
            reRun = scanner.next().toLowerCase().charAt(0) == 'y'; // Checks the user input to re-run the program
        } while (reRun);

    }

    private static double[][] sortRows(double[][] mat) {
        /** Stores a clone of mat. */
        double[][] out = new double[mat.length][];
        //Clones mat into out
        for(int i = 0; i < mat.length; i++)
            out[i] = mat[i].clone();
        /** Preforms a selection sort on the sort array. */
        for(double[] arr : out)
            for (int i = 0; i < arr.length; i++) {
                int swp = i;
                for (int j = i; j < arr.length; j++) {
                    if (arr[j] < arr[swp])
                        swp = j;
                }
                double tmp = arr[i];
                arr[i] = arr[swp];
                arr[swp] = tmp;
            }
        return out;
    }
}