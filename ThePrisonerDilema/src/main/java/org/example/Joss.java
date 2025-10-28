package org.example;

import java.util.List;

public class Joss extends Player{

    public Joss(String name, Boolean choice) {
        super(name, choice);
    }

    @Override
    public boolean strategy(List<Boolean> enemyHistory) {
        int cheat = enemyHistory.size() *  10 / 100;
        if (cheat >= enemyHistory.size() / 10) return false;
        return enemyHistory.get(enemyHistory.size() - 1);
    }
}
