package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chrysler chrysler = (Chrysler) o;
        return speed == chrysler.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
