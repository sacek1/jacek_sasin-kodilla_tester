package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {

        Square square = new Square(40);
        Rectangle rectangle = new Rectangle(10, 20);

        square.calculateArea();
        rectangle.calculateArea();

        square.calculateCircumference();
        rectangle.calculateCircumference();
    }
}
