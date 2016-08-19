package com.cobble.cs.lab1;

public class Lab1 {

    /** Just a variable used to notate a separation between exercises */
    private static final String separator = "--------";

    public static void main(String[] args) {
        printInfo();
        System.out.println("Lab 1 | Exercise 1");
        exercise1();
        System.out.println(separator);
        System.out.println("Lab 1 | Exercise 2");
        exercise2();
        System.out.println(separator);
        System.out.println("Lab 1 | Exercise 3");
        exercise3();
        System.out.println(separator);
        System.out.println("Lab 1 | Exercise 4");
        exercise4();
        System.out.println(separator);
        System.out.println("Lab 1 | Exercise 5");
        exercise5();
        System.out.println(separator);
        System.out.println("Lab 1 | Exercise 6");
        exercise6();
        System.out.println(separator);
    }

    private static void printInfo() {
        System.out.println("Class:      CS1301");
        System.out.println("Term:       2016");
        System.out.println("Name:       Logan Thompson");
        System.out.println("Instructor: Monisha Verma");
        System.out.println("Assignment: Lab 1");
    }

    private static void exercise1() {
        System.out.println("Name: Logan Thompson");
        System.out.println("Birthday: August 13th, 1997");
        System.out.println("Hobbies: Programming, Gaming, Reading");
        System.out.println("Favorite Book: Ready Player One");
        System.out.println("Favorite Movie: Serenity");
    }

    private static void exercise2() {
        System.out.println("* * * * *");
        System.out.println(" * * * * ");
        System.out.println("  * * *  ");
        System.out.println("   * *   ");
        System.out.println("    *    ");
    }

    private static void exercise3() {
        System.out.println("1*2*3*4*5: " + (2 * 3 * 4 * 5)); //1 isn't needed in the multiplication
    }

    private static void exercise4() {
        /** Variable to hold the width of a rectangle */
        int width = 3;
        /** Variable to hold the height of a rectangle */
        int height = 5;
        System.out.println("Width of the rectangle is " + width);
        System.out.println("Height of the rectangle is " + height);
        System.out.println("Area of a " + width + "x" + height+ ": " + (width * height)); //Prints and calculates the area of a rectangle using the `width` and `height` variables
        System.out.println("Parameter of a " + width + "x" + height+ ": " + ((width * 2) + (height * 2))); //Prints and calculates the parameter of a rectangle using the `width` and `height` variables
    }

    private static void exercise5() {
        /** Variable to hold the default speed in mi/min */
        double speed = 75.0 / 50.0; // Miles per min
        speed *= 60.0; //Miles per hour
        speed *= 1.6; //Km per hour
        System.out.println("Average speed in Km/h: " + speed);
    }

    private static void exercise6() {
        //Prints the info about the errors in Listing 1.4
        System.out.println("Listing 1.4:\n" +
                "\tThere are really only 2 errors in this file.\n" +
                "\t\tFirst, the main method doesn't have it's required return type of \"void\".\n" +
                "\t\tSecond, there is no closing quote for the string that is passed to `System.out.println`.\n" +
                "\t\tAs a side effect of the second syntax error the compiler says that there is no ending semi-colon on line 3.\n" +
                "\t\tThe compiler also says that there is an unexpected end of file because the compiler is still looking for closing curly braces for the blocks associated with the main method and the class because the string on line 3 is never closed.");
        //Prints the info about the errors in Listing 1.5
        System.out.println("Listing 1.5:\n" +
                "\tThere is a runtime error thrown on line 3.\n" +
                "\t\tThe error is thrown only when line 3 is run by the JVM because it is impossible to divide by zero.\n" +
                "\t\tThe compiler wouldn't catch this because this is technically not a syntax error even tough the numbers are hardcoded.");
        //Prints the info about the errors in Listing 1.6
        System.out.println("Listing 1.6:\n" +
                "\tThe logic error is on line 4.\n" +
                "\t\tThis error exists because the phrase `(9 / 5)` does integer math rather than double or float math that is needed to properly do the conversion.\n" +
                "\t\t`(9 / 5)` is 1 where 9 needs to be 9.0 and/or 5 needs to be 5.0 to get the needed 1.8 to correctly do the conversion.");
    }
}
