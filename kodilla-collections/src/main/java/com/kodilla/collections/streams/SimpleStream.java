package com.kodilla.collections.streams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

public class SimpleStream {

    public static void main(String[] args) {

        Stream<Integer> integerStream; // zmienna typu Stream zawierajaca obiekty Integer

        List<Integer> myList = asList(1, 4, 5, 8);

        // Stream.of() tworzenie streama z tablicy

        myList.stream()
                .forEach(System.out::println); // wypisywania elementow
//                .forEach(v -> System.out.println(v)); // alternatywne zapisy

        myList.stream()
                .peek(v -> System.out.println("peek: " + v))  // podgladania danych ale nie w kodzie produkcynym
                .forEach(v -> System.out.println("for each " + v)); // labmda typu Consumer

        List<Integer> myNewList = myList.stream()
                .filter(v -> v > 4) // filtorowanie, lambda typu Predicate
                .collect(toList()); // zbieranie danych do listy

        System.out.println(myNewList);


        String collectedString = myList.stream()
                .map(v -> String.valueOf(v)) // mapowanie, lambda typu Function
                .map(v -> "-" + v + "-")
                .collect(Collectors.joining(", "));

        System.out.println(collectedString);


        Map<String, String> myMap = new HashMap<>();
        myMap.put("key1","val1");

        BiConsumer<String, String> myLambda = (String k, String v) -> {
            System.out.println("KEY: " + k);
            System.out.println("VAL: " + v);
        };

        myMap.forEach(myLambda);

    }
}
