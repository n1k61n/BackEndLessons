package org.example;

import java.util.List;

public class Friedman extends Player{

    public Friedman(String name, Boolean choice) {
        super(name, choice);
    }

    @Override
    public boolean strategy(List<Boolean> enemyHistory) {
        // Əgər heç bir tarix yoxdur (ilk gediş) → əməkdaşlıq et
        if (enemyHistory.isEmpty()) return true;

        // Əgər rəqib tarixində haradasa xəyanət varsa → daimi xəyanət
        if (enemyHistory.contains(false)) {
            return false;
        }

        // Əks halda əməkdaşlığı davam et
        return true;
    }
}
