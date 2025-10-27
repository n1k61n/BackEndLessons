package org.example;

public class Bot {
    private Strategy strategy;
    private boolean[] history;
    private int score;

    public Bot(Strategy strategy, int rounds) {
        this.strategy = strategy;
        this.history = new boolean[rounds];
        this.score = 0;
    }

    public boolean makeMove(int round, boolean[] opponentHistory) {
        boolean move = strategy.cooperate(opponentHistory);
        history[round] = move;
        return move;
    }

    public boolean[] getHistory() {
        return history;
    }

    public void addScore(int points) {
        score += points;
    }

    public int getScore() {
        return score;
    }
}
