package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Chrysler;
import com.kodilla.collections.interfaces.homework.Toyota;
import com.kodilla.collections.interfaces.homework.Volvo;
import com.kodilla.collections.arrays.homework.CarUtils;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Volvo(100));
        cars.add(new Chrysler(20));
        cars.add(new Toyota(50));
        cars.add(new Volvo(80));
        cars.add(new Toyota(104));
        cars.add(new Chrysler(114));

        for (Car car : cars) {
            CarUtils.describeCar(car);
        }


        cars.remove(3);
        cars.remove(new Toyota(104));

        for (Car car : cars) {
            CarUtils.describeCar(car);
        }

        System.out.println(cars.size());

    }
}
