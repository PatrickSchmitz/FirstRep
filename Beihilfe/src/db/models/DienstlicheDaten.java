package db.models;

public class DienstlicheDaten {

	private int dienstlicheDatenID;
	private long kennziffer;
	private String amtsbezeichnung;
	private int verguetungsgruppe;
	
	public DienstlicheDaten(int dienstlicheDatenID, long kennziffer, String amtsbezeichnung, int verguetungsgruppe) {
		super();
		this.dienstlicheDatenID = dienstlicheDatenID;
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

	@Override
	public String toString() {
		return "DienstlicheDaten [dienstlicheDatenID=" + dienstlicheDatenID + ", kennziffer=" + kennziffer
				+ ", amtsbezeichnung=" + amtsbezeichnung + ", verguetungsgruppe=" + verguetungsgruppe + "]";
	}	
}
