package com.lgardias.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class StartPaneController implements Initializable {

    @FXML
    private Button startButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cofigureButton();
    }

    private void cofigureButton() {
        startButton.setOnAction(event -> {
            Stage stage;
            Parent root;

            stage = (Stage) startButton.getScene().getWindow();
            try {
                root = FXMLLoader.load(getClass().getResource("/view/CashPane.fxml"));
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
    }
}
