package com.lgardias.controller;

import com.lgardias.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

import java.net.URL;
import java.util.ResourceBundle;

public class Question5PaneController implements Initializable {

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
    private CheckBox chooseCheckBox5;
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
            if (chooseCheckBox1.isSelected()) {
                Main.expertSystem.addAssertion("RESTART");
            }
            if (chooseCheckBox2.isSelected()) {
                Main.expertSystem.addAssertion("SLOW_MOTION");
            }
            if (chooseCheckBox3.isSelected()) {
                Main.expertSystem.addAssertion("LOUD");
            }
            if (chooseCheckBox4.isSelected()) {
                Main.expertSystem.addAssertion("HEAT");
            }

            viewChanger.changeView(nextButton, 6);

        });
    }


    private void configureBackButton() {
        backButton.setOnAction(event -> viewChanger.changeView(nextButton, 4));

    }
}