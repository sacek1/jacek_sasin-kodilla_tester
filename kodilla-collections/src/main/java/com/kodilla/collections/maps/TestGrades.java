package com.kodilla.collections.maps;

public class TestGrades {

    public static void main(String[] args) {
        Grades g1 = new Grades("desc 1", 1, 2);
        System.out.println(g1.getGrades());
        Grades g2 = new Grades("desc 2",1, 2, 5, 6, 78, 8, 3, 2, 1);
        System.out.println(g2.getGrades());
    }
}
