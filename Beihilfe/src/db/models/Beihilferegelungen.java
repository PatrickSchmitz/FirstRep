package db.models;

import java.util.ArrayList;

public class Beihilferegelungen {
	
	
	private int beihilfereglungenID;
	private int zeitgenze; 				// in Tagen
	private float mindestbetrag;		// in Euro(€)
	
	protected ArrayList<Beihilferegelungen> beihilferegelungenListe = new ArrayList<Beihilferegelungen>();
	
	public Beihilferegelungen(int beihilfereglungenID, int zeitgenze, float mindestbetrag) {
		super();
		this.beihilfereglungenID = beihilfereglungenID;
		this.zeitgenze = zeitgenze;
		this.mindestbetrag = mindestbetrag;
	}

	public int getBeihilfereglungenID() {
		return beihilfereglungenID;
	}

	public void setBeihilfereglungenID(int beihilfereglungenID) {
		this.beihilfereglungenID = beihilfereglungenID;
	}

	public int getZeitgenze() {
		return zeitgenze;
	}

	public void setZeitgenze(int zeitgenze) {
		this.zeitgenze = zeitgenze;
	}

	public float getMindestbetrag() {
		return mindestbetrag;
	}

	public void setMindestbetrag(float mindestbetrag) {
		this.mindestbetrag = mindestbetrag;
	}

	public ArrayList<Beihilferegelungen> getBeihilferegelungenListe() {
		return beihilferegelungenListe;
	}

	@Override
	public String toString() {
		return "Beihilfereglungen [beihilfereglungenID=" + beihilfereglungenID + ", zeitgenze=" + zeitgenze
				+ ", mindestbetrag=" + mindestbetrag + "]";
	}

}
