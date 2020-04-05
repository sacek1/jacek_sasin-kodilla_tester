package com.kodilla.inheritance.homework;

public class OperatingSystemTool2 extends OperatingSystem {

    public OperatingSystemTool2(int releaseYear) {
        super(releaseYear);
    }

    @Override
    public void turnOff() {
        System.out.println("Shutting down using Tool 2...");
    }
}
