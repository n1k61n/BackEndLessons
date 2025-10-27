package org.example;

public class AlwaysCooperate implements Strategy{
    @Override
    public boolean cooperate(boolean[] opponentHistory) {
        return true;
    }
}
