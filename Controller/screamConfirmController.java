package Controller;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class screamConfirmController {

    @FXML
    private Button paybtn;

    @FXML
    private Label selectedTimeLabel;

    @FXML
    private Label selectedSeatLabel;

    public void initialize() {
        String selectedSeat = DataStorage.getSelectedSeat();
        String selectedTime = DataStorage.getSelectedTime();

        selectedSeatLabel.setText(selectedSeat);
        selectedTimeLabel.setText(selectedTime);

        // Make the labels visible when data is available
        selectedSeatLabel.setVisible(!selectedSeat.isEmpty());
        selectedTimeLabel.setVisible(!selectedTime.isEmpty());
    }

    @FXML
private void payBtn(ActionEvent event) {
    try {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/screampay.fxml"));
        Parent root = loader.load();

       
        Scene scene = new Scene(root);
        Stage stage = (Stage) paybtn.getScene().getWindow();
        stage.setScene(scene);
    } catch (IOException e) {
        e.printStackTrace();
    }
}

    
}

    
  
