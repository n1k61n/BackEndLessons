package org.example;

import java.util.List;

public class Sample extends Player{


    public Sample(String name, Boolean choice) {
        super(name, choice);
    }

    @Override
    public boolean strategy(List<Boolean> enemyHistory) {
        int n =  enemyHistory.size();
        boolean choice = getChoice();
        if(n >= 2 && enemyHistory.get(n - 1) == false && enemyHistory.get(n - 2) == false) {
            choice = false;
        }
        return choice;
    }


}
