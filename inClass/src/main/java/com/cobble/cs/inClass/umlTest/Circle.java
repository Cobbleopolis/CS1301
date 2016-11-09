package com.cobble.cs.inClass.umlTest;

public class Circle extends Shape {
    public double radius;

    public Circle() {
        this(0.0);
    }

    public Circle(double radius) {
        super(ShapeType.CIRCLE);
        this.radius = radius;
    }
}
