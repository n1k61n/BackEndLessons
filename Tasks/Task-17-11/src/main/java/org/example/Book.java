package org.example;

/*
5. Library sistemi
Təsvir:
 Book: sahələr title, author, year
 Library: ArrayList<Book> saxlayır
o addBook(Book book)
o showAllBooks()
o findBook(String title)
 */

import lombok.Getter;

public class Book {
    @Getter
    private String title;
    private final String author;
    private final int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void getInfo(){
        System.out.printf("Title: %s Author: %s Year %s\n", title, author, year);
    }

}
