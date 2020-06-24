package com.kodilla.exception.homework;

import com.kodilla.exception.AirportNotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Warehouse {

    private List<Order> orders = new ArrayList<>();


    public void addOrder(Order number) {
        orders.add(number);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        return orders
                .stream()
                .filter(u -> u.getNumber().equals(number))
                .findFirst().orElseThrow(OrderDoesntExistException::new);


    }
}
