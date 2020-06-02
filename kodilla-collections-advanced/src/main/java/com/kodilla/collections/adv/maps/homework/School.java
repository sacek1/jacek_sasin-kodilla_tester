package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> classSizes = new ArrayList<>();
    private int sum;
    private String name;

    public School(String name, int... classSizes) {
        this.name = name;
        for (int classSize : classSizes) {
            this.classSizes.add(classSize);
            sum = sum + classSize;
        }
    }

    // alternatywa niekoniecznie zawsze dobra
    public int schoolSize() {
        return sum;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                '}';
    }
}
