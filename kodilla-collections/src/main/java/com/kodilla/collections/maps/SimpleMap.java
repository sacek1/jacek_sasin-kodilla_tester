package com.kodilla.collections.maps;

import java.util.HashMap;
import java.util.Map;

public class SimpleMap {

    public static void main(String[] args) {

        /*
         * klucz -> wartość np:
         *
         * String -> String
         * door -> drzwi
         * tree -> drzewo
         * castle -> zamek
         * lock -> zamek
         *
         *
         * String -> String[]
         * zamek -> [castle, lock]
         * lub
         * String -> List<String>
         * zamek -> List {lock, castle}
         * */

        Map<String, String> myMap = new HashMap();

        //dodawanie do mapy
        myMap.put("door", "drzwi");
        myMap.put("tree", "drzewo");

        System.out.println(myMap);

        // pobranie wartosci
        String value = myMap.get("door");
        System.out.println(value);

        // pobranie wsztstkich kluczy
        System.out.println(myMap.keySet());

        // pobranie wartosci
        System.out.println(myMap.values());

        // dodatnie jesli nie ma klucza
        value = myMap.putIfAbsent("door", "wrota");
//        myMap.put("door", "wrota"); // nadpisuje
        System.out.println(myMap);
        System.out.println(value);

        // wartosc domyslna
        value = myMap.getOrDefault("spoon", "brak wartości");
        System.out.println(value);

        // uswanie
        myMap.remove("tree");
        System.out.println(myMap);

        // sprawdzanie czy klucz istnieje
        boolean exists = myMap.containsKey("door");
        System.out.println(exists);

        // iterowanie
        myMap.put("castle", "zamek");
        for (Map.Entry e: myMap.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }
    }

}
