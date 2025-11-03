package org.example;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class StringIterator  implements Iterator<Character>{
    private final String str;
    private int indexNext;


    public StringIterator(String str) {
        this.str = str;
    }


    public boolean hasNext(){
        return indexNext < this.str.length();
    }

    public Character next(){
        if(!this.hasNext())
            throw new NoSuchElementException("empty string");
        return this.str.charAt(this.indexNext++);
    }
}
