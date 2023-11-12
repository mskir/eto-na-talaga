package Controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class onepieceController {
    @FXML
    private Button op2homebtn, selectseat;

    @FXML Button showonepiecetrailer;



    @FXML
private void showonepieceTrailer(ActionEvent event) {
    try {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/onepiecetrailer.fxml"));
        Parent root = loader.load();

        // Create a new scene
        Scene scene = new Scene(root);

        // Get the current stage (assuming the button is part of a stage)
        Stage stage = (Stage) showonepiecetrailer.getScene().getWindow();
        // Set the new scene in the current stage
        stage.setScene(scene);
    } catch (IOException e) {
        e.printStackTrace();
    }
}
  @FXML
private void op2home(ActionEvent event) {
    try {
        // Load the ponyo.fxml file
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/dashboard.fxml"));
        Parent root = loader.load();

        // Create a new scene
        Scene scene = new Scene(root);

        // Get the current stage (assuming the button is part of a stage)
        Stage stage = (Stage) op2homebtn.getScene().getWindow();
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
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/onepieceSeat.fxml"));
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

