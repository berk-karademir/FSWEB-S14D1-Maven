package com.workintech.cylinder;

public class Cylinder extends Circle{
    double height;

    public Cylinder( double radius, double height){
        super(radius);
        this.height = height < 0 ? 0 : height;
    }

    public double getHeight() {
        return height;
    }
// cylinder volume formula: pi * r * r * h (circle's area * h)
    public double getVolume() {
        return getArea() * getHeight();
    }

}
