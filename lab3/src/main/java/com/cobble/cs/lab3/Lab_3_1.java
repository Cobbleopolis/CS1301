//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: Lab_3_1

package com.cobble.cs.lab3;

import java.util.Scanner;

public class Lab_3_1 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter four grades (0-100): "); //Prompts the user for the four grades

        /** An array that holds the grades inputted by the user. */
        int[] grades = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};

        for(int i = 0; i < grades.length; i++)
            System.out.println("Grade #" + i + ": " + grades[i]);

        /** Variable to store the maximum value from grades. */
        int max = grades[0];

        /** Variable to store the minimum value from grades. */
        double min = grades[0];

        /** Variable to store the average value from grades. */
        int avg = 0;

        //Loops over the grade array and finds the maximum and minimum value. It also begins to calculate the average.
        for(int grade : grades) {
            max = Math.max(max, grade);
            min = Math.min(min, grade);
            avg += grade;
        }

        //Finishes calculating the average of the grades.
        avg /= grades.length;

        System.out.println("Maximum grade: " + max);
        System.out.println("Minimum grade: " + min);
        System.out.println("Average grade: " + avg);
    }
}