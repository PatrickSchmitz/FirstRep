package application;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import db.models.Derby_Conn;
import db.models.Rechnungen;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;




public class MyController {
	
	
	
	/**Für die Elemente, auf die der Controller zugreifen soll
	//und für die Implementierungen vom Handler muss eine @FXML-Annotation verwendet werden.
	@FXML
	//Einfaches ActionEvent handling, bei einem Button
	Öffnet in diesem Fall eine neue FXML Datei 
	**/
	
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

/**
 * Füllen von der Tabelle Rechnungsübersicht
 */
	
	 @FXML
	 public TableView<Rechnungen> tableRechnung;
	 @FXML
	 private TableColumn<Rechnungen, String> spaltedatum;
	 @FXML
	 private TableColumn<Rechnungen, String> spaltebetrag;
	 @FXML
	 private TableColumn<Rechnungen, String> spaltetext;
	 @FXML
	 private TableColumn<Rechnungen, String> spalteav;
	 @FXML
	 private TableColumn<Rechnungen, String> spalteab;
	 @FXML
	 private TableColumn<Rechnungen, String> spaltevv;
	 @FXML
	 private TableColumn<Rechnungen, String> spaltevb;
	 @FXML
	 private TableColumn<Rechnungen, String> spaltezahlziel;
	 @FXML
	 private TableColumn<Rechnungen, String> spaltebezahlt;
	 @FXML
	 private TableColumn<Rechnungen, String> spaltekostenart;
	 @FXML
	 private TableColumn<Rechnungen, String> spalteempfaenger;
	 
	 
	 private ObservableList<Rechnungen> data;
	 
	 @FXML
	    private void ladeRechnung(ActionEvent event) {
		 Derby_Conn dc = new Derby_Conn();
		 Connection conn = dc.start(Derby_Conn.getStandardDB());
	        try {
	            
	            data = FXCollections.observableArrayList();
	            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM Rechnungen");
	            while (rs.next()) { 
	                data.add(new Rechnungen(0, 0, 0, 0, 0, null));
	            }
	        } catch (SQLException ex) {
	            System.err.println("Error"+ex);
	        }
	        
	        
	        spaltedatum.setCellValueFactory(new PropertyValueFactory<>("datum"));
	        spaltebetrag.setCellValueFactory(new PropertyValueFactory<>("betrag"));
	        spaltetext.setCellValueFactory(new PropertyValueFactory<>("text"));
	        
	        tableRechnung.setItems(null);
	        tableRechnung.setItems(data);

	    }
	    

	
	
}

