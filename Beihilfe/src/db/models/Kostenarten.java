package db.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class Kostenarten {

	private int kostenartenID;
	private String kostenName;
	
	protected static ArrayList<Kostenarten> kostenartenListe = new ArrayList<Kostenarten>();
	
	public Kostenarten(int kostenartenID, String kostenName) {
		super();
		this.kostenartenID = kostenartenID;
		this.kostenName = kostenName;
	}
	
	public Kostenarten(String kostenName) {
		super();
		this.kostenName = kostenName;
	}

	public int getKostenartenID() {
		return kostenartenID;
	}

	public void setKostenartenID(int kostenartenID) {
		this.kostenartenID = kostenartenID;
	}

	public String getKostenName() {
		return kostenName;
	}

	public void setKostenName(String kostenName) {
		this.kostenName = kostenName;
	}

	public ArrayList<Kostenarten> getKostenartenListe() {
		return kostenartenListe;
	}
	
	public void insertData() {
		
		Derby_Conn dc = new Derby_Conn();
		Connection conn = dc.start(Derby_Conn.getStandardDB());
		
		try
	    {			
			String query = " INSERT INTO Kostenarten (Name) values (?)";
			PreparedStatement preparedStmt = conn.prepareStatement(query);	

			preparedStmt.setString(1, kostenName);
		      
			preparedStmt.execute();
			
			System.out.println("Neuer Eintrag in " + this.getClass());
			System.out.println("Name:" + kostenName);
			preparedStmt.close();
	    }
		catch (SQLException sqle)
	    {
	      dc.printSQLException(sqle);
	    }		
	}

	@Override
	public String toString() {
		return "Kostenarten [kostenartenID=" + kostenartenID + ", kostenName=" + kostenName + "]";
	}
}
