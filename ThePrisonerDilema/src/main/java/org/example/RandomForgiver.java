package org.example;
import java.util.List;

public class RandomForgiver extends Player {
    public RandomForgiver(String name, Boolean choice) {
        super(name, choice);
    }

    @Override
    public boolean strategy(List<Boolean> enemyHistory) {
        return Math.random() < 0.7;
    }
}
