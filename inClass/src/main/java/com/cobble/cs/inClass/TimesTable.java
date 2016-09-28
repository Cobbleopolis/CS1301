//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: TimesTable

package com.cobble.cs.inClass;

import java.util.Scanner;

public class TimesTable {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Times table of: ");
        int n = scanner.nextInt();

        int nLength = Integer.toString(n).length();
        int maxLength = Integer.toString(n * n).length() + 1;

        System.out.printf("%" + nLength + "s |", "*");
        for (int i = 1; i <= n; i++)
            System.out.printf("%" + maxLength + ".0f", (float) i);

        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i <= nLength; i++)
            strBuilder.append('-');
        strBuilder.append("+");
        for (int i = 0; i < n * maxLength; i++)
            strBuilder.append('-');

        System.out.println("\n" + strBuilder.toString());

        for (int i = 1; i <= n; i++) {
            System.out.printf("%" + nLength + "s |", i);
            for (int j = 1; j <= n; j++)
                System.out.printf("%" + maxLength + ".0f", (float) (i * j));
            System.out.println();
        }

    }
}