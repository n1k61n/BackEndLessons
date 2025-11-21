package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class GameOfLife extends JPanel implements ActionListener {
    private final int cols = 80;
    private final int rows = 50;
    private boolean[][] grid = new boolean[rows][cols];
    private boolean[][] next = new boolean[rows][cols];
    private final int cellSize = 10; // px

    private final Timer timer;
    private final JButton startBtn = new JButton("Start");
    private final JButton stepBtn = new JButton("Step");
    private final JButton clearBtn = new JButton("Clear");
    private final JButton randomBtn = new JButton("Random");
    private final JSlider speedSlider = new JSlider(10, 500, 100);

    private boolean running = false;

    public GameOfLife() {
        setPreferredSize(new Dimension(cols * cellSize + 1, rows * cellSize + 1));
        setBackground(Color.WHITE);

        // Timer controls the evolution speed
        timer = new Timer(speedSlider.getValue(), e -> step());

        // Controls
        JPanel controls = new JPanel();
        startBtn.addActionListener(e -> toggleRunning());
        stepBtn.addActionListener(e -> { if (!running) step(); });
        clearBtn.addActionListener(e -> { clearGrid(); repaint(); });
        randomBtn.addActionListener(e -> { randomize(); repaint(); });
        speedSlider.addChangeListener(e -> {
            int delay = speedSlider.getValue();
            timer.setDelay(delay);
        });

        controls.add(startBtn);
        controls.add(stepBtn);
        controls.add(randomBtn);
        controls.add(clearBtn);
        controls.add(new JLabel("Speed:"));
        controls.add(speedSlider);

        JFrame frame = new JFrame("Conway's Game of Life");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.add(this, BorderLayout.CENTER);
        frame.add(controls, BorderLayout.SOUTH);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        // Mouse interaction to toggle cells
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int c = e.getX() / cellSize;
                int r = e.getY() / cellSize;
                if (r >= 0 && r < rows && c >= 0 && c < cols) {
                    grid[r][c] = !grid[r][c];
                    repaint();
                }
            }
        });

        // Keyboard shortcuts
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_SPACE) toggleRunning();
                if (e.getKeyCode() == KeyEvent.VK_R) { randomize(); repaint(); }
                if (e.getKeyCode() == KeyEvent.VK_C) { clearGrid(); repaint(); }
                if (e.getKeyCode() == KeyEvent.VK_S) { if (!running) step(); }
            }
        });

        // start paused
    }

    private void toggleRunning() {
        running = !running;
        if (running) {
            startBtn.setText("Stop");
            timer.start();
        } else {
            startBtn.setText("Start");
            timer.stop();
        }
    }

    private void step() {
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                int neighbors = countNeighbors(r, c);
                if (grid[r][c]) {
                    next[r][c] = (neighbors == 2 || neighbors == 3);
                } else {
                    next[r][c] = (neighbors == 3);
                }
            }
        }
        // swap
        boolean[][] tmp = grid;
        grid = next;
        next = tmp;
        repaint();
    }

    private int countNeighbors(int r, int c) {
        int count = 0;
        for (int dr = -1; dr <= 1; dr++) {
            for (int dc = -1; dc <= 1; dc++) {
                if (dr == 0 && dc == 0) continue;
                int nr = r + dr;
                int nc = c + dc;
                if (nr >= 0 && nr < rows && nc >= 0 && nc < cols) {
                    if (grid[nr][nc]) count++;
                }
            }
        }
        return count;
    }

    private void clearGrid() {
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) grid[r][c] = false;
        }
    }

    private void randomize() {
        Random rnd = new Random();
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) grid[r][c] = rnd.nextBoolean() && rnd.nextDouble() < 0.25;
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // draw cells
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c]) {
                    g.setColor(Color.BLACK);
                    g.fillRect(c * cellSize, r * cellSize, cellSize, cellSize);
                } else {
                    g.setColor(Color.LIGHT_GRAY);
                    g.drawRect(c * cellSize, r * cellSize, cellSize, cellSize);
                }
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // not used; Timer uses lambda
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GameOfLife());
    }
}
