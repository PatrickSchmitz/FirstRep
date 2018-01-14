package db.models;

public class SQL_querys_create {
	
	private String createFamilie = ("CREATE TABLE Familie(" + 
			"FamilieID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1), " + 
			"Nachname VARCHAR(50) NOT NULL," +
			"Vorname VARCHAR(50) NOT NULL, " +
			"Familienposition VARCHAR(50) NOT NULL, " +
			"Beihilfeprozentsatz FLOAT(1) NOT NULL, " +
			"Strasse VARCHAR(50) NOT NULL, " +
			"Hausnummer INT NOT NULL, " +
			"Stadt VARCHAR(50) NOT NULL, " + 
			"PLZ INT NOT NULL, " + 
			"Telefon VARCHAR(50) NOT NULL, " +
			"PRIMARY KEY(FamilieID))");

	private String createRechnungssteller = ("CREATE TABLE Rechnungssteller("+ 
			"RechnungsstellerID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1)," + 
			"Nachname VARCHAR(50) NOT NULL , " + 
			"Vorname VARCHAR(50) NOT NULL, " +
			"Amtsbezeichnung VARCHAR(50) NOT NULL, " +
			"Strasse VARCHAR(50) NOT NULL, " + 
			"Hausnummer INT NOT NULL, " +
			"Stadt VARCHAR(50) NOT NULL, " +
			"PLZ INT NOT NULL,  " +
			"Kontonummer BIGINT NOT NULL, " + 
			"BLZ BIGINT NOT NULL,  " +
			"Bank VARCHAR(50) NOT NULL, " + 
			"Kontoinhaber VARCHAR(50) NOT NULL,  " +
			"Entfernung INT NOT NULL, " + 
			"KostenOEPNV FLOAT NOT NULL,  " +
			"PRIMARY KEY(RechnungsstellerID))");
	
	private String createBeihilferegelungen = ("CREATE TABLE Beihilferegelungen(" + 
			"BeihilferegelungenID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1)," + 
			"Zeitgrenze INT NOT NULL , " + 
			"Mindestbetrag FLOAT NOT NULL, " +
			"PRIMARY KEY(BeihilferegelungenID))");
	
	private String createKostenarten = ("CREATE TABLE Kostenarten(" + 
			"KostenartenID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1)," + 
			"Name VARCHAR(50) NOT NULL, " +
			"PRIMARY KEY(KostenartenID))");
	
	private String createDienstanschrift = ("CREATE TABLE Dienstanschrift(" + 
			"DienstanschriftID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1)," + 
			"Organisation VARCHAR(50) NOT NULL, " + 
			"Abteilung VARCHAR(50) NOT NULL, " +
			"Strasse VARCHAR(50) NOT NULL, " + 
			"Hausnummer INT NOT NULL, " +
			"Stadt VARCHAR(50) NOT NULL, " + 
			"PLZ INT NOT NULL, " +
			"PRIMARY KEY(DienstanschriftID))");
	
	private String createDienstdaten = ("CREATE TABLE Dienstdaten(" + 
			"DienstdatenID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1)," +
			"DienstanschriftID INT NOT NULL references Dienstanschrift(DienstanschriftID) ," + 
			"Kennziffer BIGINT NOT NULL, " +
			"Amtsbezeichnung VARCHAR(50) NOT NULL, " +
			"Verguetungsgruppe INT NOT NULL, " +
			"PRIMARY KEY(DienstdatenID))");
	
	private String createAntragsteller =("CREATE TABLE Antragsteller(" + 
			"AntragstellerID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1)," +
			"FamilieID INT NOT NULL references Familie(FamilieID) ," + 
			"DienstdatenID INT NOT NULL references Dienstdaten(DienstdatenID) ," +
			"BeihilferegelungenID INT NOT NULL references Beihilferegelungen(BeihilferegelungenID) ," +
			"PRIMARY KEY(AntragstellerID))");
	
	private String createRechnungen = ("CREATE TABLE Rechnungen(" + 
			"RechnungenID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1)," +
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
