package com.kodilla.abstracts.homework;

public class Coordinator extends Job {

    public Coordinator(int salary) {
        super(salary);
    }

    @Override
    public void showSalary() {
        System.out.println("Coordinator's salary: " + salary);
    }

    @Override
    public void showResponsibilities() {
        System.out.println("Coordinator's responsibilities: \n- coordinating the work of operators and storekeepers,\n- preparing reports on the department's work.");
    }
}
