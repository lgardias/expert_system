package com.lgardias.controller;

import com.lgardias.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;

import java.net.URL;
import java.util.ResourceBundle;

public class Question6PaneController implements Initializable {

    private ViewChanger viewChanger = new ViewChanger();

    @FXML
    private CheckBox chooseCheckBox1;
    @FXML
    private CheckBox chooseCheckBox2;
    @FXML
    private CheckBox chooseCheckBox3;
    @FXML
    private CheckBox chooseCheckBox4;
    @FXML
    private Button backButton;

    @FXML
    private Button nextButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        configureBackButton();
        configureNextButton();
    }


    private void configureNextButton() {
        nextButton.setOnAction(event -> {
            if (chooseCheckBox2.isSelected()) {
                Main.expertSystem.addAssertion("MONITOR");
            }
            if (chooseCheckBox3.isSelected()) {
                Main.expertSystem.addAssertion("ARTIFACT");
            }
            if (chooseCheckBox4.isSelected()) {
                Main.expertSystem.addAssertion("MONITOR_OFF");
            }

            viewChanger.changeView(nextButton, 7);

        });
    }


    private void configureBackButton() {
        backButton.setOnAction(event -> viewChanger.changeView(nextButton, 5));

    }
}