package com.workintech.cylinder;

public class Circle {
    private double radius;

    //constructor
    public Circle(double radius) {
        this.radius = radius < 0 ? 0 : radius;
    }

    // radius getter
    public double getRadius() {
        return radius;
    }

    public double getArea(double radius) {
        return Math.PI * (radius * radius);
    }
}
