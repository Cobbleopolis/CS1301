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

        /** Stores the forced lowercase char inputted by the user. */
        char c = scanner.next().toLowerCase().charAt(0);

        /** Stores what key the char is on with a default invalid state of -1. */
        int key = -1;

        if (c >= 'a' && c <= 'c') // Checks if on key 2
            key = 2;
        else if (c >= 'd' && c <= 'f') // Checks if on key 3
            key = 3;
        else if (c >= 'g' && c <= 'i') // Checks if on key 4
            key = 4;
        else if (c >= 'j' && c <= 'l') // Checks if on key 5
            key = 5;
        else if (c >= 'm' && c <= 'o') // Checks if on key 6
            key = 6;
        else if (c >= 'p' && c <= 's') // Checks if on key 7
            key = 7;
        else if (c >= 't' && c <= 'v') // Checks if on key 8
            key = 8;
        else if (c >= 'w' && c <= 'z') // Checks if on key 9
            key = 9;

        if (key == -1) // Detects if key is still in its invalid state.
            System.out.println("Invalid option '" + c + "'.");
        else
            System.out.println("The corresponding number is " + key);
    }
}