package db.models;

public class Beihilfereglungen {
	
	private int beihilfereglungenID;
	private int zeitgenze; 				// in Tagen
	private float mindestbetrag;		// in Euro(€)
	
	public Beihilfereglungen(int beihilfereglungenID, int zeitgenze, float mindestbetrag) {
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

	@Override
	public String toString() {
		return "Beihilfereglungen [beihilfereglungenID=" + beihilfereglungenID + ", zeitgenze=" + zeitgenze
				+ ", mindestbetrag=" + mindestbetrag + "]";
	}	
}
