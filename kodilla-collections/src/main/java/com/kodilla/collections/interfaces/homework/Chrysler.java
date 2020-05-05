package com.kodilla.collections.interfaces.homework;

public class Chrysler implements Car {

    private int speed;

    public Chrysler (int speed) {
        this.speed = speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + 20;
    }

    @Override
    public void decreaseSpeed() {
        speed = speed - 10;
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}
