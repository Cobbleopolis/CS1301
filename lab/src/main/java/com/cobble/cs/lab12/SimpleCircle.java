//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: SimpleCircle

package com.cobble.cs.lab12;

public class SimpleCircle {
    private static final String PRINT_FORMAT = "The area of the circle of radius %f is %f%n";
    public static void main(String[] args) {

        SimpleCircle circle1 = new SimpleCircle();
        System.out.printf(PRINT_FORMAT, circle1.radius, circle1.getArea());

        SimpleCircle circle2 = new SimpleCircle(25);
        System.out.printf(PRINT_FORMAT, circle2.radius, circle2.getArea());

        SimpleCircle circle3 = new SimpleCircle(125);
        System.out.printf(PRINT_FORMAT, circle3.radius, circle3.getArea());

        circle2.radius = 100;
        System.out.printf(PRINT_FORMAT, circle2.radius, circle2.getArea());

        SimpleCircle circle4 = new SimpleCircle(200);
        System.out.printf(PRINT_FORMAT, circle3.radius, circle3.getArea());

        SimpleCircle circle5 = new SimpleCircle(250);
        System.out.printf(PRINT_FORMAT, circle3.radius, circle3.getArea());
    }

    public double radius;

    /**
     * Constructs a circle w/ a radius of 1.
     */
    SimpleCircle() {
        this(1.0);
    }

    /**
     * Construct a radius with a specific radius.
     * @param radius The radius to construct the circle with.
     */
    SimpleCircle(double radius) {
        this.radius = radius;
    }

    /**
     * Calculates the area of the circle.
     * @return The area of the circle
     */
    double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Calculates the perimeter of the circle.
     * @return The perimeter of the circle.
     */
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * Sets the radius of the circle.
     * @param radius The new radius of the circle.
     */
    void setRadius(double radius) {
        this.radius = radius;
    }
}