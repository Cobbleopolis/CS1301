//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: TestCircleWithStaticMembers

package com.cobble.cs.lab12;

public class TestCircleWithStaticMembers {
    /** Main method */
    public static void main(String[] args) {
        System.out.println("Before creating objects");
        System.out.println("The number of Circle objects is " +
                CircleWithStaticMembers.numberOfObjects);
        // Create c1
        CircleWithStaticMembers c1 = new CircleWithStaticMembers();
        // Display c1 BEFORE c2 is created
        System.out.println("\nAfter creating c1");
        System.out.println("c1: radius (" + c1.radius + ") and number of Circle objects (" + CircleWithStaticMembers.numberOfObjects + ")");
        // Create c2
        CircleWithStaticMembers c2 = new CircleWithStaticMembers(5);
        // Modify c1
        c1.radius = 9;
        // Display c1 and c2 AFTER c2 was created
        System.out.println("\nAfter creating c2 and modifying c1");
        System.out.println("c1: radius (" + c1.radius + ") and number of Circle objects (" + CircleWithStaticMembers.numberOfObjects + ")");
        System.out.println("c2: radius (" + c2.radius + ") and number of Circle objects (" + CircleWithStaticMembers.numberOfObjects + ")");

        // Create c3
        CircleWithStaticMembers c3 = new CircleWithStaticMembers(6);
        // Display c3
        System.out.println("After creating c3");
        System.out.println("c3: radius (" + c3.radius + ") and number of Circle objects (" + CircleWithStaticMembers.numberOfObjects + ")");

        // Create c4
        CircleWithStaticMembers c4 = new CircleWithStaticMembers(8);
        // Display c4
        System.out.println("After creating c4");
        System.out.println("c4: radius (" + c4.radius + ") and number of Circle objects (" + CircleWithStaticMembers.numberOfObjects + ")");
    }
}