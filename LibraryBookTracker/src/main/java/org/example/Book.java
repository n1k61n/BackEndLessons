package org.example;

public class Book {
    private static int idCounter = 1;
    int id;
    String title;
    boolean isBorrowed;

    public Book(String title) {
        this.id = idCounter++;
        this.title = title;
        this.isBorrowed = false;
    }


    public void borrowBook(){
        if (!isBorrowed){
            isBorrowed = true;
            System.out.println("kitab borc goturuldu.");
        }
        else{
            System.out.println("kitab borc goturulub");
        }
    }

    public void returnBook(){
        if (isBorrowed){
            isBorrowed = false;
            System.out.println("kitab qaytarildi.");
        }
        else{
            System.out.println("kitab hec goturulmemisdi....");
        }
    }

    //@Override
    public String toString(){
        String res =  id + ": Adi - " + title + " - ";
        res += "borc alinib - " + (isBorrowed ? "He" : "Yox");
        return  res;
    }
}
