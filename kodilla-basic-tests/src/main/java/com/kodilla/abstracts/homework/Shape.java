package com.kodilla.abstracts.homework;

public abstract class Shape {

    private int area;
    private int circumference;

    public Shape (int area, int circumference) {
    this.area = area;
    this.circumference = circumference;
    }


    public abstract void calculateArea();
    public abstract void calculateCircumference();

}
