package db.models;

public class SQL_querys {
	
	private String createFamilie = ("CREATE TABLE Familie(FamilieID INT NOT NULL ," + 
			"Nachname VARCHAR(50) NOT NULL , Vorname VARCHAR(50) NOT NULL, " +
			"Familienposition VARCHAR(50) NOT NULL, Beihilfeprozentsatz FLOAT(1) NOT NULL, " +
			"Strasse VARCHAR(50) NOT NULL, Hausnummer INT NOT NULL, " +
			"Stadt VARCHAR(50) NOT NULL, PLZ INT NOT NULL, Telefon INT NOT NULL, " +
			"PRIMARY KEY(FamilieID))");

	private String createRechnungssteller = ("CREATE TABLE Rechnungssteller(RechnungsstellerID INT NOT NULL ," + 
			"Nachname VARCHAR(50) NOT NULL , Vorname VARCHAR(50) NOT NULL, " +
			"Amtsbezeichnung VARCHAR(50) NOT NULL, " +
			"Strasse VARCHAR(50) NOT NULL, Hausnummer INT NOT NULL, " +
			"Stadt VARCHAR(50) NOT NULL, PLZ INT NOT NULL,  " +
			"Kontonummer BIGINT NOT NULL, BLZ BIGINT NOT NULL,  " +
			"Bank VARCHAR(50) NOT NULL, Kontoinhaber VARCHAR(50) NOT NULL,  " +
			"Entfernung INT NOT NULL, KostenOEPNV FLOAT NOT NULL,  " +
			"PRIMARY KEY(RechnungsstellerID))");
	
	private String createBeihilferegelungen = ("CREATE TABLE Beihilferegelungen(BeihilferegelungenID INT NOT NULL ," + 
			"Zeitgrenze INT NOT NULL , Mindestbetrag FLOAT NOT NULL, " +
			"PRIMARY KEY(BeihilferegelungenID))");
	
	private String createKostenarten = ("CREATE TABLE Kostenarten(KostenartenID INT NOT NULL ," + 
			"Name VARCHAR(50) NOT NULL, " +
			"PRIMARY KEY(KostenartenID))");
	
	private String createDienstanschrift = ("CREATE TABLE Dienstanschrift(DienstanschriftID INT NOT NULL ," + 
			"Organisation VARCHAR(50) NOT NULL, Abteilung VARCHAR(50) NOT NULL, " +
			"Strasse VARCHAR(50) NOT NULL, Hausnummer INT NOT NULL, " +
			"Stadt VARCHAR(50) NOT NULL, PLZ INT NOT NULL, " +
			"PRIMARY KEY(DienstanschriftID))");
	
	private String createDienstdaten = ("CREATE TABLE Dienstdaten(DienstdatenID INT NOT NULL ," +
			"DienstanschriftID INT NOT NULL references Dienstanschrift(DienstanschriftID) ," + 
			"Kennziffer BIGINT NOT NULL, Amtsbezeichnung VARCHAR(50) NOT NULL, " +
			"Verguetungsgruppe INT NOT NULL, " +
			"PRIMARY KEY(DienstdatenID))");
	
	private String createAntragsteller =("CREATE TABLE Antragsteller(AntragstellerID INT NOT NULL ," +
			"FamilieID INT NOT NULL references Familie(FamilieID) ," + 
			"DienstdatenID INT NOT NULL references Dienstdaten(DienstdatenID) ," +
			"BeihilferegelungenID INT NOT NULL references Beihilferegelungen(BeihilferegelungenID) ," +
			"PRIMARY KEY(AntragstellerID))");
	
	private String createRechnungen = ("CREATE TABLE Rechnungen(RechnungenID INT NOT NULL ," +
			"FamilieID INT NOT NULL references Familie(FamilieID) ," + 
			"RechnungsstellerID INT NOT NULL references Rechnungssteller(RechnungsstellerID) ," +
			"KostenartenID INT NOT NULL references Kostenarten(KostenartenID) ," +
			"PRIMARY KEY(RechnungenID))");

	public String getCreateFamilie() {
		return createFamilie;
	}

	public String getCreateRechnungssteller() {
		return createRechnungssteller;
	}

	public String getCreateBeihilferegelungen() {
		return createBeihilferegelungen;
	}

	public String getCreateKostenarten() {
		return createKostenarten;
	}

	public String getCreateDienstanschrift() {
		return createDienstanschrift;
	}

	public String getCreateDienstdaten() {
		return createDienstdaten;
	}

	public String getCreateAntragsteller() {
		return createAntragsteller;
	}

	public String getCreateRechnungen() {
		return createRechnungen;
	}

}
