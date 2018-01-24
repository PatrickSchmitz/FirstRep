package db.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class Rechnungssteller {

	private int rechnungsstellerID;
	private String nachname;
	private String vorname;
	private String amtsbezeichnung;
	private String strasse;
	private int hausnummer;
	private String stadt;
	private int plz;
	private long kontonummer;
	private long blz;
	private String bank;
	private String kontoinhaber;
	private int entfernung;				// in Kilometern(km)
	private float kostenOEPNV;			// in Euro(€)
	
	protected static ArrayList<Rechnungssteller> rechnungsstellerListe = new ArrayList<Rechnungssteller>();

	public Rechnungssteller(int rechnungsstellerID, String nachname, String vorname, String amtsbezeichnung,
			String strasse, int hausnummer, String stadt, int plz, long kontonummer, long blz,
			String bank, String kontoinhaber, int entfernung, float kostenOEPNV){
		super();
		this.rechnungsstellerID = rechnungsstellerID;
		this.nachname = nachname;
		this.vorname = vorname;
		this.amtsbezeichnung = amtsbezeichnung;
		this.strasse = strasse;
		this.hausnummer = hausnummer;
		this.stadt = stadt;
		this.plz = plz;
		this.kontonummer = kontonummer;
		this.blz = blz;
		this.bank = bank;
		this.kontoinhaber = kontoinhaber;
		this.entfernung = entfernung;
		this.kostenOEPNV = kostenOEPNV;
	}

	public int getRechnungsstellerID() {
		return rechnungsstellerID;
	}

	public void setRechnungsstellerID(int rechnungsstellerID) {
		this.rechnungsstellerID = rechnungsstellerID;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getAmtsbezeichnung() {
		return amtsbezeichnung;
	}

	public void setAmtsbezeichnung(String amtsbezeichnung) {
		this.amtsbezeichnung = amtsbezeichnung;
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

	public long getKontonummer() {
		return kontonummer;
	}

	public void setKontonummer(long kontonummer) {
		this.kontonummer = kontonummer;
	}

	public long getBlz() {
		return blz;
	}

	public void setBlz(long blz) {
		this.blz = blz;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getKontoinhaber() {
		return kontoinhaber;
	}

	public void setKontoinhaber(String kontoinhaber) {
		this.kontoinhaber = kontoinhaber;
	}

	public int getEntfernung() {
		return entfernung;
	}

	public void setEntfernung(int entfernung) {
		this.entfernung = entfernung;
	}

	public float getKostenOEPNV() {
		return kostenOEPNV;
	}

	public void setKostenOEPNV(float kostenOEPNV) {
		this.kostenOEPNV = kostenOEPNV;
	}

	public ArrayList<Rechnungssteller> getRechnungsstellerListe() {
		return rechnungsstellerListe;
	}

	public void insertData() {
		
		Derby_Conn dc = new Derby_Conn();
		Connection conn = dc.start(Derby_Conn.getStandardDB());
		
		try
	    {
			String query = " INSERT INTO Rechnungssteller (Nachname, Vorname, Amtsbezeichnung, Strasse, Hausnummer"
					+ "Stadt, PLZ, Kontonummer, BLZ, Bank, Kontoinhaber, Entfernung, KostenOEPNV) "
					+ "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement preparedStmt = conn.prepareStatement(query);	

			preparedStmt.setString(1, nachname);
			preparedStmt.setString(2, vorname);
			preparedStmt.setString(3, amtsbezeichnung);
			preparedStmt.setString(4, strasse);
			preparedStmt.setFloat(5, hausnummer);
			preparedStmt.setString(6, stadt);
			preparedStmt.setInt(7, plz);
			preparedStmt.setLong(8, kontonummer);
			preparedStmt.setLong(9, blz);
			preparedStmt.setString(10, bank);
			preparedStmt.setString(11, kontoinhaber);
			preparedStmt.setFloat(12, entfernung);
			preparedStmt.setFloat(13, kostenOEPNV);

		      
			preparedStmt.execute();
			
			System.out.println("Neuer Eintrag in " + this.getClass());
			System.out.println("Nachname:" + nachname + " Vorname:" + vorname + " Amtsbezeichnung:" + amtsbezeichnung
							+ " Strasse:" + strasse + " Hausnummer:" + hausnummer + " Stadt:" + stadt
							+ " PLZ:" + plz + " Kontonummer:" + kontonummer + " BLZ:" + blz
							+ " Bank:" + bank + " Kontoinhaber:" + kontoinhaber + " Entfernung:" + entfernung
							+ " KostenOEPNV:" + kostenOEPNV);
			preparedStmt.close();
	    }
	    catch (SQLException sqle)
	    {
	      dc.printSQLException(sqle);
	    }		
	}

	@Override
	public String toString() {
		return "Rechnungssteller [rechnungsstellerID=" + rechnungsstellerID + ", nachname=" + nachname + ", vorname="
				+ vorname + ", amtsbezeichnung=" + amtsbezeichnung + ", strasse=" + strasse + ", hausnummer="
				+ hausnummer + ", stadt=" + stadt + ", plz=" + plz + ", kontonummer=" + kontonummer + ", blz="
				+ blz + ", bank=" + bank + ", kontoinhaber=" + kontoinhaber
				+ ", entfernung=" + entfernung + ", kostenOEPNV=" + kostenOEPNV + "]";
	}
	
}