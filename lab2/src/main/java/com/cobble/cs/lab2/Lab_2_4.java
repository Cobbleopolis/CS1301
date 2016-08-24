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
        System.out.print("Input the width of the box (integer): "); //Prompts for the width of the box
        int width = scanner.nextInt();
        System.out.print("Input the height of the box (integer): "); //Prompts for the height of the box
        int height = scanner.nextInt();
        System.out.println("The area of the box is " + (width * height)); //Calculates and prints the area of the box
        System.out.println("The parameter of the box is " + (width * 2 + height * 2)); //Calculates and prints the parameter of the box
    }
}
