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

public class screamTixController {

    @FXML
    private Button homebtn;

    @FXML
    private Label selectedTimeLabel; //remove when error occurs

    @FXML
    private Label selectedSeatLabel;

    public void setSelectedSeatLabel(String text) {
        selectedSeatLabel.setText(text);
        selectedSeatLabel.setVisible(true); // Make the label visible when a seat is selected
    }

    public void setSelectedTimeLabel(String text) {
        selectedTimeLabel.setText(text);
        selectedTimeLabel.setVisible(true);
    }

    @FXML
private void homeBtn(ActionEvent event) {
    try {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/dashboard.fxml"));
        Parent root = loader.load();

       
        Scene scene = new Scene(root);
        Stage stage = (Stage) homebtn.getScene().getWindow();
        stage.setScene(scene);
    } catch (IOException e) {
        e.printStackTrace();
    }
}

}