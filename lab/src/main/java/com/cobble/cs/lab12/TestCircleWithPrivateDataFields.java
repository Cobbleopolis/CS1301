//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: TestCircleWithPrivateDataFields

package com.cobble.cs.lab12;

public class TestCircleWithPrivateDataFields {
    /** Main method */
    public static void main(String[] args) {
        // Create a Circle with radius 5.0
        CircleWithPrivateDataFields myCircle =
                new CircleWithPrivateDataFields(5.0);
        System.out.println("The area of the circle of radius "
                + myCircle.getRadius() + " is " + myCircle.getArea());
        // Increase myCircle's radius by 10%
        myCircle.setRadius(myCircle.getRadius() * 1.1);
        System.out.println("The area of the circle of radius "
                + myCircle.getRadius() + " is " + myCircle.getArea());

        System.out.println("The number of objects created is "
                + CircleWithPrivateDataFields.getNumberOfObjects());

        // Creates yourCircle
        CircleWithPrivateDataFields yourCircle = new CircleWithPrivateDataFields(40.0);

        // Prints the circle info from yourCircle
        System.out.println("The area of the circle of radius "
                + yourCircle.getRadius() + " is " + yourCircle.getArea());
        System.out.println("The number of objects created is "
                + CircleWithPrivateDataFields.getNumberOfObjects());

        // Modifies yourCircle
        yourCircle.setRadius(yourCircle.getArea() * 1.5);

        // Prints the circle info from yourCircle after it's modified
        System.out.println("The area of the circle of radius "
                + yourCircle.getRadius() + " is " + yourCircle.getArea());
        System.out.println("The number of objects created is "
                + CircleWithPrivateDataFields.getNumberOfObjects());
    }
}