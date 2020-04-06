package com.kodilla.abstracts.homework;

public class Operator extends Job {

    public Operator(int salary) {
        super(salary);
    }

    @Override
    public void showSalary() {
        System.out.println("Operator's salary: " + salary);
    }

    @Override
    public void showResponsibilities() {
        System.out.println("Operator's responsibilities: \n- machine service,\n- production maintenance.");
    }
}
