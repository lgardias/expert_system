package com.lgardias.controller;

import com.lgardias.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

import java.net.URL;
import java.util.ResourceBundle;

public class Question1PaneController implements Initializable {

    private final ToggleGroup cashGroup = new ToggleGroup();

    private ViewChanger viewChanger = new ViewChanger();


    @FXML
    private RadioButton chooseRadioButton1;

    @FXML
    private RadioButton chooseRadioButton2;


    @FXML
    private Button backButton;

    @FXML
    private Button nextButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        configureBackButton();
        configureRadioButtons();
        configureNextButton();
    }


    private void configureNextButton() {
        nextButton.setOnAction(event -> {
            if (chooseRadioButton1.isSelected()) {
                Main.expertSystem.addAssertion("RUN");
            }
            if (chooseRadioButton2.isSelected()) {
                Main.expertSystem.addAssertion("NOT_RUN");
            }

            viewChanger.changeView(nextButton, 2);

        });
    }

    private void configureRadioButtons() {
        chooseRadioButton1.setToggleGroup(cashGroup);
        chooseRadioButton1.setSelected(true);

        chooseRadioButton2.setToggleGroup(cashGroup);
    }


    private void configureBackButton() {
        backButton.setOnAction(event -> viewChanger.changeView(nextButton, 0));
    }
}