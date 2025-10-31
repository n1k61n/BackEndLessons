package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public  abstract class Player {
    private String name;
    private List<Boolean> history;
    private boolean choice;
    private int score;

    public Player(String name, boolean choice) {
        this.name = name;
        this.choice = choice;
        this.history = new ArrayList<>(List.of(choice));
    }

    public abstract boolean strategy(List<Boolean> enemyHistory);

    public Boolean getChoice() {
        return choice;
    }


    public void setChoice(boolean choice) {
        this.choice = choice;
        this.history.add(choice);
    }



    public List<Boolean> getHistory() {
        return history;
    }

    public void setScore(int score) {
        this.score += score;
    }


    public String toString(){
        return "Name: " + name  + ", Scores: " + score;
    }
}
