package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {

        Square square = new Square(40);
        Rectangle rectangle = new Rectangle(10, 20);

        Shape[] shapes = new Shape[] {square, rectangle};

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].toString());
        }

    }
}
