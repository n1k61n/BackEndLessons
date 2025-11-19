package org.example;

import java.util.Random;

public class PLayer {
    private String name;
    private int score = 0;
    private Hand hand;


    public PLayer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score += score;
    }

    private static Random rnd = new Random();

    private Hand getRandom(){
        return Hand.values()[rnd.nextInt(Hand.values().length)];
    }

    public void setHand(){
        this.hand = getRandom();
    }

    public Hand getHand(){
        return hand;
    }

     public boolean beat(PLayer other){
        if (this.hand == Hand.PAPER && other.getHand() == Hand.ROCK) return true;
        else if (this.hand == Hand.ROCK && other.getHand() == Hand.SCISSOR) return true;
        else if (this.hand == Hand.SCISSOR && other.getHand() == Hand.PAPER) return true;
        return false;
     }


    @Override
    public String toString() {
        return "%s - %s".formatted(name, score);
    }
}

