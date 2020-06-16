package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookAplication {
    public static void main(String[] args) {


        BookManager bookManager = new BookManager();
        Book book1 = bookManager.createBook("Thomas Koss", "Long Road");
        System.out.println(bookManager.books.size());
        Book book2 = bookManager.createBook("Thomas Koss", "Long Road");
        System.out.println(bookManager.books.size());
        Book book3 = bookManager.createBook("Leokadia Kowalska", "Gotuj z Leosią");
        System.out.println(bookManager.books.size());
//        BookManager.createBook("Pong Lee Chan", "Mi hao");

        System.out.println(System.identityHashCode(book1));
        System.out.println(System.identityHashCode(book2));
        System.out.println(System.identityHashCode(book3));
    }
}
