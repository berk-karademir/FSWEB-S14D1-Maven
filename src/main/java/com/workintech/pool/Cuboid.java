package com.workintech.pool;

public class Cuboid extends Rectangle {
    double height;

    //constructor
    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = height < 0 ? 0 : height;
    }

    //methods

    public double getHeight() {
        return height;
    }

    // cuboid's volume formula =  width * length * height (rectangle's area * height)
    public double getVolume() {
        return getArea() * this.height;
    }
}
