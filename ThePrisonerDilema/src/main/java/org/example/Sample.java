package org.example;

import java.util.List;

public class Sample extends Player{


    public Sample(String name, Boolean choice) {
        super(name, choice);
    }

    @Override
    public boolean strategy(List<Boolean> enemyHistory) {
        int n =  enemyHistory.size();
        if(n >= 2 && !enemyHistory.get(n - 1) && !enemyHistory.get(n - 2)){
            return false;
        }
        return true;
    }
}
