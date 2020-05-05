package com.kodilla.collections.interfaces;

public class Triangle implements Shape {

    private double width;
    private double height;
    private double hypotenuse;

    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
        hypotenuse = Math.sqrt(Math.pow(width,2) + Math.pow(height,2));
    }

    @Override
    public double getArea() {
        return 0.5 * width * height;
    }

    @Override
    public double getPerimeter() {
        return hypotenuse + width + height;
    }
}
