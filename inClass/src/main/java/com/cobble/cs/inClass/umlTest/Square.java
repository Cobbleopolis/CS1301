package com.cobble.cs.inClass.umlTest;

public class Square extends Rectangle {
    public double sideLength;

    public Square(double sideLength) {
        this.shapeType = ShapeType.SQUARE;
        this.sideLength = sideLength;
    }
}
