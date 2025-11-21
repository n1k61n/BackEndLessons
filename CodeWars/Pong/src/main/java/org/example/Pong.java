package org.example;

public class Pong {
    private final int maxScore;
    private final int[] playerScore = new int[2];
    private int player;
    private boolean gameOver;


    public Pong(int maxScore) {
        this.maxScore = maxScore;
    }

    public String play(int ballPos, int playerPos) {
        if (playerScore[0] == maxScore || playerScore[1] == maxScore) {
            restart();
            gameOver = true;
            return "Game Over!";
        }
        player ^= 1;
        boolean hit = Math.abs(ballPos - playerPos) < 4;
        if (hit || ++playerScore[player] < maxScore) {
            return String.format("Player %s has %s the ball!", 2 - player, hit ? "hit" : "missed");
        }
        return String.format("Player %s has won the game!", player + 1);
    }

    public void restart(){
        playerScore[0] = 0;
        playerScore[1] = 0;
        gameOver = false;
    }

    public boolean isGameOver() {
        return gameOver;
    }
}