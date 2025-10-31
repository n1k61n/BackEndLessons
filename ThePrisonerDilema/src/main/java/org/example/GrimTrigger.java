package org.example;
import java.util.List;

public class GrimTrigger extends Player {
    public GrimTrigger(String name, Boolean choice) {
        super(name, choice);
    }

    @Override
    public boolean strategy(List<Boolean> enemyHistory) {
        return !enemyHistory.contains(false);
    }
}
