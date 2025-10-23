package org.example;

enum Action { COOPERATE, DEFECT }

interface Player {
    Action nextMove(int round, java.util.List<Action> myHistory, java.util.List<Action> oppHistory);
    String name();
}

class TitForTat implements Player {
    public String name() { return "TitForTat"; }
    public Action nextMove(int round, java.util.List<Action> myHistory, java.util.List<Action> oppHistory) {
        return round == 1 ? Action.COOPERATE : oppHistory.get(oppHistory.size() - 1);
    }
}

class AlwaysDefect implements Player {
    public String name() { return "AlwaysDefect"; }
    public Action nextMove(int round, java.util.List<Action> myHistory, java.util.List<Action> oppHistory) {
        return Action.DEFECT;
    }
}

class AlwaysCooperate implements Player {
    public String name() { return "AlwaysCooperate"; }
    public Action nextMove(int round, java.util.List<Action> myHistory, java.util.List<Action> oppHistory) {
        return Action.COOPERATE;
    }
}

class GrimTrigger implements Player {
    private boolean betrayed = false;
    public String name() { return "GrimTrigger"; }
    public Action nextMove(int round, java.util.List<Action> myHistory, java.util.List<Action> oppHistory) {
        if (round == 1) return Action.COOPERATE;
        if (!betrayed && oppHistory.contains(Action.DEFECT)) betrayed = true;
        return betrayed ? Action.DEFECT : Action.COOPERATE;
    }
}

// ⬇️ Теперь вставь сюда твой класс PrisonersDilemmaGUI

public class PrisonersDilemmaGUI extends JFrame {
    private JComboBox<String> player1Box, player2Box;
    private JButton startButton;
    private JTable resultTable;
    private JLabel scoreLabel;

    private static final int ROUNDS = 20;

    public PrisonersDilemmaGUI() {
        setTitle("Prisoner's Dilemma Simulator");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Top panel: strategy selection
        JPanel topPanel = new JPanel();
        String[] strategies = {"TitForTat", "AlwaysDefect", "AlwaysCooperate", "GrimTrigger"};
        player1Box = new JComboBox<>(strategies);
        player2Box = new JComboBox<>(strategies);
        startButton = new JButton("Start Game");

        topPanel.add(new JLabel("Player 1:"));
        topPanel.add(player1Box);
        topPanel.add(new JLabel("Player 2:"));
        topPanel.add(player2Box);
        topPanel.add(startButton);
        add(topPanel, BorderLayout.NORTH);

        // Center panel: result table
        resultTable = new JTable(new DefaultTableModel(new Object[]{"Round", "P1", "P2"}, 0));
        add(new JScrollPane(resultTable), BorderLayout.CENTER);

        // Bottom panel: score
        scoreLabel = new JLabel("Scores will appear here.");
        add(scoreLabel, BorderLayout.SOUTH);

        // Button action
        startButton.addActionListener(e -> runGame());
    }

    private void runGame() {
        Player p1 = createPlayer((String) player1Box.getSelectedItem());
        Player p2 = createPlayer((String) player2Box.getSelectedItem());

        List<Action> h1 = new ArrayList<>();
        List<Action> h2 = new ArrayList<>();
        int total1 = 0, total2 = 0;

        DefaultTableModel model = (DefaultTableModel) resultTable.getModel();
        model.setRowCount(0);

        for (int round = 1; round <= ROUNDS; round++) {
            Action a1 = p1.nextMove(round, new ArrayList<>(h1), new ArrayList<>(h2));
            Action a2 = p2.nextMove(round, new ArrayList<>(h2), new ArrayList<>(h1));
            h1.add(a1);
            h2.add(a2);

            int[] payoff = getPayoff(a1, a2);
            total1 += payoff[0];
            total2 += payoff[1];

            model.addRow(new Object[]{round, a1, a2});
        }

        scoreLabel.setText("Player 1 (" + p1.name() + ") = " + total1 + " | Player 2 (" + p2.name() + ") = " + total2);
    }
    interface Player {
        Action nextMove(int round, List<Action> myHistory, List<Action> oppHistory);
        String name();
    }

    private Player createPlayer(String name) {
        return switch (name) {
            case "TitForTat" -> new TitForTat();
            case "AlwaysDefect" -> new AlwaysDefect();
            case "AlwaysCooperate" -> new AlwaysCooperate();
            case "GrimTrigger" -> new GrimTrigger();
            default -> throw new IllegalArgumentException("Unknown strategy: " + name);
        };
    }

    private int[] getPayoff(Action a1, Action a2) {
        if (a1 == Action.COOPERATE && a2 == Action.COOPERATE) return new int[]{3, 3};
        if (a1 == Action.COOPERATE && a2 == Action.DEFECT) return new int[]{0, 5};
        if (a1 == Action.DEFECT && a2 == Action.COOPERATE) return new int[]{5, 0};
        return new int[]{1, 1};
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PrisonersDilemmaGUI().setVisible(true));
    }
}