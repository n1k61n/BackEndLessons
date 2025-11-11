package org.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;


public class Main extends Application {
    private final TaskManager manager = new TaskManager();
    private final ListView<String> taskList = new ListView<>();

    static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle(" Tapşırıq İdarəetmə Sistemi");
        BorderPane root = new BorderPane();
        root.setPadding(new Insets(10));
        refreshTaskList();
        root.setCenter(taskList);
        // Buttons
        HBox buttons = new HBox(10);
        Button addBtn = new Button("Əlavə et");
        Button completeBtn = new Button("Tamamla");
        Button deleteBtn = new Button("Sil");
        Button refreshBtn = new Button("Yenilə");
        Button exitBtn = new Button("Cixis");
        buttons.getChildren().addAll(addBtn, completeBtn, deleteBtn, refreshBtn, exitBtn);
        root.setBottom(buttons);
        // Event handlers
        addBtn.setOnAction(_ -> addTaskDialog());
        completeBtn.setOnAction(_ -> completeSelectedTask());
        deleteBtn.setOnAction(_ -> deleteSelectedTask());
        refreshBtn.setOnAction(_ -> refreshTaskList());
        exitBtn.setOnAction(_ -> System.exit(0));
        Scene scene = new Scene(root, 600, 400);
        stage.setScene(scene);
        stage.show();
    }

    private void addTaskDialog() {
        Dialog<Task> dialog = new Dialog<>();
        dialog.setTitle("Yeni Tapşırıq");

        Label nameLabel = new Label("Adı:");
        TextField nameField = new TextField();
        Label descLabel = new Label("Təsviri:");
        TextField descField = new TextField();
        Label prioLabel = new Label("Prioritet:");
        ComboBox<Integer> prioBox = new ComboBox<>();
        prioBox.getItems().addAll(1, 2, 3);
        prioBox.setValue(2);

        GridPane grid = new GridPane();
        grid.setVgap(10);
        grid.setHgap(10);
        grid.add(nameLabel, 0, 0);
        grid.add(nameField, 1, 0);
        grid.add(descLabel, 0, 1);
        grid.add(descField, 1, 1);
        grid.add(prioLabel, 0, 2);
        grid.add(prioBox, 1, 2);

        dialog.getDialogPane().setContent(grid);
        dialog.getDialogPane().getButtonTypes().addAll(ButtonType.OK, ButtonType.CANCEL);

        dialog.setResultConverter(button -> {
            if (button == ButtonType.OK) {
                return new Task(0, nameField.getText(), descField.getText(), prioBox.getValue());
            }
            return null;
        });

        dialog.showAndWait().ifPresent(task -> {
            manager.addTask(task.getName(), task.getDescription(), task.getPriority());
            refreshTaskList();
        });
    }

    private void completeSelectedTask() {
        String selected = taskList.getSelectionModel().getSelectedItem();
        if (selected == null) return;
        int id = Integer.parseInt(selected.substring(selected.indexOf('[') + 1, selected.indexOf(']')));
        manager.completeTask(id);
        refreshTaskList();
    }

    private void deleteSelectedTask() {
        String selected = taskList.getSelectionModel().getSelectedItem();
        if (selected == null) return;
        int id = Integer.parseInt(selected.substring(selected.indexOf('[') + 1, selected.indexOf(']')));
        manager.removeTask(id);
        refreshTaskList();
    }

    private void refreshTaskList() {
        taskList.getItems().clear();
        for (Task t : manager.getAllTasks()) {
            taskList.getItems().add(t.toString());
        }
    }
}
