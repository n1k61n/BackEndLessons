package org.example;

import java.util.List;

public class Joss extends Player{

    public Joss(String name, Boolean choice) {
        super(name, choice);
    }

    @Override
    public boolean strategy(List<Boolean> enemyHistory) {
        if (Math.random() < 0.1) return false; // 10% ehtimalla xəyanət et
        return enemyHistory.get(enemyHistory.size() - 1);
    }
}
