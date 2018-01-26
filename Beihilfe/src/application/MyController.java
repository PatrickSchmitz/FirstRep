package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class MyController {
	
	//Für die Elemente, auf die der Controller zugreifen soll
	//und für die Implementierungen vom Handler muss eine @FXML-Annotation verwendet werden.
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
	
	@FXML
	public void familienmitgliederhinzu(ActionEvent hinzubutton) throws Exception {               
        try {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/application/Familienmitglied hinzufügen.fxml"));
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
	
	public void NeueRechnung(ActionEvent rechnungsbutton) throws Exception {               
        try {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/application/Neue Rechnung.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));  
                stage.show();
        } catch(Exception e) {
           e.printStackTrace();
          }
	}
	@FXML
	public void aerzte(ActionEvent rechnungsaussteller) throws Exception {               
        try {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/application/Rechnungsaussteller.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));  
                stage.show();
        } catch(Exception e) {
           e.printStackTrace();
          }
	}
	
}

