package com.kodilla.collections.sets.homework;

import com.kodilla.collections.sets.Order;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Grzybobranie", 10, 5.5, true));
        stamps.add(new Stamp("100 lat fabryki cukierków w Tychach", 12.5, 10, false));
        stamps.add(new Stamp("Kwiaty łąk polskich, Mak", 10, 6, true));
        stamps.add(new Stamp("Panorama Warszawy", 12, 18.5, false));
        stamps.add(new Stamp("Panorama Warszawy", 12, 18.5, false));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
