package db.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class Antragsteller {

	private int antragstellerID;
	private int familienID;
	private int dienstlicheDatenID;
	private int beihilfereglungenID;
	
	protected static ArrayList<Antragsteller> antragstellerListe = new ArrayList<Antragsteller>();
	
	public Antragsteller(int antragstellerID, int familienID, int dienstlicheDatenID, int beihilfereglungenID) {
		super();
		this.antragstellerID = antragstellerID;
		this.familienID = familienID;
		this.dienstlicheDatenID = dienstlicheDatenID;
		this.beihilfereglungenID = beihilfereglungenID;
	}
	
	public Antragsteller(int familienID, int dienstlicheDatenID, int beihilfereglungenID) {
		super();
		this.familienID = familienID;
		this.dienstlicheDatenID = dienstlicheDatenID;
		this.beihilfereglungenID = beihilfereglungenID;
	}

	public int getAntragstellerID() {
		return antragstellerID;
	}

	public void setAntragstellerID(int antragstellerID) {
		this.antragstellerID = antragstellerID;
	}

	public int getFamilienID() {
		return familienID;
	}

	public void setFamilienID(int familienID) {
		this.familienID = familienID;
	}

	public int getDienstlicheDatenID() {
		return dienstlicheDatenID;
	}

	public void setDienstlicheDatenID(int dienstlicheDatenID) {
		this.dienstlicheDatenID = dienstlicheDatenID;
	}

	public int getBeihilfereglungenID() {
		return beihilfereglungenID;
	}

	public void setBeihilfereglungenID(int beihilfereglungenID) {
		this.beihilfereglungenID = beihilfereglungenID;
	}

	public static ArrayList<Antragsteller> getAntragstellerListe() {
		return antragstellerListe;
	}
	
	public void insertData() {
		
		Derby_Conn dc = new Derby_Conn();
		Connection conn = dc.start(Derby_Conn.getStandardDB());
		
		try
	    {			
			String query = " INSERT INTO Antragsteller (FamilieID, DienstdatenID, BeihilferegelungenID) "
					+ "values (?, ?, ?)";
			PreparedStatement preparedStmt = conn.prepareStatement(query);	

			preparedStmt.setInt(1, familienID);
			preparedStmt.setInt(2, dienstlicheDatenID);
			preparedStmt.setInt(3, beihilfereglungenID);
		      
			preparedStmt.executeUpdate();
			System.out.println("Neuer Eintrag in " + this.getClass());
			System.out.println("FamilieID:" + familienID + " DienstdatenID:" + dienstlicheDatenID 
					+ " BeihilferegelungenID:" + beihilfereglungenID);
			
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
		return "Antragsteller [antragstellerID=" + antragstellerID + ", familienID=" + familienID
				+ ", dienstlicheDatenID=" + dienstlicheDatenID + ", beihilfereglungenID=" + beihilfereglungenID + "]";
	}
		
}
