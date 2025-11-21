package org.example;
import java.util.List;

public class Pavlov extends Player {
    public Pavlov(String name, Boolean choice) {
        super(name, choice);
    }

    @Override
    public boolean strategy(List<Boolean> enemyHistory) {
        boolean myLast = getChoice();
        boolean enemyLast = enemyHistory.get(enemyHistory.size() - 1);
        return myLast == enemyLast;
    }
}
