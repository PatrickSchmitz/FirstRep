package application;
	
import db.models.Familie;
import db.models.Save_Data;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

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
	public static void main(String[] args) {
		launch(args);
		
		Save_Data.saveFamilie();
		Save_Data.saveRechnungssteller();
		Save_Data.saveKostenarten();
		System.out.println(Familie.familienListe.toString());
		
	}
   
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
    
    /** public void populateListView {
        try {
            String query = "SELECT * FROM Kostenarten";
            PreparedStatement prestate = model.getConnection().prepareStatement(query);
            ResultSet result = prestate.executeQuery();

            while (result.next()) {
                String current = result.getString("title");
                ObservableList<String> list = FXCollections.observableArrayList(current);
                listview.getItems().addAll(list);
            }

            prestate.close();
            result.close();     
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    **/
	
}
