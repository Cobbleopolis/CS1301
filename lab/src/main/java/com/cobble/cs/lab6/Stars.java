//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: Stars

package com.cobble.cs.lab6;

public class Stars {
    public static void main(String[] args) {
        /** The starting number of stars to print */
        int startingNum = 8;

        for(int i = startingNum; i > 0; i--) { //Loop for each row
            for(int j = i; j > 0; j--) // Loop for each star
                System.out.print('*'); // Prints each star
            System.out.println(); // Returns after each row
        }
    }
}