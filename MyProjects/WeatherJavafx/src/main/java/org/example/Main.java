package org.example;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Random;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Simple Weather App");

        // Input field
        TextField cityInput = new TextField();
        cityInput.setPromptText("Enter city name");

        // Button
        Button getWeatherBtn = new Button("Get Weather");

        // Label to show result
        Label resultLabel = new Label();

        getWeatherBtn.setOnAction(e -> {
            String city = cityInput.getText().trim();
            if (city.isEmpty()) {
                resultLabel.setText("Please enter a city name!");
            } else {
                String weather = getWeatherForCity(city);
                resultLabel.setText("Weather in " + city + ": " + weather);
            }
        });

        // Layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));
        layout.getChildren().addAll(cityInput, getWeatherBtn, resultLabel);

        Scene scene = new Scene(layout, 300, 150);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Dummy weather generator
    private String getWeatherForCity(String city) {
        String[] weathers = {"Sunny", "Cloudy", "Rainy", "Windy", "Snowy"};
        Random random = new Random();
        return weathers[random.nextInt(weathers.length)];
    }

    public static void main(String[] args) {
        launch(args);
    }
}
