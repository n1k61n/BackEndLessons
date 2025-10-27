package org.example;

public  class Player {
    private  String name;
    private boolean choice;
    private int score;

    public Player(String name, boolean choice) {
        this.name = name;
        this.choice = choice;
        this.score = 0;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score += score;
    }

    public boolean isChoice() {
        return choice;
    }

    public void setChoice(boolean choice) {
        this.choice = choice;
    }

    public String toString(){
        return "Name: " + name  + ", Scores: " + score;
    }
}
