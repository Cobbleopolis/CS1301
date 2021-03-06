//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson, Noah Weber, and Luke Williams
//Instructor: Monisha Verma
//Assignment: GroupProject1

/**
 * Description:
 * 1.Generate a number between 97 & 122 ( inclusive )
 * 2. Convert the number to a character (ASCII)
 * 3. Place the character  into 1 of 5 groups
 * --
 * a-f : 1
 * g-l : 2
 * m-r: 3
 * s-x: 4
 * y-z: 5
 *
 * 4. If  in group 1
 * print out picture with "#" using loop
 *
 * #
 * ##
 * ###
 * ##
 * #
 *
 * If in group 2 print picture with "t" using loop
 * if in group 3 print picture with "^" using loop
 * If in group 4 print picture with "~"
 * if in group 5 print picture with "$"
 *
 * Assumptions: All character values are between 97 and 122
 * Rules: If character is in group 1 the image will be made in "#", if in group 2 the image will be made in "+", if in group 3 the image will be made in "^", if in group 4 the image will be made in "~", if in group 5 the image will be made in "$"
 * Inputs: None from user.
 * Outputs: The character, the character's group, and the image based on the character's group
 */

package com.cobble.cs.gp1;

import java.util.Random;

public class GroupProject1 {

    private static final String printStr = "\0\n\0\0\n\0\0\0\n\0\0\n\0";

    private static final Random rand = new Random(System.currentTimeMillis());

    public static void main(String[] args) {

        /** Gets a random int from 97 to 122 inclusive. */
        int i = 97 + rand.nextInt(26);

        /** Converts `i` to a char. */
        char c = (char) i;

        /** Variable to store the group of `c`. */
        int group = -1;

        if (c >= 'a' && c <= 'f') // If `c` is in group 1.
            group = 1;
        else if (c >= 'g' && c <= 'l') // If `c` is in group 2.
            group = 2;
        else if (c >= 'm' && c <= 'r') // If `c` is in group 3.
            group = 3;
        else if (c >= 's' && c <= 'x') // If `c` is in group 4.
            group = 4;
        else if (c >= 'y' && c <= 'z') // If `c` is in group 5.
            group = 5;

        System.out.printf("Character: %c | Group: %d%n", c, group); // Prints the character and the group it's in.

        switch (group) {
            case 1:
                System.out.println(printStr.replaceAll("\0", "#"));
                break; // Replaces the `printStr` with the correct values for group 1.
            case 2:
                System.out.println(printStr.replaceAll("\0", "+"));
                break; // Replaces the `printStr` with the correct values for group 2.
            case 3:
                System.out.println(printStr.replaceAll("\0", "^"));
                break; // Replaces the `printStr` with the correct values for group 3.
            case 4:
                System.out.println(printStr.replaceAll("\0", "~"));
                break; // Replaces the `printStr` with the correct values for group 4.
            case 5:
                System.out.println(printStr.replaceAll("\0", "\\$"));
                break; // Replaces the `printStr` with the correct values for group 5.
            default:
                System.out.println("Invalid value!"); // Catches if the value is invalid
        }
    }
}