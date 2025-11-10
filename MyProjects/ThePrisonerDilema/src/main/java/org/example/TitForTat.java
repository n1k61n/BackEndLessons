package org.example;

import java.util.List;

public class TitForTat extends Player{

    public TitForTat(String name, Boolean choice) {
        super(name, choice);
    }

    @Override
    public boolean strategy(List<Boolean> enemyHistory) {
        return enemyHistory.get(enemyHistory.size() - 1);
    }
}
