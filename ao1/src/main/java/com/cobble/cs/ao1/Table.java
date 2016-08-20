//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: AO1 - Table

package com.cobble.cs.ao1;

public class Table {

    public static void main(String[] args) {
        System.out.println(formatString("a", "a^2", "a^3"));
        for(int i = 1; i <= 4; i++) {
            System.out.println(formatString(Integer.toString(i), Integer.toString(i * i), Integer.toString(i * i *i)));
        }
    }

    private static String formatString(String str1, String str2, String str3) {
        String separator = "        ";
        return str1 + separator.substring(str1.length()) +
                str2 + separator.substring(str2.length()) +
                str3 + separator.substring(str3.length());
    }
}
