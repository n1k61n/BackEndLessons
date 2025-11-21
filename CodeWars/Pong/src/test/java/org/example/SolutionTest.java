package org.example;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {
    private Pong game = new Pong(2);

    @Test
    void sampleTest() {
        assertEquals("Player 1 has hit the ball!", game.play(50, 53));
        assertEquals("Player 2 has hit the ball!", game.play(100, 97));
        assertEquals("Player 1 has missed the ball!", game.play(0, 4));
        assertEquals("Player 2 has hit the ball!", game.play(25, 25));
        assertEquals("Player 2 has won the game!", game.play(75, 25));
        assertEquals("Game Over!", game.play(50, 50));
    }

    private Pong game2 = new Pong(10);
    private Random random = new Random();

    @Test
    void randomTests() {
        int i = 0;
        while (!game2.isGameOver()) {
            int ballPos = random.nextInt(101); // 0–100 range
            int playerPos = random.nextInt(101);

            String result = game2.play(ballPos, playerPos);

            System.out.printf("Round %d: P1=%d, P2=%d -> %s%n", ++i, ballPos, playerPos, result);

            // Since results are random, we just verify that the result is valid.
            assertTrue(
                    result.matches("Player 1 has hit the ball!") ||
                            result.matches("Player 1 has missed the ball!") ||
                            result.matches("Player 2 has hit the ball!") ||
                            result.matches("Player 2 has missed the ball!") ||
                            result.matches("Player 1 has won the game!") ||
                            result.matches("Player 2 has won the game!") ||
                            result.matches("Game Over!"),
                    "Unexpected output: " + result
            );
        }
    }

}