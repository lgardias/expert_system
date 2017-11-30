package com.lgardias.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CashPaneController implements Initializable{

    private final ToggleGroup cashGroup = new ToggleGroup();

    @FXML
    private RadioButton chooseRadioButton1;

    @FXML
    private RadioButton chooseRadioButton2;

    @FXML
    private RadioButton chooseRadioButton3;

    @FXML
    private RadioButton chooseRadioButton4;

    @FXML
    private RadioButton chooseRadioButton5;

    @FXML
    private Button backButton;

    @FXML
    private Button nextButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        configureBackButton();
        configureRadioButtons();
        }

    private void configureRadioButtons() {
        chooseRadioButton1.setToggleGroup(cashGroup);
        chooseRadioButton1.setSelected(true);
        chooseRadioButton2.setToggleGroup(cashGroup);
        chooseRadioButton3.setToggleGroup(cashGroup);
        chooseRadioButton4.setToggleGroup(cashGroup);
        chooseRadioButton5.setToggleGroup(cashGroup);
    }



    private void configureBackButton() {
        backButton.setOnAction(event -> {
            Stage stage;
            Parent root;

            stage = (Stage) backButton.getScene().getWindow();
            try {
                root = FXMLLoader.load(getClass().getResource("/view/StartPane.fxml"));
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
    }
}