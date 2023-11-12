package Controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class handmaidenController {

    @FXML
    private Button handmaidenhome, tomovies, go2sched;

    
    @FXML
    private void handmaidenHome(ActionEvent event) {
        try {
         
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/dashboard.fxml"));
            Parent root = loader.load();
    
            
            Scene scene = new Scene(root);
    
            
            Stage stage = (Stage) handmaidenhome.getScene().getWindow();
            
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
