package org.example;

import java.util.List;

public class Menu {
    List<String> titles;

    public Menu(List<String> titles) {
        this.titles = titles;
    }

    public void printMenu(){
        for(int i = 0; i < titles.toArray().length; i++){
            System.out.println((i + 1) +" " + titles.get(i));
        }
    }
}
