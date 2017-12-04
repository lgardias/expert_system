package com.lgardias.controller;

import com.lgardias.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

public class ResultPaneController implements Initializable {

    @FXML
    private Button exitButton;

    @FXML
    private TextArea resultTextArea;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        configureButton();
        configureTextArea();
    }

    private void configureTextArea() {
        Main.expertSystem.createKnowledgeBase();
        resultTextArea.setText(Main.expertSystem.getKnowledgeBase().toString());
    }

    private void configureButton() {
        exitButton.setOnAction(event -> System.exit(0));
    }
}
