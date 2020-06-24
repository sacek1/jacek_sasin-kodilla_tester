package com.kodilla.abstracts.homework;

public class JobApplication {

    public static void main(String[] args) {

        Person person1 = new Person("Chris Johnson", 30, new Coordinator());
        Person person2 = new Person("Bob Rock", 55, new Operator());
        Person person3 = new Person("Mick Logan", 40, new Storekeeper());

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);


    }
}
