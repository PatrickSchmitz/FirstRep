package db.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/**Klasse Rechnungen für die Tabelle der Datenbank*/
public class Rechnungen {

	private int rechnungID;
	private int familieID;
	private int rechnungsstellerID;
	private int kostenartenID;
	private int rechnungsnummer;
	private float betrag;
	private java.sql.Date datum;
	private boolean av;
	private boolean ab;
	private boolean vv;
	private boolean vb;
	/**diffDays ist die Differenz des Datums der Rechnung
	 * und dem Heutigen Tag.*/
	private long diffDays; 
	
	/**In der Liste rechnungenListe stehen alle Einträge der Tabelle Rechnungen.*/
	protected static ArrayList<Rechnungen> rechnungenListe = new ArrayList<Rechnungen>();
	 
	public Rechnungen(int rechnungID, int familieID, int rechnungsstellerID, int kostenartenID, int rechnungsnummer,
			float betrag, java.sql.Date datum) {
		super();
		this.rechnungID = rechnungID;
		this.familieID = familieID;
		this.rechnungsstellerID = rechnungsstellerID;
		this.kostenartenID = kostenartenID;
		this.rechnungsnummer = rechnungsnummer;
		this.betrag = betrag;
		this.datum = datum;
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
	}
	
	public Rechnungen(int rechnungID, int familieID, int rechnungsstellerID, int kostenartenID, int rechnungsnummer,
			float betrag, java.sql.Date datum, boolean av, boolean ab, boolean vv, boolean vb) {
		super();
		this.rechnungID = rechnungID;
		this.familieID = familieID;
		this.rechnungsstellerID = rechnungsstellerID;
		this.kostenartenID = kostenartenID;
		this.rechnungsnummer = rechnungsnummer;
		this.betrag = betrag;
		this.datum = datum;
		this.av = av;
		this.ab = ab;
		this.vv = vv;
		this.vb = vb;
	}

	public Rechnungen(int familieID, int rechnungsstellerID, int kostenartenID, int rechnungsnummer,
			float betrag, java.sql.Date datum, boolean av, boolean ab, boolean vv, boolean vb) {
		super();
		this.familieID = familieID;
		this.rechnungsstellerID = rechnungsstellerID;
		this.kostenartenID = kostenartenID;
		this.rechnungsnummer = rechnungsnummer;
		this.betrag = betrag;
		this.datum = datum;
		this.av = av;
		this.ab = ab;
		this.vv = vv;
		this.vb = vb;
	}

	public int getRechnungID() {
		return rechnungID;
	}

	public void setRechnungID(int rechnungID) {
		this.rechnungID = rechnungID;
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

	public boolean isVb() {
		return vb;
	}

	public void setVb(boolean vb) {
		this.vb = vb;
	}

	public long getDiffDays() {
		Date utilDate = new Date();
		java.sql.Date d = new java.sql.Date(utilDate.getTime());
		
		long diff = d.getTime()- datum.getTime();
	    diffDays = diff / (24 * 60 * 60 * 1000);
	    
		return diffDays;
	}

	public ArrayList<Rechnungen> getRechnungenListe() {
		return rechnungenListe;
	}
	
	/**Speichert ein Element der Klasse Rechnung in die Tabelle der Datenbank.*/
	public void insertData() {
		
		Derby_Conn dc = new Derby_Conn();
		Connection conn = dc.start(Derby_Conn.getStandardDB());
		
		try
	    {
			String query = " INSERT INTO Rechnungen (FamilieID, RechnungsstellerID, KostenartenID, Rechnungsnummer,"
					+ "Betrag, Datum, AV, AB, VV, VB) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
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
			preparedStmt.setBoolean(10, vb);
		      
			preparedStmt.executeUpdate();
			
			System.out.println("Neuer Eintrag in " + this.getClass());
			System.out.println("FamilieID:" + familieID + " RechnungsstellerID:" + rechnungsstellerID
							+ " KostenartenID:" + kostenartenID + " Rechnungsnummer:" + rechnungsnummer
							+ " Betrag:" + betrag + " Datum:" + datum + " av:" + av + ", ab:" + ab + ", vv:" + vv + ", vb:" + vb);
			
			conn.commit();
			preparedStmt.close();
			conn.close();
	    }
	    catch (SQLException sqle)
	    {
	      dc.printSQLException(sqle);
	    }		
	}

	/**Warnt vor noch nicht bezahlten Rechnungen*/
	public Boolean dateWarning() {
		
		Date utilDate = new Date();
		java.sql.Date d = new java.sql.Date(utilDate.getTime());
		
		long diff = d.getTime()- datum.getTime();
	    diffDays = diff / (24 * 60 * 60 * 1000);
	     
		if(diffDays<=30)
			return true;
		else
			return false;
	}
	
	/**Prueft das Datum der Rechnung.
	 * Falls diese aelter als 5 Jahre(1825 Tage) ist, 
	 * wird sie geloescht.*/
	public void archivierungsTest() {
		
		Date utilDate = new Date();
		java.sql.Date d = new java.sql.Date(utilDate.getTime());
		
		long diff = d.getTime()- datum.getTime();
	    diffDays = diff / (24 * 60 * 60 * 1000);
	     
		if(diffDays<=1825)
			SQL_querys_delete.deleteRechnung(this.rechnungID);
		
	}
	
	@Override
	public String toString() {
		return "Rechnungen [rechnungID=" + rechnungID + ", familieID=" + familieID + ", rechnungsstellerID="
				+ rechnungsstellerID + ", kostenartenID=" + kostenartenID + ", rechnungsnummer=" + rechnungsnummer
				+ ", betrag=" + betrag + ", datum=" + datum + ", av=" + av + ", ab=" + ab + ", vv=" + vv + ", vb=" + vb
				+ "]";
	}
	
}
