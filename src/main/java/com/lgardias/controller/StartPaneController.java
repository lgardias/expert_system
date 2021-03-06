package com.lgardias.controller;

import com.lgardias.rule.Rule;
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

    private ViewChanger viewChanger = new ViewChanger();
    @FXML
    private Button startButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cofigureButton();
    }

    private void cofigureButton() {
        startButton.setOnAction(event -> viewChanger.changeView(startButton, 1));

    }
}
