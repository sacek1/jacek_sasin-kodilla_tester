package com.kodilla.abstracts.homework;

public abstract class Shape {

    protected int area;
    protected int circumference;

    protected int getArea() {
        return area;
    }

    protected int getCircumference() {
        return circumference;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "area=" + area +
                ", circumference=" + circumference +
                '}';
    }
}
