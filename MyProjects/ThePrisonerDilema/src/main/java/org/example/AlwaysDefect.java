package org.example;
import java.util.List;

public class AlwaysDefect extends Player {
    public AlwaysDefect(String name, Boolean choice) {
        super(name, choice);
    }

    @Override
    public boolean strategy(List<Boolean> enemyHistory) {
        return false;
    }
}
