package org.example;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();

        // Əvvəlki 5 strategiya
        players.add(new Friedman("Friedman", true));
        players.add(new Joss("Joss", true));
        players.add(new TitForTat("TitForTat", true));
        players.add(new RandomStrategy("Random", true));
        players.add(new Sample("Sample", true));

        // Yeni 10 strategiya
        players.add(new AlwaysCooperate("AlwaysCooperate", true));
        players.add(new AlwaysDefect("AlwaysDefect", false));
        players.add(new GrimTrigger("GrimTrigger", true));
        players.add(new Pavlov("Pavlov", true));
        players.add(new CooperateAfterCheat("CooperateAfterCheat", true));
        players.add(new RandomForgiver("RandomForgiver", true));

        // Oyunları oynat
        for (Player p1 : players) {
            for (Player p2 : players) {
                if (p1 == p2) continue;
                for (int i = 0; i < 200; i++) {
                    gameRound(p1, p2);
                }
            }
        }

        // Sıralama
        players.sort(Comparator.comparingInt(Main::getScore).reversed());

        // Cədvəl nəticələri
        System.out.println("=== Strategiya Nəticələri ===");
        for (Player p : players) {
            System.out.printf("%-25s  Score: %d%n", getPlayerName(p), getScore(p));
        }

        // Qalibləri göstər
        int best = getScore(players.get(0));
        System.out.println("\n🏆 Qalib(-lər):");
        for (Player p : players)
            if (getScore(p) == best)
                System.out.println("→ " + getPlayerName(p) + " (" + best + ")");

    }

    static void gameRound(Player p1, Player p2) {
        boolean c1 = p1.strategy(p2.getHistory());
        boolean c2 = p2.strategy(p1.getHistory());

        p1.setChoice(c1);
        p2.setChoice(c2);

        if (c1 && c2) {
            p1.setScore(3);
            p2.setScore(3);
        } else if (c1 && !c2) {
            p2.setScore(5);
        } else if (!c1 && c2) {
            p1.setScore(5);
        } else {
            p1.setScore(1);
            p2.setScore(1);
        }
    }

    private static int getScore(Player p) {
        String s = p.toString();
        String num = s.replaceAll("[^0-9]", "");
        return Integer.parseInt(num.isEmpty() ? "0" : num);
    }

    private static String getPlayerName(Player p) {
        String s = p.toString();
        return s.split(",")[0].replace("Name: ", "").trim();
    }


}
