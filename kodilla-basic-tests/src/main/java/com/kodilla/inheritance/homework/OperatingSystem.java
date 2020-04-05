package com.kodilla.inheritance.homework;

public class OperatingSystem {

    private int releaseYear;

    public OperatingSystem(int releaseYear) {
        this.releaseYear = releaseYear;
    }


    public void turnOn() {
        System.out.println("Booting the operating system...");
    }

    public void turnOff() {
        System.out.println("Shutting down...");
    }

}
