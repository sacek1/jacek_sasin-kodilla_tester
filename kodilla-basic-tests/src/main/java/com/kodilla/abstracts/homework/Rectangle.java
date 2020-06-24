package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    private int sideLengthA;
    private int sideLengthB;

    public Rectangle(int sideLengthA, int sideLengthB) {

        this.sideLengthA = sideLengthA;
        this.sideLengthB = sideLengthB;
        this.area = calculateArea();
        this.circumference = calculateCircumference();
    }


    public int calculateArea() { return sideLengthA * sideLengthB; }

    public int calculateCircumference() { return sideLengthA * 2 + sideLengthB * 2; }


}
