package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books = new ArrayList<>();


//    addBook(Book book)
    public void addBook(Book book){
        if(book != null){
            books.add(book);
        }
        else
            throw new IllegalArgumentException("Book not empty");
    }


//   showAllBooks()
    public void showAllBooks(){
        books.forEach(Book::getInfo);
    }

//   findBook(String title)
    public Book findBook(String title){
        for(Book book : books){
            if(book.getTitle().equals(title)){
                return book;
            }
        }
        return null;
    }
}
