package com.kodilla.abstracts.homework;

public class Person {
    public static void main(String[] args) {

        Operator operator = new Operator(4000);
        Coordinator coordinator = new Coordinator(8000);
        Storekeeper storekeeper = new Storekeeper(4500);

        coordinator.showSalary();
        coordinator.showResponsibilities();

        storekeeper.showSalary();
        storekeeper.showResponsibilities();

        operator.showSalary();
        operator.showResponsibilities();
    }
}
