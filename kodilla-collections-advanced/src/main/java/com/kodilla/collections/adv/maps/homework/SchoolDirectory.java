package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

import static java.lang.String.format;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schools = new HashMap<>();

        Principal kowalski = new Principal("Tadeusz", "Kowalski");
        Principal nowak = new Principal("Adam", "Nowak");
        Principal jelen = new Principal("Zbigniew", "Jelen");

        School kowalskiSchool = new School("SP 30", 15, 25, 30, 14, 19);
        School nowakSchool = new School("IV LO", 20, 21, 24, 19, 20);
        School jelenSchool = new School("PSK", 10, 12, 30, 27, 20, 15, 13, 28);

        schools.put(kowalski, kowalskiSchool);
        schools.put(nowak, nowakSchool);
        schools.put(jelen, jelenSchool);

        for (Map.Entry<Principal, School> principalEntry : schools.entrySet())
            System.out.println(principalEntry.getKey().getFirstname() + " " + principalEntry.getKey().getLastname() + ", szkola "
                    + principalEntry.getValue() + ", liczba uczniow: " + principalEntry.getValue().schoolSize());

        schools.keySet().forEach(System.out::println);
        schools.values().forEach(System.out::println);

        schools.forEach((k, v) -> {
            System.out.println(format("%s %s, szkola %s, liczba uczniow: %d", k.getFirstname(), k.getLastname(), v, v.schoolSize()));
        });

    }
}
