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

    public boolean getOrder(String number) throws OrderDoesntExistException {
        List<Order> ordersList = orders
                .stream()
                .filter(u -> u.getNumber().equals(number))
                .collect(Collectors.toList());

        if (ordersList.contains(number))
            return getOrder(number);
        throw new OrderDoesntExistException();
    }
}
