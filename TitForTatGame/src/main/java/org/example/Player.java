package org.example;

import java.util.ArrayList;
import java.util.List;

public  class Player {
    String name;
    List<Move> history = new ArrayList<>();
    int score = 0;

    Player(String name) {
        this.name = name;
    }

    Move nextMove(Player opponent) {
        if (opponent.history.isEmpty()) return Move.COOPERATE;
        return opponent.history.get(opponent.history.size() - 1);
    }

    void update(Move myMove, Move opponentMove) {
        history.add(myMove);
        score += payoff(myMove, opponentMove);
    }

    int payoff(Move my, Move opp) {
        if (my == Move.COOPERATE && opp == Move.COOPERATE) return 3;
        if (my == Move.COOPERATE && opp == Move.DEFECT) return 0;
        if (my == Move.DEFECT && opp == Move.COOPERATE) return 5;
        return 1; // both defect
    }
}

