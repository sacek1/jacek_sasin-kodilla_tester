package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> classSizes = new ArrayList<>();

    public School(int ... classSizes) {
        for (int classSize : classSizes)
            this.classSizes.add(classSize);
    }

    public int schoolSize() {
        int sum = 0;
        for (int i : classSizes)
            sum = sum + i;
        return sum;
    }
}
