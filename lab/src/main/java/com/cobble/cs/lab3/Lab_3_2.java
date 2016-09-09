//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: Lab_3_2

package com.cobble.cs.lab3;

import java.util.Random;

public class Lab_3_2 {

    /** A random variable used to get the a random int. */
    private static Random rand = new Random();

    public static void main(String[] args) {

        /** Int to store the grade */
        int grade = rand.nextInt(101);

        /** String to store the letter grade of `grade`. */
        String letterGrade = getLetterGrade(grade);

        System.out.println("Grade: " + grade); // Prints grade
        System.out.println("Letter grade: " + letterGrade); // Prints letter grade

    }

    /**
     * Finds the letter grade of the numerical grade
     * @param grade int from 0 - 100 representing the grade
     * @return The letter grade.
     */
    private static String getLetterGrade(int grade) {
        if(grade >= 90)
            return "A";
        else if(grade >= 80 && grade < 90)
            return "B";
        else if(grade >= 70 && grade < 80)
            return "C";
        else if(grade >= 60 && grade < 70)
            return "D";
        else
            return "F";
    }
}