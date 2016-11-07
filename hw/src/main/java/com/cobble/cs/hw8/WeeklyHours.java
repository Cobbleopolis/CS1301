//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: WeeklyHours

package com.cobble.cs.hw8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class WeeklyHours {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the number of employees: ");

        /** Stores the hours from the user. */
        int[][] hours = getHours(scanner.nextInt());

        /** Stores the employee number w/ their total hrs. */
        int[][] totals = getTotalHours(hours);

        Arrays.sort(totals, new Comparator<int[]>() {
            @Override
            public int compare(int i1[], int[] i2) {
                return -Integer.compare(i1[1], i2[1]);
            }
        });

        System.out.println("Employee #\tWeekly hrs.");
        for(int[] total : totals)
            System.out.println(total[0] + "\t\t\t" + total[1]);
    }

    /**
     * Gets the hours from the user.
     * @param numOfEmp The number of employees.
     * @return An array containing the hours worked by each employee.
     */
    private static int[][] getHours(int numOfEmp) {
        System.out.println("Enter the matrix for the hours of " + numOfEmp + " employees:");
        int[][] hours = new int[numOfEmp][7];
        for(int i = 0; i < hours.length; i++)
            for(int j = 0; j < hours[j].length; j++)
                hours[i][j] = scanner.nextInt();
        return hours;
    }

    /**
     * Calculates the total hours for each employee.
     * @param hours the hours for each employee.
     * @return Totals for each employee.
     */
    private static int[][] getTotalHours(int[][] hours) {
        int[][] totals = new int[hours.length][2];
        for(int i = 0; i < hours.length; i++) {
            int total = 0;
            for (int hour : hours[i])
                total += hour;
            totals[i][0] = i;
            totals[i][1] = total;
        }
        return totals;
    }

}