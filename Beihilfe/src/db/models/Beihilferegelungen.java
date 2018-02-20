package db.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**Klasse Beihilferegelungen für die Tabelle der Datenbank*/
public class Beihilferegelungen {
	
	
	private int beihilferegelungenID;
	private int zeitgenze; 				// in Tagen
	private float mindestbetrag;		// in Euro(€)
	
	/**In der Liste beihilferegelungenListe stehen alle Einträge der Tabelle Beihilferegelungen.*/
	protected static ArrayList<Beihilferegelungen> beihilferegelungenListe = new ArrayList<Beihilferegelungen>();
	
	public Beihilferegelungen(int beihilfereglungenID, int zeitgenze, float mindestbetrag) {
		super();
		this.beihilferegelungenID = beihilfereglungenID;
		this.zeitgenze = zeitgenze;
		this.mindestbetrag = mindestbetrag;
	}
	
	public Beihilferegelungen(int zeitgenze, float mindestbetrag) {
		super();
		this.zeitgenze = zeitgenze;
		this.mindestbetrag = mindestbetrag;
	}

	public int getBeihilferegelungenID() {
		return beihilferegelungenID;
	}

	public void setBeihilferegelungenID(int beihilfereglungenID) {
		this.beihilferegelungenID = beihilfereglungenID;
	}

	public int getZeitgenze() {
		return zeitgenze;
	}

	public void setZeitgenze(int zeitgenze) {
		this.zeitgenze = zeitgenze;
	}

	public float getMindestbetrag() {
		return mindestbetrag;
	}

	public void setMindestbetrag(float mindestbetrag) {
		this.mindestbetrag = mindestbetrag;
	}

	public ArrayList<Beihilferegelungen> getBeihilferegelungenListe() {
		return beihilferegelungenListe;
	}
	
	/**Speichert ein Element der Klasse Beihilferegelungen in die Tabelle der Datenbank.*/
	public void insertData() {
		
		Derby_Conn dc = new Derby_Conn();
		Connection conn = dc.start(Derby_Conn.getStandardDB());
		
		try
	    {			
			String query = " INSERT INTO Beihilferegelungen (Zeitgrenze, Mindestbetrag) values (?, ?)";
			PreparedStatement preparedStmt = conn.prepareStatement(query);	

			preparedStmt.setInt (1, zeitgenze);
			preparedStmt.setFloat (2, mindestbetrag);
		      
			preparedStmt.executeUpdate();
			System.out.println("Neuer Eintrag in " + this.getClass());
			System.out.println("Zeitgrenze:" + zeitgenze + " Mindestbetrag:" + mindestbetrag);
			
			conn.commit();
			preparedStmt.close();
			conn.close();
	    }
		catch (SQLException sqle)
	    {
	      dc.printSQLException(sqle);
	    }		
	}

	@Override
	public String toString() {
		return "Beihilfereglungen [beihilfereglungenID=" + beihilferegelungenID + ", zeitgenze=" + zeitgenze
				+ ", mindestbetrag=" + mindestbetrag + "]";
	}

}
