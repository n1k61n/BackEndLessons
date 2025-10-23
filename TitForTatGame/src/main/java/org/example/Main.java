package org.example;

import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Player A = new Player("TitForTat");
        Player B = new Player("Opponent");

        // Пример: Opponent всегда дефектит
        Random random = new Random();
        for (int round = 1; round <= 200; round++) {
            Move moveA = A.nextMove(B);
            Move moveB = random.nextBoolean() ? Move.COOPERATE : Move.DEFECT; // можно заменить на любую стратегию

            A.update(moveA, moveB);
            B.update(moveB, moveA);

            System.out.printf("Раунд %d: A=%s, B=%s | Очки A=%d, B=%d%n",
                    round, moveA, moveB, A.score, B.score);
        }
    }
}
