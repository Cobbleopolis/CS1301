//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: KeyPad

package com.cobble.cs.lab5;

import java.util.Scanner;

public class KeyPad {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a letter: ");

        char c = scanner.next().toLowerCase().charAt(0);

        int key = -1;

        if (c >= 'a' && c <= 'c')
            key = 2;
        else if (c >= 'd' && c <= 'f')
            key = 3;
        else if (c >= 'g' && c <= 'i')
            key = 4;
        else if (c >= 'j' && c <= 'l')
            key = 5;
        else if (c >= 'm' && c <= 'o')
            key = 6;
        else if (c >= 'p' && c <= 's')
            key = 7;
        else if (c >= 't' && c <= 'v')
            key = 8;
        else if (c >= 'w' && c <= 'z')
            key = 9;

        if (key == -1)
            System.out.println("Invalid option '" + c + "'.");
        else
            System.out.println("The corresponding number is " + key);
    }
}