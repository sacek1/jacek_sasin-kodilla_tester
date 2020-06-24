package com.kodilla.exception.homework;

import java.util.List;

public class WarehouseApp {
    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();

        warehouse.addOrder(new Order("123"));
        warehouse.addOrder(new Order("234"));
        warehouse.addOrder(new Order("345"));

        try {
            boolean isOrder123 = warehouse.getOrder("123");
            System.out.println("Order number: " + isOrder123);
        } catch (OrderDoesntExistException e) {
            System.out.println("Sorry, this order number doesn't exist");
        }


    }
}
