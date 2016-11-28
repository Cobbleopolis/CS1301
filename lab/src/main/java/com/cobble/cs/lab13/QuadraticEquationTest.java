//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: QuadraticEquationTest

package com.cobble.cs.lab13;

public class QuadraticEquationTest {

    public static void main(String[] args) {
        QuadraticEquation eq = new QuadraticEquation(2, 5, 3);
        System.out.printf("The discriminant for %fx^2 + %fx + %f is %f%n", eq.getA(), eq.getB(), eq.getC(), eq.getDiscriminant());
        System.out.printf("The first root for %fx^2 + %fx + %f is %f%n", eq.getA(), eq.getB(), eq.getC(), eq.getRoot1());
        System.out.printf("The second root for %fx^2 + %fx + %f is %f%n", eq.getA(), eq.getB(), eq.getC(), eq.getRoot2());
    }
}