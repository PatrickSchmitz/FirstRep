package db.models;

public class Rechnungssteller {

	private int rechnungsstellerID;
	private String rsNachname;
	private String rsVorname;
	private String amtsbezeichnung;
	private String rsStrasse;
	private int rsHausnummer;
	private String rsStadt;
	private int rsPlz;
	private long rsTelefonnummer;
	private long kontonummer;
	private long blz;
	private String bank;
	private String kontoinhaber;
	private int entfernung;				// in Kilometern(km)
	private float kostenOEPNV;			// in Euro(€)
	
	public Rechnungssteller(int rechnungsstellerID, String rsNachname, String rsVorname, String amtsbezeichnung,
			String rsStrasse, int rsHausnummer, String rsStadt, int rsPlz, long rsTelefonnummer, long kontonummer,
			long blz, String bank, String kontoinhaber, int entfernung, float kostenOEPNV) {
		super();
		this.rechnungsstellerID = rechnungsstellerID;
		this.rsNachname = rsNachname;
		this.rsVorname = rsVorname;
		this.amtsbezeichnung = amtsbezeichnung;
		this.rsStrasse = rsStrasse;
		this.rsHausnummer = rsHausnummer;
		this.rsStadt = rsStadt;
		this.rsPlz = rsPlz;
		this.rsTelefonnummer = rsTelefonnummer;
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

	public String getRsNachname() {
		return rsNachname;
	}

	public void setRsNachname(String rsNachname) {
		this.rsNachname = rsNachname;
	}

	public String getRsVorname() {
		return rsVorname;
	}

	public void setRsVorname(String rsVorname) {
		this.rsVorname = rsVorname;
	}

	public String getAmtsbezeichnung() {
		return amtsbezeichnung;
	}

	public void setAmtsbezeichnung(String amtsbezeichnung) {
		this.amtsbezeichnung = amtsbezeichnung;
	}

	public String getRsStrasse() {
		return rsStrasse;
	}

	public void setRsStrasse(String rsStrasse) {
		this.rsStrasse = rsStrasse;
	}

	public int getRsHausnummer() {
		return rsHausnummer;
	}

	public void setRsHausnummer(int rsHausnummer) {
		this.rsHausnummer = rsHausnummer;
	}

	public String getRsStadt() {
		return rsStadt;
	}

	public void setRsStadt(String rsStadt) {
		this.rsStadt = rsStadt;
	}

	public int getRsPlz() {
		return rsPlz;
	}

	public void setRsPlz(int rsPlz) {
		this.rsPlz = rsPlz;
	}

	public long getRsTelefonnummer() {
		return rsTelefonnummer;
	}

	public void setRsTelefonnummer(long rsTelefonnummer) {
		this.rsTelefonnummer = rsTelefonnummer;
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

	@Override
	public String toString() {
		return "Rechnungssteller [rechnungsstellerID=" + rechnungsstellerID + ", rsNachname=" + rsNachname
				+ ", rsVorname=" + rsVorname + ", amtsbezeichnung=" + amtsbezeichnung + ", rsStrasse=" + rsStrasse
				+ ", rsHausnummer=" + rsHausnummer + ", rsStadt=" + rsStadt + ", rsPlz=" + rsPlz + ", rsTelefonnummer="
				+ rsTelefonnummer + ", kontonummer=" + kontonummer + ", blz=" + blz + ", bank=" + bank
				+ ", kontoinhaber=" + kontoinhaber + ", entfernung=" + entfernung + ", kostenOEPNV=" + kostenOEPNV
				+ "]";
	}	
}
