package db.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class Rechnungen {

	private int rechnunngID;
	private int familieID;
	private int rechnungsstellerID;
	private int kostenartenID;
	private int rechnungsnummer;
	private float betrag;
	private java.sql.Date datum;
	private boolean av;
	private boolean ab;
	private boolean vv;
	private boolean bv;
	
	protected static ArrayList<Rechnungen> rechnungenListe = new ArrayList<Rechnungen>();

	public Rechnungen(int rechnunngID, int familieID, int rechnungsstellerID, int kostenartenID, int rechnungsnummer,
			float betrag, java.sql.Date datum) {
		super();
		this.rechnunngID = rechnunngID;
		this.familieID = familieID;
		this.rechnungsstellerID = rechnungsstellerID;
		this.kostenartenID = kostenartenID;
		this.rechnungsnummer = rechnungsnummer;
		this.betrag = betrag;
		this.datum = datum;
		this.av = false;
		this.ab = false;
		this.vv = false;
		this.bv = false;
	}
	
	public Rechnungen(int familieID, int rechnungsstellerID, int kostenartenID, int rechnungsnummer,
			float betrag, java.sql.Date datum) {
		super();
		this.familieID = familieID;
		this.rechnungsstellerID = rechnungsstellerID;
		this.kostenartenID = kostenartenID;
		this.rechnungsnummer = rechnungsnummer;
		this.betrag = betrag;
		this.datum = datum;
		this.av = false;
		this.ab = false;
		this.vv = false;
		this.bv = false;
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

	public java.sql.Date getDatum() {
		return datum;
	}

	public void setDatum(java.sql.Date datum) {
		this.datum = datum;
	}

	public boolean isAv() {
		return av;
	}

	public void setAv(boolean av) {
		this.av = av;
	}

	public boolean isAb() {
		return ab;
	}

	public void setAb(boolean ab) {
		this.ab = ab;
	}

	public boolean isVv() {
		return vv;
	}

	public void setVv(boolean vv) {
		this.vv = vv;
	}

	public boolean isBv() {
		return bv;
	}

	public void setBv(boolean bv) {
		this.bv = bv;
	}

	public ArrayList<Rechnungen> getRechnungenListe() {
		return rechnungenListe;
	}
	
	public void insertData() {
		
		Derby_Conn dc = new Derby_Conn();
		Connection conn = dc.start(Derby_Conn.getStandardDB());
		
		try
	    {
			String query = " INSERT INTO Rechnungen (FamilieID, RechnungsstellerID, KostenartenID, Rechnungsnummer,"
					+ "Betrag, Datum, AV, AB, VV, BV) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement preparedStmt = conn.prepareStatement(query);	

			preparedStmt.setInt(1, familieID);
			preparedStmt.setInt(2, rechnungsstellerID);
			preparedStmt.setInt(3, kostenartenID);
			preparedStmt.setInt(4, rechnungsnummer);
			preparedStmt.setFloat(5, betrag);
			preparedStmt.setDate(6, datum);
			preparedStmt.setBoolean(7, av);
			preparedStmt.setBoolean(8, ab);
			preparedStmt.setBoolean(9, vv);
			preparedStmt.setBoolean(10, bv);
		      
			preparedStmt.executeUpdate();
			
			System.out.println("Neuer Eintrag in " + this.getClass());
			System.out.println("FamilieID:" + familieID + " RechnungsstellerID:" + rechnungsstellerID
							+ " KostenartenID:" + kostenartenID + " Rechnungsnummer:" + rechnungsnummer
							+ " Betrag:" + betrag + " Datum:" + datum + " av:" + av + ", ab:" + ab + ", vv:" + vv + ", bv:" + bv);
			
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
		return "Rechnungen [rechnunngID=" + rechnunngID + ", familieID=" + familieID + ", rechnungsstellerID="
				+ rechnungsstellerID + ", kostenartenID=" + kostenartenID + ", rechnungsnummer=" + rechnungsnummer
				+ ", betrag=" + betrag + ", datum=" + datum + ", av=" + av + ", ab=" + ab + ", vv=" + vv + ", bv=" + bv
				+ "]";
	}
	
}
