package db.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class DienstlicheDaten {

	private int dienstlicheDatenID;
	private int dienstanschriftID;
	private long kennziffer;
	private String amtsbezeichnung;
	private int verguetungsgruppe;
	
	protected static ArrayList<DienstlicheDaten> dienstlicheDatenListe = new ArrayList<DienstlicheDaten>();

	public DienstlicheDaten(int dienstlicheDatenID, int dienstanschriftID, long kennziffer, String amtsbezeichnung,
			int verguetungsgruppe) {
		super();
		this.dienstlicheDatenID = dienstlicheDatenID;
		this.dienstanschriftID = dienstanschriftID;
		this.kennziffer = kennziffer;
		this.amtsbezeichnung = amtsbezeichnung;
		this.verguetungsgruppe = verguetungsgruppe;
	}

	public int getDienstlicheDatenID() {
		return dienstlicheDatenID;
	}


	public void setDienstlicheDatenID(int dienstlicheDatenID) {
		this.dienstlicheDatenID = dienstlicheDatenID;
	}


	public int getDienstanschriftID() {
		return dienstanschriftID;
	}


	public void setDienstanschriftID(int dienstanschriftID) {
		this.dienstanschriftID = dienstanschriftID;
	}


	public long getKennziffer() {
		return kennziffer;
	}


	public void setKennziffer(long kennziffer) {
		this.kennziffer = kennziffer;
	}


	public String getAmtsbezeichnung() {
		return amtsbezeichnung;
	}


	public void setAmtsbezeichnung(String amtsbezeichnung) {
		this.amtsbezeichnung = amtsbezeichnung;
	}


	public int getVerguetungsgruppe() {
		return verguetungsgruppe;
	}


	public void setVerguetungsgruppe(int verguetungsgruppe) {
		this.verguetungsgruppe = verguetungsgruppe;
	}


	public ArrayList<DienstlicheDaten> getDienstlicheDatenListe() {
		return dienstlicheDatenListe;
	}
	
	public void insertData() {
		
		Derby_Conn dc = new Derby_Conn();
		Connection conn = dc.start(Derby_Conn.getStandardDB());
		
		try
	    {			
			String query = " INSERT INTO Dienstdaten (DienstanschriftID, Kennziffer, Amtsbezeichnung, Verguetungsgruppe) "
					+ "values (?, ?, ?, ?)";
			PreparedStatement preparedStmt = conn.prepareStatement(query);	

			preparedStmt.setInt(1, dienstanschriftID);
			preparedStmt.setLong(2, kennziffer);
			preparedStmt.setString	(3, amtsbezeichnung);
			preparedStmt.setInt (4, verguetungsgruppe);
		      
			preparedStmt.execute();
			System.out.println("Neuer Eintrag in " + this.getClass());
			System.out.println("DienstanschriftID:" + dienstanschriftID + " Kennziffer:" + kennziffer 
					+ " Amtsbezeichnung:" + amtsbezeichnung + " Verguetungsgruppe:" + verguetungsgruppe);
			preparedStmt.close();
	    }
		catch (SQLException sqle)
	    {
	      dc.printSQLException(sqle);
	    }		
	}

	@Override
	public String toString() {
		return "DienstlicheDaten [dienstlicheDatenID=" + dienstlicheDatenID + ", kennziffer=" + kennziffer
				+ ", amtsbezeichnung=" + amtsbezeichnung + ", verguetungsgruppe=" + verguetungsgruppe + "]";
	}	
}
