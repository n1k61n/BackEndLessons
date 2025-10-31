import java.util.*;

/**
 * PrisonersDilemma.java
 * Simple console-based Iterated Prisoner's Dilemma simulator.
 *
 * Payoff matrix used (typical values):
 * - Both cooperate: 3,3
 * - One defects, other cooperates: 5,0 (defector gets 5, cooperator gets 0)
 * - Both defect: 1,1
 *
 * Supports strategies:
 * - AlwaysCooperate
 * - AlwaysDefect
 * - TitForTat
 * - RandomStrategy
 * - GrimTrigger
 * - HumanPlayer (interactive)
 *
 * Single-file, minimal dependencies.
 */
public class PrisonersDilemma {

    // Payoffs
    private static final int R = 3; // reward for mutual cooperation
    private static final int T = 5; // temptation to defect
    private static final int S = 0; // sucker's payoff
    private static final int P = 1; // punishment for mutual defection

    // Abstract player
    static abstract class Player {
        protected String name;
        protected List<Boolean> history = new ArrayList<>(); // true = cooperate, false = defect

        public Player(String name) { this.name = name; }

        public abstract boolean move(int round, List<Boolean> opponentHistory);

        public void record(boolean move) { history.add(move); }

        public String getName() { return name; }

        public List<Boolean> getHistory() { return history; }
    }

    // Strategies
    static class AlwaysCooperate extends Player {
        public AlwaysCooperate(String name) { super(name); }
        @Override public boolean move(int round, List<Boolean> opponentHistory) { return true; }
    }

    static class AlwaysDefect extends Player {
        public AlwaysDefect(String name) { super(name); }
        @Override public boolean move(int round, List<Boolean> opponentHistory) { return false; }
    }

    static class TitForTat extends Player {
        public TitForTat(String name) { super(name); }
        @Override
        public boolean move(int round, List<Boolean> opponentHistory) {
            if (round == 0) return true;
            return opponentHistory.get(round - 1);
        }
    }

    static class RandomStrategy extends Player {
        private Random rnd = new Random();
        private double coopProb;
        public RandomStrategy(String name, double coopProb) { super(name); this.coopProb = coopProb; }
        @Override public boolean move(int round, List<Boolean> opponentHistory) { return rnd.nextDouble() < coopProb; }
    }

    static class GrimTrigger extends Player {
        private boolean triggered = false;
        public GrimTrigger(String name) { super(name); }
        @Override
        public boolean move(int round, List<Boolean> opponentHistory) {
            if (triggered) return false;
            if (!opponentHistory.isEmpty() && !opponentHistory.get(opponentHistory.size() - 1)) {
                triggered = true;
                return false;
            }
            return true;
        }
    }

    static class HumanPlayer extends Player {
        private Scanner scanner;
        public HumanPlayer(String name, Scanner scanner) { super(name); this.scanner = scanner; }
        @Override
        public boolean move(int round, List<Boolean> opponentHistory) {
            while (true) {
                System.out.print(name + " — Round " + (round+1) + " (c = cooperate, d = defect): ");
                String s = scanner.nextLine().trim().toLowerCase();
                if (s.equals("c") || s.equals("cooperate") || s.equals("1")) return true;
                if (s.equals("d") || s.equals("defect") || s.equals("0")) return false;
                System.out.println("Unknown input. Type 'c' or 'd'.");
            }
        }
    }

    // Play one iterated match
    public static void playMatch(Player a, Player b, int rounds) {
        int scoreA = 0, scoreB = 0;
        System.out.println("\nStarting match: " + a.getName() + " vs " + b.getName() + " — " + rounds + " rounds\n");

        for (int r = 0; r < rounds; r++) {
            boolean moveA = a.move(r, b.getHistory());
            boolean moveB = b.move(r, a.getHistory());

            a.record(moveA);
            b.record(moveB);

            // Compute payoff
            if (moveA && moveB) {
                scoreA += R; scoreB += R;
            } else if (moveA && !moveB) {
                scoreA += S; scoreB += T;
            } else if (!moveA && moveB) {
                scoreA += T; scoreB += S;
            } else { // both defect
                scoreA += P; scoreB += P;
            }

            System.out.printf("Round %2d: %s -> %s | %s -> %s   (scores: %d - %d)\n",
                    r+1,
                    a.getName(), moveA ? "C" : "D",
                    b.getName(), moveB ? "C" : "D",
                    scoreA, scoreB);
        }

        System.out.println("\nFinal result: " + a.getName() + " " + scoreA + " — " + scoreB + " " + b.getName());
        System.out.println(a.getName() + " history: " + historyString(a.getHistory()));
        System.out.println(b.getName() + " history: " + historyString(b.getHistory()));
    }

    private static String historyString(List<Boolean> h) {
        StringBuilder sb = new StringBuilder();
        for (Boolean b : h) sb.append(b ? 'C' : 'D');
        return sb.toString();
    }

    private static Player createStrategyByChoice(int choice, Scanner scanner, String defaultName) {
        switch (choice) {
            case 1: return new AlwaysCooperate(defaultName + " (Coop)");
            case 2: return new AlwaysDefect(defaultName + " (Def)");
            case 3: return new TitForTat(defaultName + " (TFT)");
            case 4:
                System.out.print("Enter probability of cooperation (0.0 - 1.0), default 0.5: ");
                String s = scanner.nextLine().trim();
                double p = 0.5;
                try { if (!s.isEmpty()) p = Double.parseDouble(s); } catch (Exception e) { p = 0.5; }
                return new RandomStrategy(defaultName + " (Rand p=" + p + ")", Math.max(0.0, Math.min(1.0, p)));
            case 5: return new GrimTrigger(defaultName + " (Grim)");
            case 6: return new HumanPlayer(defaultName + " (Human)", scanner);
            default: return new TitForTat(defaultName + " (TFT)");
        }
    }

    private static void printStrategyMenu() {
        System.out.println("Choose strategy:");
        System.out.println("1) Always Cooperate");
        System.out.println("2) Always Defect");
        System.out.println("3) Tit-for-Tat");
        System.out.println("4) Random (choose probability)");
        System.out.println("5) Grim Trigger");
        System.out.println("6) Human (interactive)");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Prisoner's Dilemma — Iterated Simulator ===");

        while (true) {
            try {
                System.out.println("\nMenu:");
                System.out.println("1) Human vs AI");
                System.out.println("2) AI vs AI (simulate)");
                System.out.println("3) Exit");
                System.out.print("Select option: ");
                String opt = scanner.nextLine().trim();

                if (opt.equals("3") || opt.equalsIgnoreCase("exit")) {
                    System.out.println("Goodbye!");
                    break;
                } else if (opt.equals("1")) {
                    // Human vs AI
                    System.out.print("Enter your name: ");
                    String humanName = scanner.nextLine().trim();
                    if (humanName.isEmpty()) humanName = "Human";

                    System.out.println("\nChoose AI strategy for opponent:");
                    printStrategyMenu();
                    System.out.print("Choice: ");
                    int aiChoice = Integer.parseInt(scanner.nextLine().trim());
                    Player human = new HumanPlayer(humanName, scanner);
                    Player ai = createStrategyByChoice(aiChoice, scanner, "AI");
                    System.out.print("Number of rounds (e.g. 10): ");
                    int rounds = Integer.parseInt(scanner.nextLine().trim());
                    playMatch(human, ai, rounds);

                } else if (opt.equals("2")) {
                    System.out.println("\nChoose strategy for Player A:");
                    printStrategyMenu();
                    System.out.print("Choice A: ");
                    int choiceA = Integer.parseInt(scanner.nextLine().trim());
                    Player a = createStrategyByChoice(choiceA, scanner, "PlayerA");

                    System.out.println("\nChoose strategy for Player B:");
                    printStrategyMenu();
                    System.out.print("Choice B: ");
                    int choiceB = Integer.parseInt(scanner.nextLine().trim());
                    Player b = createStrategyByChoice(choiceB, scanner, "PlayerB");

                    System.out.print("Number of rounds to simulate (e.g. 50): ");
                    int rounds = Integer.parseInt(scanner.nextLine().trim());

                    playMatch(a, b, rounds);
                } else {
                    System.out.println("Unknown option. Choose 1, 2 or 3.");
                }
            } catch (Exception ex) {
                System.out.println("Error: " + ex.getMessage() + ". Restarting menu.");
            }
        }

        scanner.close();
    }
}
