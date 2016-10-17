//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: AssigningGrades

package com.cobble.cs.lab9;

import java.util.Scanner;

public class AssigningGrades {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /** Stores if the user wants to re-run the program. */
        boolean reRun;

        do {
            System.out.print("Enter the number of students: "); // Prompts the user to enter number of students.
            /** Stores the grades. */
            int[] grades = new int[scanner.nextInt()];

            System.out.print("Enter " + grades.length + " scores: ");
            for (int i = 0; i < grades.length; i++)
                grades[i] = scanner.nextInt();

            /** Stores the best score. */
            int bestScore = grades[0];

            for (int i : grades)
                if (i > bestScore)
                    bestScore = i;

            for (int i = 0; i < grades.length; i++) {
                String grade = "F";
                if (grades[i] >= bestScore - 10)
                    grade = "A";
                else if (grades[i] >= bestScore - 20)
                    grade = "B";
                else if (grades[i] >= bestScore - 30)
                    grade = "C";
                else if (grades[i] >= bestScore - 40)
                    grade = "D";
                System.out.printf("Student %d score is %d and grade %s%n", i, grades[i], grade);
            }

            System.out.print("Do you want to re-run the program? [y/n]: "); // Prompts the user to re-run the program
            reRun = scanner.next().toLowerCase().charAt(0) == 'y'; // Checks the user input to re-run the program
        } while (reRun);
    }
}