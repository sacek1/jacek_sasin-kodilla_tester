package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Teacher pesla = new Teacher("Nikolas Pesla");
        Teacher hud = new Teacher("Mrowin Hud");
        students.add(new Student("Mikolaj Nowak", pesla));
        students.add(new Student("Simon Limon", null));
        students.add(new Student("Ana Comito", pesla));
        students.add(new Student("Pit Stop", hud));
        students.add(new Student("Piter Polliter", null));
        students.add(new Student("Un Bossmann", hud));
        students.add(new Student("Lilly Billy", null));



        for (Student student : students) {
            String teacher = Optional.ofNullable(student.getTeacher()).map(t -> t.getName()).orElse("<undefined>");
            System.out.println("uczeń: " + student.getName() + ", nauczyciel: " + student.getTeacher());
        }

    }
    
    
}
