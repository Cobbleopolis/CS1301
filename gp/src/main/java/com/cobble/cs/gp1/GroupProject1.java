//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: GroupProject1

package com.cobble.cs.gp1;

public class GroupProject1 {

    private static final String printStr = "#\n##\n###\n##\n#";

    private static final String[] replaceStrs = {"+", "^", "~", "\\$"};

    public static void main(String[] args) {

        //FRAGMENT GET REST OF CODE

        /** Stores what group the char was in */
        for (int group = 1; group <= 5; group++) {
            if (group == 1)
                System.out.println(printStr);
            else
                System.out.println(printStr.replaceAll("#", replaceStrs[group - 2]));
        }
    }
}