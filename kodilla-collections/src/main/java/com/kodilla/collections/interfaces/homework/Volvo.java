package com.kodilla.collections.interfaces.homework;

public class Volvo implements Car {

    private int speed;

    public Volvo (int speed) {
        this.speed = speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + 16;
    }

    @Override
    public void decreaseSpeed() {
        speed = speed - 8;
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}
