package db.models;

import java.util.ArrayList;

public class Dienstanschrift {

	private int dienstanschriftID;
	private String organisation;
	private String abteilung;
	private String strasse;
	private int hausnummer;
	private String stadt;
	private int plz;
	
	protected ArrayList<Dienstanschrift> dienstanschriftListe = new ArrayList<Dienstanschrift>();

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

	@Override
	public String toString() {
		return "Dienstanschrift [dienstanschriftID=" + dienstanschriftID + ", organisation=" + organisation
				+ ", abteilung=" + abteilung + ", strasse=" + strasse + ", hausnummer=" + hausnummer + ", stadt="
				+ stadt + ", plz=" + plz + "]";
	}
	
	
}