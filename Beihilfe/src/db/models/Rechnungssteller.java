package db.models;

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
	
	protected ArrayList<Rechnungssteller> rechnungsstellerListe = new ArrayList<Rechnungssteller>();

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

	@Override
	public String toString() {
		return "Rechnungssteller [rechnungsstellerID=" + rechnungsstellerID + ", nachname=" + nachname + ", vorname="
				+ vorname + ", amtsbezeichnung=" + amtsbezeichnung + ", strasse=" + strasse + ", hausnummer="
				+ hausnummer + ", stadt=" + stadt + ", plz=" + plz + ", kontonummer=" + kontonummer + ", blz="
				+ blz + ", bank=" + bank + ", kontoinhaber=" + kontoinhaber
				+ ", entfernung=" + entfernung + ", kostenOEPNV=" + kostenOEPNV + "]";
	}
	
}