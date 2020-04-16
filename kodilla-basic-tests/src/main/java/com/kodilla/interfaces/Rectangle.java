package com.kodilla.interfaces;

public class Rectangle implements Shape {

    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int area() {
        return a*b;
    }
}
