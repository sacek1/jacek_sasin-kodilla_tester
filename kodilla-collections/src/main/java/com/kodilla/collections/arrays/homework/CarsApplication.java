package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Toyota;
import com.kodilla.collections.interfaces.homework.Chrysler;
import com.kodilla.collections.interfaces.homework.Volvo;

import java.util.Random;

public class CarsApplication {
    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }
    public static Car drawCar() {
        Random random = new Random();
        int drawnCarBrand = random.nextInt(3);
        int a = random.nextInt(180);

        if (drawnCarBrand == 0)
            return new Volvo(a);
        else if (drawnCarBrand == 1)
            return new Chrysler(a);
        else
            return new Toyota(a);
    }
}
