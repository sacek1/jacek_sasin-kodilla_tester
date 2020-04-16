package com.kodilla.interfaces;

public class Circle implements Shape {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public int area() {
        double a = (2*Math.PI*radius);
        System.out.println(a);
        return (int)a;
    }
}
