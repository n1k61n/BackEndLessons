package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public  abstract class Player {
    private  String name;
    private List<Boolean> history;
    private Boolean choice;
    private int score;

    public Player(String name, Boolean choice) {
        this.name = name;
        this.choice = choice;
        this.history = new ArrayList<>(Collections.singletonList(choice));
        this.score = 0;
    }

    public abstract boolean strategy(List<Boolean> enemyHistory);

    public Boolean getChoice() {
        return choice;
    }

    public void setChoice(Boolean choice) {
        this.choice = choice;
        addChoiceToHistory(choice);
    }

    public void addChoiceToHistory(Boolean choice){
        history.add(choice);
    }

    public List<Boolean> getHistory() {
        return history;
    }

    public void setHistory(List<Boolean> history) {
        this.history = history;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score += score;
    }


    public String toString(){
        return "Name: " + name  + ", Scores: " + score;
    }
}
