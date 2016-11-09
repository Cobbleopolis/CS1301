package com.cobble.cs.inClass.umlTest;

public class Rectangle extends Shape {
    public double width;
    public double height;

    public Rectangle() {
        this(0.0, 0.0);
    }

    public Rectangle(double width, double height) {
        super(ShapeType.RECTANGLE);
        this.width = width;
        this.height = height;
    }
}
