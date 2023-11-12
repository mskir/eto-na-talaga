package Controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class fbaarController {
    @FXML
    private Button fbaar2homebtn, selectseat;

    @FXML Button showfbaartrailer;



    @FXML
private void showfbaarTrailer(ActionEvent event) {
    try {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/fbaartrailer.fxml"));
        Parent root = loader.load();

        // Create a new scene
        Scene scene = new Scene(root);

        // Get the current stage (assuming the button is part of a stage)
        Stage stage = (Stage) showfbaartrailer.getScene().getWindow();
        // Set the new scene in the current stage
        stage.setScene(scene);
    } catch (IOException e) {
        e.printStackTrace();
    }
}
  @FXML
private void fbaar2home(ActionEvent event) {
    try {
        // Load the ponyo.fxml file
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/dashboard.fxml"));
        Parent root = loader.load();

        // Create a new scene
        Scene scene = new Scene(root);

        // Get the current stage (assuming the button is part of a stage)
        Stage stage = (Stage) fbaar2homebtn.getScene().getWindow();
        // Set the new scene in the current stage
        stage.setScene(scene);
    } catch (IOException e) {
        e.printStackTrace();
    }
}

  @FXML
private void selectSeat(ActionEvent event) {
    try {
        // Load the ponyo.fxml file
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/fbaarSeat.fxml"));
        Parent root = loader.load();

        // Create a new scene
        Scene scene = new Scene(root);

        // Get the current stage (assuming the button is part of a stage)
        Stage stage = (Stage) selectseat.getScene().getWindow();
        // Set the new scene in the current stage
        stage.setScene(scene);
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}

