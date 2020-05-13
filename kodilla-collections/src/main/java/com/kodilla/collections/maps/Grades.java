package com.kodilla.collections.maps;

import java.util.ArrayList;
import java.util.List;

public class Grades {

    private String desc;
    private List<Integer> grades = new ArrayList<>();

    public Grades(String desc, int... grades) {

        this.desc = desc;
        for (int i: grades) {
            this.grades.add(i);
        }

    }

    public List<Integer> getGrades() {
        return grades;
    }
}
