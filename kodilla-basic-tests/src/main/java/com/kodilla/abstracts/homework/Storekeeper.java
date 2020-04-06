package com.kodilla.abstracts.homework;

public class Storekeeper extends Job {

    public Storekeeper(int salary) {
        super(salary);
    }

    @Override
    public void showSalary() {
        System.out.println("Storekeeper's salary: " + salary);
    }

    @Override
    public void showResponsibilities() {
        System.out.println("Storekeeper's responsibilities: \n- receipt and cataloging of goods,\n- issue of goods,\n- keeping order in the warehouse.");
    }
}

