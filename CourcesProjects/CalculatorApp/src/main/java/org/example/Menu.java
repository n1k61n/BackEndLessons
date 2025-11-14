package org.example;

public class Menu {
    private final String[] titles;


    public Menu(String[] titles) {
        this.titles = titles;
    }

    public void printMenu(){
        for(int i = 0; i < titles.length; i++){
            System.out.println((i+1) + ": "+titles[i]);
        }
    }
}
