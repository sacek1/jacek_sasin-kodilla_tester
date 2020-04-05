package com.kodilla.inheritance.homework;

public class ControlPanel {

    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(2016);
        operatingSystem.turnOn();
        operatingSystem.turnOff();

        OperatingSystemTool1 operatingSystemTool1 = new OperatingSystemTool1(2013);
        operatingSystemTool1.turnOn();

        OperatingSystemTool2 operatingSystemTool2 = new OperatingSystemTool2(2010);
        operatingSystemTool2.turnOff();
    }
}
