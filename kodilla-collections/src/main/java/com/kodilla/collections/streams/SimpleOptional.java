package com.kodilla.collections.streams;

import java.util.Optional;

public class SimpleOptional {

    public static void main(String[] args) {

//        String myString = "sss";
//        myMethiod(myString);

        Optional<String> myVAl = getString();

        String i = myVAl.orElse("był tutaj null");

        System.out.println(i);
    }

    public static void myMethiod(String s) {
        if (s == null) {
            return;
        }
        System.out.println(s.length());

    }

    public static Optional<String> getString() {
        return Optional.ofNullable("jakis tekst");
    }
}
