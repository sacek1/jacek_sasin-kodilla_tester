package com.kodilla.abstracts.homework;

public abstract class Job {
    int salary;

    public Job (int salary) {
        this.salary = salary;
    }

    public abstract void showSalary();
    public abstract void showResponsibilities();

}
