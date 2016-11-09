package com.cobble.cs.inClass.umlTest;

public class Triangle extends Shape {
    public double base;
    public double height;

    public Triangle() {
        this(0.0, 0.0);
    }

    public Triangle(double base, double height) {
        super(ShapeType.TRIANGLE);
        this.base = base;
        this.height = height;
    }
}
