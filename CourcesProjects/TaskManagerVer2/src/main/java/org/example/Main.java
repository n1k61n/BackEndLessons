package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame {
    private final TaskManager manager = new TaskManager();
    private final DefaultListModel<String> listModel = new DefaultListModel<>();
    private final JList<String> taskList = new JList<>(listModel);

    public Main() {
        setTitle("Tapşırıq İdarəetmə Sistemi");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        // Panel layout
        JPanel panel = new JPanel(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        // Tapşırıq siyahısı
        refreshTaskList();
        JScrollPane scrollPane = new JScrollPane(taskList);
        panel.add(scrollPane, BorderLayout.CENTER);
        // Aşağı düymələr
        JPanel buttonPanel = new JPanel(new FlowLayout());
        JButton addBtn = new JButton("Əlavə et");
        JButton completeBtn = new JButton("Tamamla");
        JButton deleteBtn = new JButton("Sil");
        JButton refreshBtn = new JButton("Yenilə");
        JButton exitBtn = new JButton("Cixis");
        buttonPanel.add(addBtn);
        buttonPanel.add(completeBtn);
        buttonPanel.add(deleteBtn);
        buttonPanel.add(refreshBtn);
        buttonPanel.add(exitBtn);
        panel.add(buttonPanel, BorderLayout.SOUTH);
        add(panel);
        // Event-lər
        addBtn.addActionListener(e -> addTaskDialog());
        completeBtn.addActionListener(e -> completeSelectedTask());
        deleteBtn.addActionListener(e -> deleteSelectedTask());
        refreshBtn.addActionListener(e -> refreshTaskList());
        exitBtn.addActionListener(e -> System.exit(0));
    }

    private void addTaskDialog() {
        JTextField nameField = new JTextField();
        JTextField descField = new JTextField();
        String[] priorities = {"1 - Yüksək", "2 - Orta", "3 - Aşağı"};
        JComboBox<String> priorityBox = new JComboBox<>(priorities);

        Object[] message = {
                "Tapşırığın adı:", nameField,
                "Təsviri:", descField,
                "Prioritet:", priorityBox
        };

        int option = JOptionPane.showConfirmDialog(this, message, "Yeni tapşırıq əlavə et", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            manager.addTask(nameField.getText(), descField.getText(), priorityBox.getSelectedIndex() + 1);
            refreshTaskList();
        }
    }

    private void completeSelectedTask() {
        int index = taskList.getSelectedIndex();
        if (index == -1) {
            JOptionPane.showMessageDialog(this, "Tapşırıq seçilməyib!");
            return;
        }

        int id = extractIdFromList(index);
        manager.completeTask(id);
        refreshTaskList();
    }

    private void deleteSelectedTask() {
        int index = taskList.getSelectedIndex();
        if (index == -1) {
            JOptionPane.showMessageDialog(this, "Tapşırıq seçilməyib!");
            return;
        }

        int id = extractIdFromList(index);
        manager.removeTask(id);
        refreshTaskList();
    }

    private int extractIdFromList(int index) {
        String line = listModel.get(index);
        String idStr = line.substring(line.indexOf('[') + 1, line.indexOf(']'));
        return Integer.parseInt(idStr);
    }

    private void refreshTaskList() {
        listModel.clear();
        for (Task t : manager.getAllTasks()) {
            listModel.addElement(t.toString());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Main().setVisible(true));
    }
}

