package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    private int sideLengthA;
    private int sideLengthB;

    public Rectangle(int sideLengthA, int sideLengthB) {
        super(sideLengthA*sideLengthB, sideLengthA*2+sideLengthB*2);

        this.sideLengthA = sideLengthA;
        this.sideLengthB = sideLengthB;

    }


    public int getArea() {
        return sideLengthA*sideLengthB;
    }


    public int getCircumference() {
        return sideLengthA*2+sideLengthB*2;
    }

    @Override
    public void calculateArea() {
        System.out.println("Rectangle area: " + getArea());
    }

    @Override
    public void calculateCircumference() {
        System.out.println("Rectangle circumference: " + getCircumference());
    }
}
