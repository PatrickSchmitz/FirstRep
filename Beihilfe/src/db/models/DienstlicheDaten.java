package db.models;

import java.util.ArrayList;

public class DienstlicheDaten {

	private int dienstlicheDatenID;
	private int dienstanschriftID;
	private long kennziffer;
	private String amtsbezeichnung;
	private int verguetungsgruppe;
	
	protected ArrayList<DienstlicheDaten> dienstlicheDatenListe = new ArrayList<DienstlicheDaten>();

	public DienstlicheDaten(int dienstlicheDatenID, int dienstanschriftID, long kennziffer, String amtsbezeichnung,
			int verguetungsgruppe) {
		super();
		this.dienstlicheDatenID = dienstlicheDatenID;
		this.dienstanschriftID = dienstanschriftID;
		this.kennziffer = kennziffer;
		this.amtsbezeichnung = amtsbezeichnung;
		this.verguetungsgruppe = verguetungsgruppe;
	}

	public int getDienstlicheDatenID() {
		return dienstlicheDatenID;
	}


	public void setDienstlicheDatenID(int dienstlicheDatenID) {
		this.dienstlicheDatenID = dienstlicheDatenID;
	}


	public int getDienstanschriftID() {
		return dienstanschriftID;
	}


	public void setDienstanschriftID(int dienstanschriftID) {
		this.dienstanschriftID = dienstanschriftID;
	}


	public long getKennziffer() {
		return kennziffer;
	}


	public void setKennziffer(long kennziffer) {
		this.kennziffer = kennziffer;
	}


	public String getAmtsbezeichnung() {
		return amtsbezeichnung;
	}


	public void setAmtsbezeichnung(String amtsbezeichnung) {
		this.amtsbezeichnung = amtsbezeichnung;
	}


	public int getVerguetungsgruppe() {
		return verguetungsgruppe;
	}


	public void setVerguetungsgruppe(int verguetungsgruppe) {
		this.verguetungsgruppe = verguetungsgruppe;
	}


	public ArrayList<DienstlicheDaten> getDienstlicheDatenListe() {
		return dienstlicheDatenListe;
	}

	@Override
	public String toString() {
		return "DienstlicheDaten [dienstlicheDatenID=" + dienstlicheDatenID + ", kennziffer=" + kennziffer
				+ ", amtsbezeichnung=" + amtsbezeichnung + ", verguetungsgruppe=" + verguetungsgruppe + "]";
	}	
}
