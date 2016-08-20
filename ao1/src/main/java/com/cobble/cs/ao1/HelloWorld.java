//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: AO1 - HelloWorld

package com.cobble.cs.ao1;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = s.nextLine();
        System.out.println("Hello " + name + "!");
    }
}
