package org.example;



public class Main {
    public static void main(String[] args) {
        int rounds = 100;

        Bot bot1 = new Bot(new TitForTat(), rounds);
        Bot bot2 = new Bot(new AlwaysDefect(), rounds);

        for (int i = 0; i < rounds; i++) {
            boolean move1 = bot1.makeMove(i, bot2.getHistory());
            boolean move2 = bot2.makeMove(i, bot1.getHistory());

            // Scoring logic
            if (move1 && move2) {
                bot1.addScore(3);
                bot2.addScore(3);
            } else if (!move1 && !move2) {
                bot1.addScore(1);
                bot2.addScore(1);
            } else if (move1 && !move2) {
                bot1.addScore(0);
                bot2.addScore(5);
            } else {
                bot1.addScore(5);
                bot2.addScore(0);
            }
        }

        System.out.println("Bot 1 score: " + bot1.getScore());
        System.out.println("Bot 2 score: " + bot2.getScore());
    }
}