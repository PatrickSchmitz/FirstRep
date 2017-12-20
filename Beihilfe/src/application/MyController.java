package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;



public class MyController {
	
	
	
	@FXML
	//Einfaches ActionEvent handling, bei einem Button
	//Öffnet in diesem Fall eine neue FXML Datei 
	
	public void anmelden(ActionEvent anmeldebutton) throws Exception {               
        try {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/application/Entwurf.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));  
                stage.show();
        } catch(Exception e) {
           e.printStackTrace();
          }
	}
	
	@FXML
	//Einfaches ActionEvent handling, bei einem Button
		//Öffnet in diesem Fall eine neue FXML Datei 
	
	public void familienmitglieder(ActionEvent familienmitgliederbutton) throws Exception {               
        try {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/application/Familienmitglieder.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));  
                stage.show();
        } catch(Exception e) {
           e.printStackTrace();
          }
	}

}

