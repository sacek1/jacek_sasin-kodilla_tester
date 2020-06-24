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
//        List<Order> ordersList = orders
        return orders
                .stream()
                .filter(u -> u.getNumber().equals(number))
                .findFirst().orElseThrow(OrderDoesntExistException::new);

//        if (ordersList.contains(number))
//            return getOrder(number);
//        throw new OrderDoesntExistException();
    }
}
