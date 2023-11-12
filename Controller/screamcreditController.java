package Controller;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class screamcreditController {
    @FXML
    private Button back2payment;

    @FXML
    private TextField numberField;

    @FXML
    private TextField nameField;

    @FXML
    private TextField cvcField;

    @FXML
    private TextField expDate;

    @FXML
    private Button toticket;

    public void toTicket(ActionEvent event) {
        // Get the values entered by the user
        String enteredNumber = numberField.getText();
        String enteredName = nameField.getText();
        String enteredPin = cvcField.getText();
        String enteredED = expDate.getText();
    
        // Define the predefined values (case-insensitive)
        String predefinedNumber = "12345678910";
        String predefinedName = "Paulo Agapito";
        String predefinedcvc = "4321";
        String predefinedED = "0426";
    
        // Check if the entered details match the predefined values (case-insensitive)
        if (enteredNumber.equals(predefinedNumber) &&
            enteredName.equalsIgnoreCase(predefinedName) &&
            enteredPin.equals(predefinedcvc) && enteredED.equals(predefinedED)){
            try {
                // Load the next scene (finalticket.fxml)
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/ponyo.fxml"));
                Parent root = loader.load();
    
                // Create a new stage for the next scene
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
    
                // Show the new scene
                stage.show();
    
                // Close the current login scene
                Stage currentStage = (Stage) toticket.getScene().getWindow();
                currentStage.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
             Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Invalid Credit/Debit Details");
        alert.setHeaderText(null);
        alert.setContentText("The entered details are invalid. Please try again.");
        alert.showAndWait();
        }

        
    }
}
