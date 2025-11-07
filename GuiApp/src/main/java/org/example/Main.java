package org.example;

import javax.swing.*;
import java.awt.*;



public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Two Buttons Example");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        JMenuBar menuBar = getJMenuBar(frame);
        frame.setJMenuBar(menuBar);

        JButton button1 = new JButton("Click Me");
        button1.setBounds(50, 70, 100, 30);


        JButton button2 = new JButton("Exit");
        button2.setBounds(180, 70, 100, 30);

        JButton button3 = new JButton("New windows");
        button3.setBounds(310, 70, 100, 30);


        button1.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Button 1 clicked!"));
        button2.addActionListener(e -> System.exit(0)); // closes program
        button3.addActionListener(e->openNewWindow());
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        frame.setVisible(true);

    }

    private static JMenuBar getJMenuBar(JFrame frame) {
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");

        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");


        newItem.addActionListener(e -> JOptionPane.showMessageDialog(frame, "New file created!"));
        openItem.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Opening file..."));
        exitItem.addActionListener(e -> System.exit(0));


        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        return menuBar;
    }

    private static void openNewWindow() {
        JFrame newFrame = new JFrame("New Window");
        newFrame.setSize(300, 150);
        newFrame.setLayout(null);

        JLabel label = new JLabel("This is a new window!");
        label.setBounds(80, 40, 200, 30);
        newFrame.add(label);

        newFrame.setVisible(true);
    }
}