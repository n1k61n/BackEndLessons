package org.example.animal.print;

public class Magazine implements Printable{
    String title;

    public Magazine(String title) {
        this.title = title;
    }

    @Override
    public void printInfo() {
        System.out.println("Magazine " + title);
    }
}
