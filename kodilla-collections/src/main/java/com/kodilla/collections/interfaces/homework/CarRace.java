package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {

        Volvo volvo = new Volvo(80);
        doRace(volvo);

        Chrysler chrysler = new Chrysler(100);
        doRace(chrysler);

        Toyota toyota = new Toyota(95);
        doRace(toyota);
    }

    private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
    }
}
