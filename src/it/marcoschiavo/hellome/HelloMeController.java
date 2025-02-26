/**
 * Sample Skeleton for 'HelloMe.fxml' Controller Class
 */

package it.marcoschiavo.hellome;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloMeController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="Btn"
    private Button Btn; // Value injected by FXMLLoader

    @FXML // fx:id="txtNome"
    private TextField txtNome; // Value injected by FXMLLoader

    @FXML // fx:id="txtResult"
    private TextArea txtResult; // Value injected by FXMLLoader

    @FXML
    void handleBtn(ActionEvent event) {
    	//System.out.println(this.txtNome.getText());
    	if(this.txtNome.getText().length() == 0) {
    		this.txtResult.setText("Il campo deve contenere una stringa");
    	}else {
    		this.txtResult.setText(this.txtNome.getText() + ", Benvenuto!");
    	}

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert Btn != null : "fx:id=\"Btn\" was not injected: check your FXML file 'HelloMe.fxml'.";
        assert txtNome != null : "fx:id=\"txtNome\" was not injected: check your FXML file 'HelloMe.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'HelloMe.fxml'.";

    }

}
