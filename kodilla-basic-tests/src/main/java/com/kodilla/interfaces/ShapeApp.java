package com.kodilla.interfaces;

public class ShapeApp {

    public static void main(String[] args) {
        Shape square  = new Square(2);
        Shape circle = new Circle(2);

        Shape[] shapes = new Shape[]{square, circle};

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].area());
        }
    }
}
