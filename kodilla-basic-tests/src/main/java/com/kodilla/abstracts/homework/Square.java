package com.kodilla.abstracts.homework;

public class Square extends Shape {
    private int sideLength;


    public Square(int sideLength) {
        super(sideLength*sideLength, sideLength*4);
        this.sideLength = sideLength;

    }


    public int getArea() {
        return sideLength*sideLength;
    }


    public int getCircumference() {
        return sideLength*4;
    }

    @Override
    public void calculateArea() {
        System.out.println("Square area: " + getArea());
    }

    @Override
    public void calculateCircumference() {
        System.out.println("Square circumference: " + getCircumference());
    }
}
