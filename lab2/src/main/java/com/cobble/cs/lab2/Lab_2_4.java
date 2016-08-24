//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: Lab_2_4

package com.cobble.cs.lab2;

import java.util.Scanner;

public class Lab_2_4 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input the side length of the square (integer): "); //Prompts for the side length of the square
        int sideLength = scanner.nextInt();
        System.out.println("The area of the box is " + (sideLength * sideLength)); //Calculates and prints the area of the square
        System.out.println("The parameter of the box is " + (sideLength * 4)); //Calculates and prints the parameter of the square
    }
}
