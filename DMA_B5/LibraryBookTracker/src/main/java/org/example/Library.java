package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    List<Book> books = new ArrayList<>();




    //1. Add Book
    public void addBook(Scanner scanner){
        scanner.nextLine();
        System.out.print("Kitabin adini yazin: ");
        String name = scanner.nextLine();
        books.add(new Book(name));
        System.out.println("Kitab ugurla elave edildi!");
    }

//2. Show All Books
    public void showAllBooks(){
        System.out.println("Kitablarin siyahisi:");
        for(Book book : books){
            System.out.println(book.toString());
        }
    }

//3. Borrow Book
    public void borrowBook(Scanner scanner){
        scanner.nextLine();
        System.out.print("Goturduyunuz kitabin adini yazin: ");
        String name = scanner.nextLine();
        for(Book book : books){
            if(book.title.equals(name)) {
                book.borrowBook();
                break;
            }
        }
    }

//4. Return Book
    public void returnBook(Scanner scanner){
        scanner.nextLine();
        System.out.print("Qytarmaq isdediyinizin  kitabin adini yazin: ");
        String name = scanner.nextLine();
        for(Book book : books){
            if(book.title.equals(name)) {
                book.returnBook();
                break;
            }
        }
    }

}
