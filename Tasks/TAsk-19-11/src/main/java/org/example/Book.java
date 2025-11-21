package org.example;

public class Book implements Comparable<Book>{
    private final String name;
    private final Integer pageCount;

    public Book(String name, Integer pageCount) {
        this.name = name;
        this.pageCount = pageCount;
    }

    @Override
    public int compareTo(Book o) {
//        return this.name.compareTo(o.name);
        return this.pageCount.compareTo(o.pageCount);
    }


    @Override
    public String toString() {
        return  name + " " +pageCount;
    }
}
