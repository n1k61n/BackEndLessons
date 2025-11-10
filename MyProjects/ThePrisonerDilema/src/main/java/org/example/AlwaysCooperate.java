package org.example;
import java.util.List;

public class AlwaysCooperate extends Player {
    public AlwaysCooperate(String name, Boolean choice) {
        super(name, choice);
    }

    @Override
    public boolean strategy(List<Boolean> enemyHistory) {
        return true;
    }
}
