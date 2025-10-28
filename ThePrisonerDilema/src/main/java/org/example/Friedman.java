package org.example;

import java.util.List;

public class Friedman extends Player{

    public Friedman(String name, Boolean choice) {
        super(name, choice);
    }

    @Override
    public boolean strategy(List<Boolean> enemyHistory) {
        if (enemyHistory.get(enemyHistory.size() - 1) == false){
            this.setChoice(false);
        }
        return getChoice();
    }
}
