package org.example;
import java.util.List;

public class CooperateAfterCheat extends Player {
    public CooperateAfterCheat(String name, Boolean choice) {
        super(name, choice);
    }

    @Override
    public boolean strategy(List<Boolean> enemyHistory) {
        int n = enemyHistory.size();
        if (n >= 2 && !enemyHistory.get(n-2) && enemyHistory.get(n-1))
            return true;
        return enemyHistory.get(n-1);
    }
}
