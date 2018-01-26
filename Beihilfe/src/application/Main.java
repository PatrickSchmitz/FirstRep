package application;
	
import javafx.application.Application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.BorderPane;
import db.models.*;

public class Main extends Application {
	
	
	/**private ObservableList<Familienmitglieder> personData = FXCollections.observableArrayList();
	
	personData.add(new Familienmitglieder("Hans", "Muster"));
    personData.add(new Familienmitglieder("Ruth", "Mueller"));
    personData.add(new Familienmitglieder("Heinz", "Kurz"));
    personData.add(new Familienmitglieder("Cornelia", "Meier"));
    
    public ObservableList<Familienmitglieder> getPersonData() {
        return personData;
    }
    **/
	
   
    @Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/application/Anmeldung.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
		
		Save_Data.saveFamilie();
		Save_Data.saveRechnungssteller();
//		Save_Data.saveKostenarten();
		System.out.println(Familie.familienListe.toString());
		
	}
}
