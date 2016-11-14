//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: CircleWithStaticMembers

package com.cobble.cs.lab12;

public class CircleWithStaticMembers {

    /** The radius of the circle. */
    double radius;

    /** The number of objects created. */
    static int numberOfObjects = 0;

    /**
     * Construct a circle with a radius of 1.
     */
    CircleWithStaticMembers() {
        this(1);
    }

    /**
     * Construct a radius with a specified radius.
     * @param radius The radius of the circle.
     */
    CircleWithStaticMembers(double radius) {
        this.radius = radius;
        numberOfObjects++;
    }

    /**
     * Gets the number of objects created.
     * @return The number of objects created.
     */
    static int getNumberOfObjects() {
        return numberOfObjects;
    }

    /**
     * Calculates the area of the circle.
     * @return The area of the circle.
     */
    double getArea() {
        return radius * radius * Math.PI;
    }
}