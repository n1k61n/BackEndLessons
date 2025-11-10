package org.example.animal.print;

public class Book implements Printable{
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public void printInfo() {
        System.out.println("Kitabin adi " + title);
        System.out.println("Kitabin muellifi " + author);
    }
}
