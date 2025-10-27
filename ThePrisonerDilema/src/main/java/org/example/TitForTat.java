package org.example;

public class TitForTat implements Strategy{
    @Override
    public boolean cooperate(boolean[] opponentHistory) {
        if (opponentHistory.length == 0) return true;
        return opponentHistory[opponentHistory.length - 1];
    }
}
