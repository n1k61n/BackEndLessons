package org.example;

import java.util.List;
import java.util.Random;

public class RandomStrategy extends Player{

    public RandomStrategy(String name, Boolean choice) {
        super(name, choice);
    }

    @Override
    public boolean strategy(List<Boolean> enemyHistory) {
        Random random = new Random();
        return random.nextBoolean();
    }
}
