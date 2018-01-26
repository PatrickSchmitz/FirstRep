package db.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class Beihilferegelungen {
	
	
	private int beihilfereglungenID;
	private int zeitgenze; 				// in Tagen
	private float mindestbetrag;		// in Euro(€)
	
	protected static ArrayList<Beihilferegelungen> beihilferegelungenListe = new ArrayList<Beihilferegelungen>();
	
	public Beihilferegelungen(int beihilfereglungenID, int zeitgenze, float mindestbetrag) {
		super();
		this.beihilfereglungenID = beihilfereglungenID;
		this.zeitgenze = zeitgenze;
		this.mindestbetrag = mindestbetrag;
	}

	public int getBeihilfereglungenID() {
		return beihilfereglungenID;
	}

	public void setBeihilfereglungenID(int beihilfereglungenID) {
		this.beihilfereglungenID = beihilfereglungenID;
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
		return "Beihilfereglungen [beihilfereglungenID=" + beihilfereglungenID + ", zeitgenze=" + zeitgenze
				+ ", mindestbetrag=" + mindestbetrag + "]";
	}

}
