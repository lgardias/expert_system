package com.lgardias.controller;

import com.lgardias.Main;
import com.lgardias.assertion.Assertion;
import com.lgardias.system.ExpertSystem;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CashPaneController implements Initializable{

    private final ToggleGroup cashGroup = new ToggleGroup();

    @FXML
    private ListView<String> historyListView;

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
        configureNextButton();
        configureListView();
        }

    private void configureListView() {
        ObservableList<String> list = FXCollections.observableArrayList();
        list.addAll(Main.expertSystem.getListOfAssertionsAsListOfString());
        historyListView.setItems(list);
    }

    private void configureNextButton() {
        nextButton.setOnAction(event -> {
            Main.expertSystem.addAssertion(new Assertion(cashGroup.getSelectedToggle().getUserData().toString(), 1));
            configureListView();
        });
    }

    private void configureRadioButtons() {
        chooseRadioButton1.setToggleGroup(cashGroup);
        chooseRadioButton1.setSelected(true);
        chooseRadioButton1.setUserData(chooseRadioButton1.getText());

        chooseRadioButton2.setToggleGroup(cashGroup);
        chooseRadioButton2.setUserData(chooseRadioButton2.getText());

        chooseRadioButton3.setToggleGroup(cashGroup);
        chooseRadioButton3.setUserData(chooseRadioButton3.getText());

        chooseRadioButton4.setToggleGroup(cashGroup);
        chooseRadioButton4.setUserData(chooseRadioButton4.getText());

        chooseRadioButton5.setToggleGroup(cashGroup);
        chooseRadioButton5.setUserData(chooseRadioButton5.getText());
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