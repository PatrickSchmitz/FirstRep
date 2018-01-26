/**package application;

import java.time.LocalDate;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Familienmitglieder 
{
	private StringProperty vorname;
    private StringProperty nachname;
    private StringProperty straße;
    private IntegerProperty postleitzahl;
    private StringProperty stadt;
    private ObjectProperty<LocalDate> geburtstag;
    
    
	public Familienmitglieder(String vorname, String nachname, StringProperty straße,
			IntegerProperty postleitzahl, StringProperty stadt, ObjectProperty<LocalDate> geburtstag) {
		super();
		this.vorname = new SimpleStringProperty(vorname);
		this.nachname = new SimpleStringProperty(nachname);
		this.straße = new SimpleStringProperty("Münsterstraße");
		this.postleitzahl =new SimpleIntegerProperty(48973);
		this.stadt = new SimpleStringProperty("Bocholt");
		this.geburtstag = new SimpleObjectProperty<LocalDate>(LocalDate.of(1994, 3, 3));
	}

	public StringProperty getVorname() {
		return vorname;
	}

	public StringProperty getNachname() {
		return nachname;
	}

	public StringProperty getStraße() {
		return straße;
	}

	public IntegerProperty getPostleitzahl() {
		return postleitzahl;
	}

	public StringProperty getStadt() {
		return stadt;
	}

	public ObjectProperty<LocalDate> getGeburtstag() {
		return geburtstag;
	}

	public void setVorname(StringProperty vorname) {
		this.vorname = vorname;
	}

	public void setNachname(StringProperty nachname) {
		this.nachname = nachname;
	}

	public void setStraße(StringProperty straße) {
		this.straße = straße;
	}

	public void setPostleitzahl(IntegerProperty postleitzahl) {
		this.postleitzahl = postleitzahl;
	}

	public void setStadt(StringProperty stadt) {
		this.stadt = stadt;
	}

	public void setGeburtstag(ObjectProperty<LocalDate> geburtstag) {
		this.geburtstag = geburtstag;
	}
	
	
	
	
    

}
**/