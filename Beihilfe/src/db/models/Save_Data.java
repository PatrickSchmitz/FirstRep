package db.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Save_Data {

	private String dbName = "BeihilfeDB";
	private static Connection conn = null;
	
	public void saveFamilie(){
		
		Derby_Conn dc = new Derby_Conn();
		conn = dc.start(dbName);
		Statement s;
	    ResultSet rs = null;    
	    Familie.familienListe = null;
	    
	    try{	
	    	s = conn.createStatement();
	    	rs = s.executeQuery("SELECT * FROM Familie ORDER BY FamilieID");
	    	while(rs.next()){
	    		Familie.familienListe.add(new Familie(
	    				rs.getInt("FamilieID"), 
	    				rs.getString("Nachname"), 
	    				rs.getString("Vorname"), 
	    				rs.getString("Familienposition"), 
	    				rs.getFloat("Beihilfeprozentsatz"),
	    				rs.getString("Strasse"),
	    				rs.getInt("Hausnummer"),
	    				rs.getString("Stadt"), 
	    				rs.getInt("PLZ"), 
	    				rs.getInt("Telefon")));
	    	}
	    	rs.close();
	    	s.close();
	    }
	    catch (SQLException sqle)
	    {
	         dc.printSQLException(sqle);
	    }
	}

	public void saveRechnungssteller(){
		
		Derby_Conn dc = new Derby_Conn();
		conn = dc.start(dbName);
		Statement s;
	    ResultSet rs = null;
	    Rechnungssteller.rechnungsstellerListe = null;
	    
	    try{	
	    	s = conn.createStatement();
	    	rs = s.executeQuery("SELECT * FROM Rechnungssteller ORDER BY RechnungsstellerID");
	    	while(rs.next()){
	    		Rechnungssteller.rechnungsstellerListe.add(new Rechnungssteller(
	    			rs.getInt("RechnungsstellerID"), 
	    			rs.getString("Nachname"), 
	    			rs.getString("Vorname"), 
	    			rs.getString("Amtsbezeichnung"),
	    			rs.getString("Strasse"),
	    			rs.getInt("Hausnummer"),
	    			rs.getString("Stadt"), 
	    			rs.getInt("PLZ"), 
	    			rs.getLong("Kontonummer"),
	    			rs.getLong("BLZ"),
	    			rs.getString("Bank"),
	    			rs.getString("Kontoinhaber"),
	    			rs.getInt("Entfernung"),
	    			rs.getFloat("KostenOEPNV")));
	    		
	    	}
	    	rs.close();
	    	s.close();
	    }
	    catch (SQLException sqle)
	    {
	         dc.printSQLException(sqle);
	    }
	}
	
	public void saveBeihilfereglungen(){
		
		Derby_Conn dc = new Derby_Conn();
		conn = dc.start(dbName);
		Statement s;
	    ResultSet rs = null;    
	    Beihilferegelungen.beihilferegelungenListe = null;
	    
	    try{	
	    	s = conn.createStatement();
	    	rs = s.executeQuery("SELECT * FROM Beihilferegelungen ORDER BY BeihilferegelungenID");
	    	while(rs.next()){
	    		Beihilferegelungen.beihilferegelungenListe.add(new Beihilferegelungen(
	    			rs.getInt("RechnungsstellerID"), 
	    			rs.getInt("Zeitgrenze"), 
	    			rs.getFloat("Mindestbetrag"))); 

	    	}
	    	rs.close();
	    	s.close();
	    }
	    catch (SQLException sqle)
	    {
	         dc.printSQLException(sqle);
	    }
	}
	
	public void saveKostenarten(){
		
		Derby_Conn dc = new Derby_Conn();
		conn = dc.start(dbName);
		Statement s;
	    ResultSet rs = null;    
	    Kostenarten.kostenartenListe = null;
	    
	    try{	
	    	s = conn.createStatement();
	    	rs = s.executeQuery("SELECT * FROM Kostenarten ORDER BY KostenartenID");
	    	while(rs.next()){
	    		Kostenarten.kostenartenListe.add(new Kostenarten(
	    			rs.getInt("KostenartenID"), 
	    			rs.getString("Name"))); 

	    	}
	    	rs.close();
	    	s.close();
	    }
	    catch (SQLException sqle)
	    {
	         dc.printSQLException(sqle);
	    }
	}
	
	public void saveDienstanschrift(){
		
		Derby_Conn dc = new Derby_Conn();
		conn = dc.start(dbName);
		Statement s;
	    ResultSet rs = null;    
	    Dienstanschrift.dienstanschriftListe = null;
	    
	    try{	
	    	s = conn.createStatement();
	    	rs = s.executeQuery("SELECT * FROM Dienstanschrift ORDER BY DienstanschriftID");
	    	while(rs.next()){
	    		Dienstanschrift.dienstanschriftListe.add(new Dienstanschrift(
	    			rs.getInt("DienstanschriftID"), 
	    			rs.getString("Organisation"), 
	    			rs.getString("Abteilung"),
	    			rs.getString("Strasse"),
	    			rs.getInt("Hausnummer"),
	    			rs.getString("Stadt"),
	    			rs.getInt("PLZ"))); 

	    	}
	    	rs.close();
	    	s.close();
	    }
	    catch (SQLException sqle)
	    {
	         dc.printSQLException(sqle);
	    }
	}
	
	public void saveDienstlicheDaten(){
		
		Derby_Conn dc = new Derby_Conn();
		conn = dc.start(dbName);
		Statement s;
	    ResultSet rs = null;    
	    DienstlicheDaten.dienstlicheDatenListe = null;
	    
	    try{	
	    	s = conn.createStatement();
	    	rs = s.executeQuery("SELECT * FROM Dienstdaten ORDER BY DienstdatenID");
	    	while(rs.next()){
	    		DienstlicheDaten.dienstlicheDatenListe.add(new DienstlicheDaten(
	    			rs.getInt("DienstdatenID"), 
	    			rs.getInt("DienstanschriftID"),
	    			rs.getLong("Kennziffer"),
	    			rs.getString("Amtsbezeichnung"),
	    			rs.getInt("Verguetungsgruppe"))); 

	    	}
	    	rs.close();
	    	s.close();
	    }
	    catch (SQLException sqle)
	    {
	         dc.printSQLException(sqle);
	    }
	}
	
	public void saveRechnungen(){
		
		Derby_Conn dc = new Derby_Conn();
		conn = dc.start(dbName);
		Statement s;
	    ResultSet rs = null;    
	    Rechnungen.rechnungenListe = null;
	    
	    try{	
	    	s = conn.createStatement();
	    	rs = s.executeQuery("SELECT * FROM Rechnungen ORDER BY RechnungenID");
	    	while(rs.next()){
	    		Rechnungen.rechnungenListe.add(new Rechnungen(
	    			rs.getInt("DienstdatenID"), 
	    			rs.getInt("DienstanschriftID"),
	    			rs.getInt("DienstdatenID"), 
	    			rs.getInt("DienstanschriftID"),
	    			rs.getInt("DienstdatenID"), 
	    			rs.getFloat("Kennziffer"),
	    			rs.getDate("Datum"))); 
	    		
	    	}
	    	rs.close();
	    	s.close();
	    }
	    catch (SQLException sqle)
	    {
	         dc.printSQLException(sqle);
	    }
	}
	
	
		
}
