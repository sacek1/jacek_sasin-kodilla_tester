package com.kodilla.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyArrayList {

    public static void main(String[] args) {
        List<String> list = new ArrayList();

        list.add("Jabłko");

        System.out.println(list);

      String result =  list.remove(0);
//        list.remove("Jabłko");

        System.out.println(list);

        list.add("Banan");
        list.add("Gruszka");

        for (String s : list) {
            System.out.println(s);
        }

        List<Integer> intList = Arrays.asList(1, 2, 3);

        System.out.println(intList);

        Collections.singletonList('C');
    }
}
