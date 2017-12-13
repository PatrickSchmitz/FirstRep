package db.models;

public class Familie {
	
	private int familienID;
	private String nachname;
	private String vorname;
	private String familienPos;
	private String strasse;
	private int hausnummer;
	private String stadt;
	private int plz;
	private long telefonnummer;
	
	public Familie(int familienID, String nachname, String vorname, String familienPos, String strasse, int hausnummer,
			String stadt, int plz, long telefonnummer) {
		super();
		this.familienID = familienID;
		this.nachname = nachname;
		this.vorname = vorname;
		this.familienPos = familienPos;
		this.strasse = strasse;
		this.hausnummer = hausnummer;
		this.stadt = stadt;
		this.plz = plz;
		this.telefonnummer = telefonnummer;
	}

	public int getFamilienID() {
		return familienID;
	}

	public void setFamilienID(int familienID) {
		this.familienID = familienID;
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

	public String getFamilienPos() {
		return familienPos;
	}

	public void setFamilienPos(String familienPos) {
		this.familienPos = familienPos;
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

	public long getTelefonnummer() {
		return telefonnummer;
	}

	public void setTelefonnummer(long telefonnummer) {
		this.telefonnummer = telefonnummer;
	}

	@Override
	public String toString() {
		return "Familie [familienID=" + familienID + ", nachname=" + nachname + ", vorname=" + vorname
				+ ", familienPos=" + familienPos + ", strasse=" + strasse + ", hausnummer=" + hausnummer + ", stadt="
				+ stadt + ", plz=" + plz + ", telefonnummer=" + telefonnummer + "]";
	}
		
}
