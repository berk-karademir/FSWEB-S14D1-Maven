package com.workintech.pool;

public class Rectangle {
    double width;
    double length;

    // constructor for both vars
    public Rectangle(double width, double length) {
        this.width = width < 0 ? 0 : width;
        this.length = length < 0 ? 0 : length;
    }

    //methods
    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
// rectangle area formula = width* length
    public double getArea() {
        return width * length;
    }
}
