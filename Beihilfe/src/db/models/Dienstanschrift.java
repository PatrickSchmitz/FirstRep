package db.models;

public class Dienstanschrift {

	private int dienstanschriftID;
	private String Organisation;
	private String Abteilung;
	private String dienstStrasse;
	private int dienstHausnummer;
	private String dienstStadt;
	private int dienstPlz;
	
	public Dienstanschrift(int dienstanschriftID, String organisation, String abteilung, String dienstStrasse,
			int dienstHausnummer, String dienstStadt, int dienstPlz) {
		super();
		this.dienstanschriftID = dienstanschriftID;
		Organisation = organisation;
		Abteilung = abteilung;
		this.dienstStrasse = dienstStrasse;
		this.dienstHausnummer = dienstHausnummer;
		this.dienstStadt = dienstStadt;
		this.dienstPlz = dienstPlz;
	}

	public int getDienstanschriftID() {
		return dienstanschriftID;
	}

	public void setDienstanschriftID(int dienstanschriftID) {
		this.dienstanschriftID = dienstanschriftID;
	}

	public String getOrganisation() {
		return Organisation;
	}

	public void setOrganisation(String organisation) {
		Organisation = organisation;
	}

	public String getAbteilung() {
		return Abteilung;
	}

	public void setAbteilung(String abteilung) {
		Abteilung = abteilung;
	}

	public String getDienstStrasse() {
		return dienstStrasse;
	}

	public void setDienstStrasse(String dienstStrasse) {
		this.dienstStrasse = dienstStrasse;
	}

	public int getDienstHausnummer() {
		return dienstHausnummer;
	}

	public void setDienstHausnummer(int dienstHausnummer) {
		this.dienstHausnummer = dienstHausnummer;
	}

	public String getDienstStadt() {
		return dienstStadt;
	}

	public void setDienstStadt(String dienstStadt) {
		this.dienstStadt = dienstStadt;
	}

	public int getDienstPlz() {
		return dienstPlz;
	}

	public void setDienstPlz(int dienstPlz) {
		this.dienstPlz = dienstPlz;
	}

	@Override
	public String toString() {
		return "Dienstanschrift [dienstanschriftID=" + dienstanschriftID + ", Organisation=" + Organisation
				+ ", Abteilung=" + Abteilung + ", dienstStrasse=" + dienstStrasse + ", dienstHausnummer="
				+ dienstHausnummer + ", dienstStadt=" + dienstStadt + ", dienstPlz=" + dienstPlz + "]";
	}
}
