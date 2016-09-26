//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: GroupProject1

package com.cobble.cs.gp1;

public class GroupProject1 {

    private static final String printStr = "\0\n\0\0\n\0\0\0\n\0\0\n\0";

    private static final String[] replaceStrs = {"#", "+", "^", "~", "\\$"};

    public static void main(String[] args) {

        //FRAGMENT GET REST OF CODE

        /** Stores what group the char was in */
        for (int group = 1; group <= 5; group++)
            System.out.println(printStr.replaceAll("\0", replaceStrs[group - 1]));
    }
}