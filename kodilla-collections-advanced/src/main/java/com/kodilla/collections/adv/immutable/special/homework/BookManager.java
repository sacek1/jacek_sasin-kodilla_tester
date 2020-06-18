package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {

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
}
