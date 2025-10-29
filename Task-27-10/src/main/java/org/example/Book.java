package org.example;

public class Book{
    private String title;
    private String author;
    private Genre genre;
    private Status status;


    public Book(String title, String author, Genre genre, Status status) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.status = status;
    }

    public Genre getGenre() {
        return genre;
    }

    public void borrowBook(){
        if(this.status == Status.AVAILABLE ){
            this.status = Status.BORROWED;
        }
    }

    public void returnBook(){
        if(this.status == Status.BORROWED ){
            this.status = Status.AVAILABLE;
        }
    }

    public void showInfo(){
        System.out.print("Kitabin adi: " + title);
        System.out.println("\tMuellif:  " + author);
    }

    public Status getStatus() {
        return status;
    }
}
