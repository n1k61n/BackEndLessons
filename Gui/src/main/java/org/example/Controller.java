package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class Controller {
    @FXML
    private void handleClick() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Info");
        alert.setHeaderText(null);
        alert.setContentText("Button clicked!");
        alert.showAndWait();
    }
}