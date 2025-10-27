package org.example;

public class AlwaysDefect implements Strategy{
    @Override
    public boolean cooperate(boolean[] opponentHistory) {
        return false;
    }
}
