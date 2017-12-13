package db.models;

public class Kostenarten {

	private int kostenartenID;
	private String kostenName;
	
	public Kostenarten(int kostenartenID, String kostenName) {
		super();
		this.kostenartenID = kostenartenID;
		this.kostenName = kostenName;
	}

	public int getKostenartenID() {
		return kostenartenID;
	}

	public void setKostenartenID(int kostenartenID) {
		this.kostenartenID = kostenartenID;
	}

	public String getKostenName() {
		return kostenName;
	}

	public void setKostenName(String kostenName) {
		this.kostenName = kostenName;
	}

	@Override
	public String toString() {
		return "Kostenarten [kostenartenID=" + kostenartenID + ", kostenName=" + kostenName + "]";
	}
}
