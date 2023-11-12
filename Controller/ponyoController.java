package Controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ponyoController {
    @FXML
    private Button ponyo2homebtn, selectseat, tomovies, go2sched;
    
    @FXML
    private Button aboutusponyobtn;

    @FXML
    private Button schedponyobtn;
    
    @FXML Button showponyotrailer;



    @FXML
private void showponyoTrailer(ActionEvent event) {
    try {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/ponyotrailer.fxml"));
        Parent root = loader.load();

        // Create a new scene
        Scene scene = new Scene(root);

        // Get the current stage (assuming the button is part of a stage)
        Stage stage = (Stage) showponyotrailer.getScene().getWindow();
        // Set the new scene in the current stage
        stage.setScene(scene);
    } catch (IOException e) {
        e.printStackTrace();
    }
}
  @FXML
private void ponyo2home(ActionEvent event) {
    try {
        // Load the ponyo.fxml file
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/dashboard.fxml"));
        Parent root = loader.load();

        // Create a new scene
        Scene scene = new Scene(root);

        // Get the current stage (assuming the button is part of a stage)
        Stage stage = (Stage) ponyo2homebtn.getScene().getWindow();
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
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/ponyoSeat.fxml"));
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

@FXML
private void toMovies(ActionEvent event) {
    try {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/movies.fxml"));
        Parent root = loader.load();

        
        Scene scene = new Scene(root);

        
        Stage stage = (Stage) tomovies.getScene().getWindow();

        // Set the new scene in the current stage
        stage.setScene(scene);
    } catch (IOException e) {
        e.printStackTrace();
    }
}

@FXML
private void go2Sched(ActionEvent event) {
    try {
        // Load the ponyo.fxml file
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/sched.fxml"));
        Parent root = loader.load();

        // Create a new scene
        Scene scene = new Scene(root);

        // Get the current stage (assuming the button is part of a stage)
        Stage stage = (Stage) go2sched.getScene().getWindow();

        // Set the new scene in the current stage
        stage.setScene(scene);
    } catch (IOException e) {
        e.printStackTrace();
    }
}


}

