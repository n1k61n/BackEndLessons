package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatUI extends JFrame {

    private final JTextField userInput;
    private JButton sendButton;
    private JTextArea outputArea;

    public ChatUI() {
        // Set up the frame
        setTitle("AI Chat");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Top panel (input + button)
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());

        userInput = new JTextField();
        sendButton = new JButton("Send");

        Font font = new Font("Arial", Font.PLAIN, 18);
        userInput.setFont(font);
        sendButton.setFont(font);


        topPanel.add(userInput, BorderLayout.CENTER);
        topPanel.add(sendButton, BorderLayout.EAST);

        // Output area
        outputArea = new JTextArea();
        outputArea.setEditable(false);
        outputArea.setFont(font);

        JScrollPane scrollPane = new JScrollPane(outputArea);

        // Add panels to frame
        add(topPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        // Button action
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = userInput.getText();
                String response = GeminiAi.getResponse(text + " qısaca formada cavab ver.");
                if (!text.isEmpty()) {
                    outputArea.setText("");
                    outputArea.append(response);
                    userInput.setText("");
                }
            }
        });

        setVisible(true);
    }


}

