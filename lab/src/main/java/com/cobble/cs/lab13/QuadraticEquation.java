//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: QuadraticEquation

package com.cobble.cs.lab13;

public class QuadraticEquation {

    /** The a variable in a quadratic equation. */
    private double a;

    /** The b variable in a quadratic equation. */
    private double b;

    /** The c variable in a quadratic equation. */
    private double c;

    /**
     * Creates a QuadraticEquation with an a, b, and c of 0.0.
     */
    public QuadraticEquation() {
        this(0.0, 0.0, 0.0);
    }

    /**
     * Creates a QuadraticEquation with specific values.
     * @param a The a value of the QuadraticEquation.
     * @param b The b value of the QuadraticEquation.
     * @param c The c value of the QuadraticEquation.
     */
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Gets the a value of the QuadraticEquation.
     * @return The current a value of the QuadraticEquation.
     */
    public double getA() {
        return a;
    }

    /**
     * Sets the a value of the QuadraticEquation.
     * @param a The new a value of the QuadraticEquation.
     */
    public void setA(double a) {
        this.a = a;
    }

    /**
     * Gets the b value of the QuadraticEquation.
     * @return The current b value of the QuadraticEquation.
     */
    public double getB() {
        return a;
    }

    /**
     * Sets the b value of the QuadraticEquation.
     * @param b The new b value of the QuadraticEquation.
     */
    public void setB(double b) {
        this.b = b;
    }

    /**
     * Gets the c value of the QuadraticEquation.
     * @return The current c value of the QuadraticEquation.
     */
    public double getC() {
        return c;
    }

    /**
     * Sets the c value of the QuadraticEquation.
     * @param c The new c value of the QuadraticEquation.
     */
    public void setC(double c) {
        this.c = c;
    }

    /**
     * Calculates the discriminant of the QuadraticEquation.
     * @return The discriminant of the QuadraticEquation.
     */
    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    /**
     * Calculates the first root of the QuadraticEquation.
     * @return The first root of the QuadraticEquation.
     */
    public double getRoot1() {
        if(getDiscriminant() >= 0)
            return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
        else
            return 0;
    }

    /**
     * Calculates the second root of the QuadraticEquation.
     * @return The second root of the QuadraticEquation.
     */
    public double getRoot2() {
        if (getDiscriminant() > 0)
            return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
        else if (getDiscriminant() == 0)
            return getRoot1();
        else
            return 0;
    }
}