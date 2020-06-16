package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BookManager {

//    Set<Book> bookSet = new HashSet<>();

    List<Book> books = new ArrayList<>();

    public Book createBook (String author, String title) {
        Book tempBook = new Book(author, title);

        if (books.contains(tempBook)) {
            int bookIndex = books.indexOf(tempBook);
            return books.get(bookIndex);
        } else {
            books.add(tempBook);
            return tempBook;
        }
    }

//    public Book createBook(String author, String title) {
//        Book tempBook = new Book(author, title);
//
//        if (bookSet.add(tempBook)) {
//            return tempBook;
//        }
//
//        return bookSet.stream().filter(e -> e.equals(tempBook)).findFirst().get();
//    }
}
