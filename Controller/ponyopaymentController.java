package Controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ponyopaymentController {

    @FXML
    private Button payback, pay2gcash, pay2credit;


 @FXML
private void payBack(ActionEvent event) {
    try {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/dashboard.fxml"));
        Parent root = loader.load();

        // Create a new scene
        Scene scene = new Scene(root);

        // Get the current stage (assuming the button is part of a stage)
        Stage stage = (Stage) payback.getScene().getWindow();
        // Set the new scene in the current stage
        stage.setScene(scene);
    } catch (IOException e) {
        e.printStackTrace();
    }
}

@FXML
private void pay2Gcash(ActionEvent event) {
    try {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/ponyogcash.fxml"));
        Parent root = loader.load();

        // Create a new scene
        Scene scene = new Scene(root);

        // Get the current stage (assuming the button is part of a stage)
        Stage stage = (Stage) pay2gcash.getScene().getWindow();
        // Set the new scene in the current stage
        stage.setScene(scene);
    } catch (IOException e) {
        e.printStackTrace();
    }
}

@FXML
private void pay2Credit(ActionEvent event) {
    try {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/ponyocredit.fxml"));
        Parent root = loader.load();

        // Create a new scene
        Scene scene = new Scene(root);

        // Get the current stage (assuming the button is part of a stage)
        Stage stage = (Stage) pay2credit.getScene().getWindow();
        // Set the new scene in the current stage
        stage.setScene(scene);
    } catch (IOException e) {
        e.printStackTrace();
    }
}

}
