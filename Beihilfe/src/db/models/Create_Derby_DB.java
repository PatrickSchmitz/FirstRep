package db.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Create_Derby_DB {
	
	private String dbName = "Beihilfe";
	private static Connection conn = null;
	
	public static void main(String[] args){
		
	     new Create_Derby_DB().go(args);
	     System.out.println("Beihilfe erstellt.");
	     
	}
	
	void go(String[] args){
		
		Derby_Conn dc = new Derby_Conn();
		
		conn = dc.create(dbName);
		conn = dc.start(dbName);
	    
	    System.out.println("Datenbank " + dbName + " erstellt und gestartet");
	    
		ArrayList<Statement> statements = new ArrayList<Statement>(); // list of Statements, PreparedStatements
	    PreparedStatement psInsert;
	    PreparedStatement psUpdate;
	    Statement s;
	    ResultSet rs = null;    
	    
	    try
	    {	
	    	s = conn.createStatement();
	    	statements.add(s);
	    	////////////////////	Tabelle Familie	////////////////////	
	    	s.execute("CREATE TABLE Familie(FamilieID INT NOT NULL ," + 
	    			"Nachname VARCHAR(50) NOT NULL , Vorname VARCHAR(50) NOT NULL, " +
	    			"Familienposition VARCHAR(50) NOT NULL, Beihilfeprozentsatz FLOAT(1) NOT NULL, " +
	    			"Strasse VARCHAR(50) NOT NULL, Hausnummer INT NOT NULL, " +
	    			"Stadt VARCHAR(50) NOT NULL, PLZ INT NOT NULL, Telefon INT NOT NULL, " +
	    			"PRIMARY KEY(FamilieID))");
         
	    	System.out.println("Tabelle Familie erstellt");
	    	////////////////////	Tabelle Rechnungssteller	////////////////////
	    	s.execute("CREATE TABLE Rechnungssteller(RechnungsstellerID INT NOT NULL ," + 
	    			"Nachname VARCHAR(50) NOT NULL , Vorname VARCHAR(50) NOT NULL, " +
	    			"Amtsbezeichnung VARCHAR(50) NOT NULL, " +
	    			"Strasse VARCHAR(50) NOT NULL, Hausnummer INT NOT NULL, " +
	    			"Stadt VARCHAR(50) NOT NULL, PLZ INT NOT NULL,  " +
	    			"Kontonummer BIGINT NOT NULL, BLZ BIGINT NOT NULL,  " +
	    			"Bank VARCHAR(50) NOT NULL, Kontoinhaber VARCHAR(50) NOT NULL,  " +
	    			"Entfernung INT NOT NULL, KostenOEPNV FLOAT NOT NULL,  " +
	    			"PRIMARY KEY(RechnungsstellerID))");
         
	    	System.out.println("Tabelle Rechnungssteller erstellt");
	    	////////////////////	Tabelle Beihilfereglungen	////////////////////
	    	s.execute("CREATE TABLE Beihilfereglungen(BeihilfereglungenID INT NOT NULL ," + 
	    			"Zeitgrenze INT NOT NULL , Mindestbetrag FLOAT NOT NULL, " +
	    			"PRIMARY KEY(BeihilfereglungenID))");
         
	    	System.out.println("Tabelle Beihilfereglungen erstellt");
	    	////////////////////	Tabelle Kostenarten	////////////////////
	    	s.execute("CREATE TABLE Kostenarten(KostenartenID INT NOT NULL ," + 
	    			"Name VARCHAR(50) NOT NULL, " +
	    			"PRIMARY KEY(KostenartenID))");
      
	    	System.out.println("Tabelle Kostenarten erstellt");
	    	////////////////////	Tabelle Dienstanschritft	////////////////////
	    	s.execute("CREATE TABLE Dienstanschritft(DienstanschritftID INT NOT NULL ," + 
	    			"Organisation VARCHAR(50) NOT NULL, Abteilung VARCHAR(50) NOT NULL, " +
	    			"Strasse VARCHAR(50) NOT NULL, Hausnummer INT NOT NULL, " +
	    			"Stadt VARCHAR(50) NOT NULL, PLZ INT NOT NULL, " +
	    			"PRIMARY KEY(DienstanschritftID))");
   
	    	System.out.println("Tabelle Dienstanschritft erstellt");
	    	////////////////////	Tabelle Dienstdaten	////////////////////
	    	s.execute("CREATE TABLE Dienstdaten(DienstdatenID INT NOT NULL ," +
	    			"DienstanschritftID INT NOT NULL references Dienstanschritft(DienstanschritftID) ," + 
	    			"Kennziffer BIGINT NOT NULL, Amtsbezeichnung VARCHAR(50) NOT NULL, " +
	    			"Verguetungsgruppe INT NOT NULL, " +
	    			"PRIMARY KEY(DienstdatenID))");

	    	System.out.println("Tabelle Dienstdaten erstellt");
	    	////////////////////	Tabelle Antragsteller	////////////////////
	    	s.execute("CREATE TABLE Antragsteller(AntragstellerID INT NOT NULL ," +
	    			"FamilieID INT NOT NULL references Familie(FamilieID) ," + 
	    			"DienstdatenID INT NOT NULL references Dienstdaten(DienstdatenID) ," +
	    			"BeihilfereglungenID INT NOT NULL references Beihilfereglungen(BeihilfereglungenID) ," +
	    			"PRIMARY KEY(AntragstellerID))");

		    System.out.println("Tabelle Antragsteller erstellt");
		    ////////////////////	Tabelle Rechnungen	////////////////////
		    s.execute("CREATE TABLE Rechnungen(RechnungenID INT NOT NULL ," +
	    			"FamilieID INT NOT NULL references Familie(FamilieID) ," + 
	    			"RechnungsstellerID INT NOT NULL references Rechnungssteller(RechnungsstellerID) ," +
	    			"KostenartenID INT NOT NULL references Kostenarten(KostenartenID) ," +
	    			"PRIMARY KEY(RechnungenID))");

		    System.out.println("Tabelle Rechnungen erstellt");
         
	    }
	    catch (SQLException sqle)
	    {
	         dc.printSQLException(sqle);
	    }   
	}
}
