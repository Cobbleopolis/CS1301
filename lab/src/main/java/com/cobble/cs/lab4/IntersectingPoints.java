//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: IntersectingPoints

package com.cobble.cs.lab4;

import java.util.Scanner;

public class IntersectingPoints {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /** The first point. */
        Point p1 = getPoint(1);

        /** The second point. */
        Point p2 = getPoint(2);

        /** The third point. */
        Point p3 = getPoint(3);

        /** The fourth point. */
        Point p4 = getPoint(4);

        /** The slope of the first function. */
        double m1 = p1.getSlope(p2);

        /** The slope of the second function. */
        double m2 = p3.getSlope(p4);

        /** The y-intercept of the first function. */
        double b1 = p1.getYIntercept(m1);

        /** The y-intercept of the second function. */
        double b2 = p3.getYIntercept(m2);

        if (m1 == m2) {
            System.out.println("The two lines are parallel");
        } else {
            //TODO get math to work.
            /** The x coordinate of the point. */
            double x = (b2 - b1) / (m1 - m2);

            /** The y coordinate of the intersection. */
            double y = m1 * x + b1;

            System.out.println("The intersecting point is at (" + x + ", " + y + ").");
        }
    }

    /**
     * Gets a point from the user
     * @param pointNum The number for the point used in the prompt.
     * @return The point inputted by the user
     */
    private static Point getPoint(int pointNum) {
        System.out.print("Enter point #" + pointNum + " (x" + pointNum + ", y" + pointNum + "): ");
        return new Point(scanner.nextDouble(), scanner.nextDouble());
    }

    /**
     * Represents a 2D point.
     */
    private static class Point {

        /** Stores the x value of the point. */
        double x;
        /** Stores the y value of the point. */
        double y;

        /**
         * Creates a {@link com.cobble.cs.lab4.IntersectingPoints.Point}
         * @param x The x value of the point.
         * @param y The y value of the point.
         */
        Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        /**
         * Gets the slope between two points.
         * @param other The other point on the line.
         * @return The slope between the two point.
         */
        double getSlope(Point other) {
            return (y - other.y) / (x - other.x);
        }

        /**
         * Calculates the y-intercept of a line that passes through this and has slope `m`.
         * @param m The slope of the line.
         * @return The y-intercept of the line.
         */
        double getYIntercept(double m) {
            return (Math.signum(x) * (m * x)) + y;
        }
    }
}