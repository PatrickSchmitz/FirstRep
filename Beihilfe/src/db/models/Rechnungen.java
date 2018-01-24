package db.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class Rechnungen {

	private int rechnunngID;
	private int familieID;
	private int rechnungsstellerID;
	private int kostenartenID;
	private int rechnungsnummer;
	private float betrag;
	private Date datum;
	
	protected static ArrayList<Rechnungen> rechnungenListe = new ArrayList<Rechnungen>();

	public Rechnungen(int rechnunngID, int familieID, int rechnungsstellerID, int kostenartenID, int rechnungsnummer,
			float betrag, Date datum) {
		super();
		this.rechnunngID = rechnunngID;
		this.familieID = familieID;
		this.rechnungsstellerID = rechnungsstellerID;
		this.kostenartenID = kostenartenID;
		this.rechnungsnummer = rechnungsnummer;
		this.betrag = betrag;
		this.datum = datum;
	}

	public int getRechnunngID() {
		return rechnunngID;
	}

	public void setRechnunngID(int rechnunngID) {
		this.rechnunngID = rechnunngID;
	}

	public int getFamilieID() {
		return familieID;
	}

	public void setFamilieID(int familieID) {
		this.familieID = familieID;
	}

	public int getRechnungsstellerID() {
		return rechnungsstellerID;
	}

	public void setRechnungsstellerID(int rechnungsstellerID) {
		this.rechnungsstellerID = rechnungsstellerID;
	}

	public int getKostenartenID() {
		return kostenartenID;
	}

	public void setKostenartenID(int kostenartenID) {
		this.kostenartenID = kostenartenID;
	}

	public int getRechnungsnummer() {
		return rechnungsnummer;
	}

	public void setRechnungsnummer(int rechnungsnummer) {
		this.rechnungsnummer = rechnungsnummer;
	}

	public float getBetrag() {
		return betrag;
	}

	public void setBetrag(float betrag) {
		this.betrag = betrag;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	public ArrayList<Rechnungen> getRechnungenListe() {
		return rechnungenListe;
	}
	
	public void insertData() {
		
		Derby_Conn dc = new Derby_Conn();
		Connection conn = dc.start(Derby_Conn.getStandardDB());
		
		try
	    {
			String query = " INSERT INTO Rechnungen (FamilieID, RechnungsstellerID, KostenartenID, Rechnungsnummer"
					+ "Betrag, Datum) values (?, ?, ?, ?, ?, ?)";
			PreparedStatement preparedStmt = conn.prepareStatement(query);	

			preparedStmt.setInt(1, familieID);
			preparedStmt.setInt(2, rechnungsstellerID);
			preparedStmt.setInt(3, kostenartenID);
			preparedStmt.setInt(4, rechnungsnummer);
			preparedStmt.setFloat(5, betrag);
			preparedStmt.setDate(6, (java.sql.Date) datum);
		      
			preparedStmt.execute();
			
			System.out.println("Neuer Eintrag in " + this.getClass());
			System.out.println("FamilieID:" + familieID + " RechnungsstellerID:" + rechnungsstellerID
							+ " KostenartenID:" + kostenartenID + " Rechnungsnummer:" + rechnungsnummer
							+ " Rechnungsnummer:" + rechnungsnummer);
			preparedStmt.close();
	    }
	    catch (SQLException sqle)
	    {
	      dc.printSQLException(sqle);
	    }		
	}

	@Override
	public String toString() {
		return "Rechnungen [rechnunngID=" + rechnunngID + ", familieID=" + familieID + ", rechnungsstellerID="
				+ rechnungsstellerID + ", kostenartenID=" + kostenartenID + ", rechnungsnummer=" + rechnungsnummer
				+ ", betrag=" + betrag + ", datum=" + datum.toString() + "]";
	}
	
}
