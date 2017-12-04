package com.lgardias.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewChanger {

    public void changeView(Button button, int numberOFPanel) {

        Stage stage;
        Parent root;

        stage = (Stage) button.getScene().getWindow();
        try {
            switch (numberOFPanel) {
                case 0:
                    root = FXMLLoader.load(getClass().getResource("/view/StartPane.fxml"));
                    break;
                default:
                    root = FXMLLoader.load(getClass().getResource("/view/Question"+numberOFPanel+"Pane.fxml"));
            }

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
