package db.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class Dienstanschrift {

	private int dienstanschriftID;
	private String organisation;
	private String abteilung;
	private String strasse;
	private int hausnummer;
	private String stadt;
	private int plz;
	
	protected static ArrayList<Dienstanschrift> dienstanschriftListe = new ArrayList<Dienstanschrift>();

	public Dienstanschrift(int dienstanschriftID, String organisation, String abteilung, String strasse, int hausnummer,
			String stadt, int plz) {
		super();
		this.dienstanschriftID = dienstanschriftID;
		this.organisation = organisation;
		this.abteilung = abteilung;
		this.strasse = strasse;
		this.hausnummer = hausnummer;
		this.stadt = stadt;
		this.plz = plz;
	}
	
	public Dienstanschrift(String organisation, String abteilung, String strasse, int hausnummer,
			String stadt, int plz) {
		super();
		this.organisation = organisation;
		this.abteilung = abteilung;
		this.strasse = strasse;
		this.hausnummer = hausnummer;
		this.stadt = stadt;
		this.plz = plz;
	}

	public int getDienstanschriftID() {
		return dienstanschriftID;
	}

	public void setDienstanschriftID(int dienstanschriftID) {
		this.dienstanschriftID = dienstanschriftID;
	}

	public String getOrganisation() {
		return organisation;
	}

	public void setOrganisation(String organisation) {
		this.organisation = organisation;
	}

	public String getAbteilung() {
		return abteilung;
	}

	public void setAbteilung(String abteilung) {
		this.abteilung = abteilung;
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public int getHausnummer() {
		return hausnummer;
	}

	public void setHausnummer(int hausnummer) {
		this.hausnummer = hausnummer;
	}

	public String getStadt() {
		return stadt;
	}

	public void setStadt(String stadt) {
		this.stadt = stadt;
	}

	public int getPlz() {
		return plz;
	}

	public void setPlz(int plz) {
		this.plz = plz;
	}

	public ArrayList<Dienstanschrift> getDienstanschriftListe() {
		return dienstanschriftListe;
	}

	public void insertData() {
		
		Derby_Conn dc = new Derby_Conn();
		Connection conn = dc.start(Derby_Conn.getStandardDB());
		
		try
	    {			
			String query = " INSERT INTO Dienstanschrift (Organisation, Abteilung, Strasse, Hausnummer, Stadt, PLZ) "
					+ "values (?, ?, ?, ?, ?, ?)";
			PreparedStatement preparedStmt = conn.prepareStatement(query);	

			preparedStmt.setString(1, organisation);
			preparedStmt.setString(2, abteilung);
			preparedStmt.setString	(3, strasse);
			preparedStmt.setInt (4, hausnummer);
			preparedStmt.setString (5, stadt);
			preparedStmt.setInt (5, plz);
		      
			preparedStmt.executeUpdate();
			System.out.println("Neuer Eintrag in " + this.getClass());
			System.out.println("Organisation:" + organisation + " Abteilung:" + abteilung + " Strasse:" + strasse
					+ " Hausnummer:" + hausnummer + " Stadt:" + stadt + " PLZ:" + plz);
			
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
		return "Dienstanschrift [dienstanschriftID=" + dienstanschriftID + ", organisation=" + organisation
				+ ", abteilung=" + abteilung + ", strasse=" + strasse + ", hausnummer=" + hausnummer + ", stadt="
				+ stadt + ", plz=" + plz + "]";
	}
	
	
}