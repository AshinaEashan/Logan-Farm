package controller;


import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DashboardFormController {

    public AnchorPane dashBoardPane;

    public void employeeBtnOnAction(ActionEvent actionEvent) {
        Stage stage = (Stage) dashBoardPane.getScene().getWindow();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("view/EmployeeForm.fxml"))));
            stage.setTitle("Employee Form");
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
