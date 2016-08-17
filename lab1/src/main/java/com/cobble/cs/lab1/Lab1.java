package com.cobble.cs.lab1;

public class Lab1 {

    private static final String separator = "--------";

    public static void main(String[] args) {
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
        //TODO Exercise 6
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
        System.out.println("1*2*3*4*5: " + (2 * 3 *4 * 5));
    }

    private static void exercise4() {
        int width = 3;
        int height = 5;
        System.out.println("Area of a " + width + "x" + height+ ": " + (width * height));
        System.out.println("Parameter of a " + width + "x" + height+ ": " + ((width * 2) + (height * 2)));
    }

    private static void exercise5() {
        float speed = 75f / 50f; // Miles per min
        speed *= 60f; //Miles per hour
        speed *= 1.6f; //Km per hour
        System.out.println("Average speed in Km/h: " + speed);

    }
}
