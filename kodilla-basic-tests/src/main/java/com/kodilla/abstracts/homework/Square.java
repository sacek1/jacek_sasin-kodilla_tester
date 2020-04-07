package com.kodilla.abstracts.homework;

public class Square extends Shape {
    private int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
        this.area = calculateArea();
        this.circumference = calculateCircumference();
    }

    private int calculateArea() {
        return sideLength * sideLength;
    }

    private int calculateCircumference() {
        return sideLength * 4;
    }
}
