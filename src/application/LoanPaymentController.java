package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

public class SampleController {
	@FXML private TextField type;
	@FXML private TextField age;
	@FXML private TextField price;
	@FXML private TextField down;
	@FXML private TextField interest;
	@FXML private Slider loanPaymentPeriod;
	@FXML private TextField loanPaymentFrequency;
	@FXML private Button clear;
	@FXML private Button getResult;
	@FXML private TextField showResult;
	
	@FXML
	protected void clearAll(ActionEvent event) {
		
		System.out.print("All field has been Cleared");
	}
	
}
