package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {

        BookManager bookManager = new BookManager();

        Book book1 = bookManager.createBook("Thomas Koss", "Long Road");
        Book book2 = bookManager.createBook("Leokadia Kowalska", "Gotuj z Leosią");
        Book book3 = bookManager.createBook("Pong Lee Chan", "Mi hao");
        Book book4 = bookManager.createBook("Pong Lee Chan", "Mi hao");
        System.out.println(bookManager.books.size());
        Book book5 = bookManager.createBook("R.Lewandowski", "Kopanana");
        System.out.println(bookManager.books.size());

        System.out.println(System.identityHashCode(book1));
        System.out.println(System.identityHashCode(book2));
        System.out.println(System.identityHashCode(book3));
        System.out.println(System.identityHashCode(book4));
        System.out.println(System.identityHashCode(book5));
    }
}
