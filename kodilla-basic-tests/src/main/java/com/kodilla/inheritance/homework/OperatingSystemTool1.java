package com.kodilla.inheritance.homework;

public class OperatingSystemTool1 extends OperatingSystem {

    public OperatingSystemTool1(int releaseYear) {
        super(releaseYear);
    }

    @Override
    public void turnOn() {
        System.out.println("Booting the operating system using Tool 1...");
    }
}
