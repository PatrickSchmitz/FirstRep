package db.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Save_Data {

	private static Connection conn = null;
	
	public static void saveAll(){
		
		saveFamilie();
		saveRechnungssteller();
		saveBeihilferegelungen();
		saveKostenarten();
		saveDienstanschrift();
		saveDienstlicheDaten();
		saveAntragsteller();
		saveRechnungen();
	}
	public static void saveFamilie(){
		
		Derby_Conn dc = new Derby_Conn();
		conn = dc.start(Derby_Conn.getStandardDB());
		Statement s;
	    ResultSet rs = null;    
	    Familie.familienListe.clear();;
	    
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
	    				rs.getLong("Telefon")));
	    	}
	    	conn.commit();
	    	rs.close();
	    	s.close();
	    	conn.close();
	    }
	    catch (SQLException sqle)
	    {
	         dc.printSQLException(sqle);
	    }
	}

	public static void saveRechnungssteller(){
		
		Derby_Conn dc = new Derby_Conn();
		conn = dc.start(Derby_Conn.getStandardDB());
		Statement s;
	    ResultSet rs = null;
	    Rechnungssteller.rechnungsstellerListe.clear();;
	    
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
	    	conn.commit();
	    	rs.close();
	    	s.close();
	    	conn.close();
	    }
	    catch (SQLException sqle)
	    {
	         dc.printSQLException(sqle);
	    }
	}
	
	public static void saveBeihilferegelungen(){
		
		Derby_Conn dc = new Derby_Conn();
		conn = dc.start(Derby_Conn.getStandardDB());
		Statement s;
	    ResultSet rs = null;    
	    Beihilferegelungen.beihilferegelungenListe.clear();;
	    
	    try{	
	    	s = conn.createStatement();
	    	rs = s.executeQuery("SELECT * FROM Beihilferegelungen ORDER BY BeihilferegelungenID");
	    	while(rs.next()){
	    		Beihilferegelungen.beihilferegelungenListe.add(new Beihilferegelungen(
	    			rs.getInt("RechnungsstellerID"), 
	    			rs.getInt("Zeitgrenze"), 
	    			rs.getFloat("Mindestbetrag"))); 

	    	}
	    	conn.commit();
	    	rs.close();
	    	s.close();
	    	conn.close();
	    }
	    catch (SQLException sqle)
	    {
	         dc.printSQLException(sqle);
	    }
	}
	
	public static void saveKostenarten(){
		
		Derby_Conn dc = new Derby_Conn();
		conn = dc.start(Derby_Conn.getStandardDB());
		Statement s;
	    ResultSet rs = null;    
	    Kostenarten.kostenartenListe.clear();
	    
	    try{	
	    	s = conn.createStatement();
	    	rs = s.executeQuery("SELECT * FROM Kostenarten ORDER BY KostenartenID");
	    	while(rs.next()){
	    		Kostenarten.kostenartenListe.add(new Kostenarten(
	    			rs.getInt("KostenartenID"), 
	    			rs.getString("Name"))); 
	    	}
	    	conn.commit();
	    	rs.close();
	    	s.close();
	    	conn.close();
	    }
	    catch (SQLException sqle)
	    {
	         dc.printSQLException(sqle);
	    }
	}
	
	public static void saveDienstanschrift(){
		
		Derby_Conn dc = new Derby_Conn();
		conn = dc.start(Derby_Conn.getStandardDB());
		Statement s;
	    ResultSet rs = null;    
	    Dienstanschrift.dienstanschriftListe.clear();
	    
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
	    	conn.commit();
	    	rs.close();
	    	s.close();
	    	conn.close();
	    }
	    catch (SQLException sqle)
	    {
	         dc.printSQLException(sqle);
	    }
	}
	
	public static void saveDienstlicheDaten(){
		
		Derby_Conn dc = new Derby_Conn();
		conn = dc.start(Derby_Conn.getStandardDB());
		Statement s;
	    ResultSet rs = null;    
	    DienstlicheDaten.dienstlicheDatenListe.clear();
	    
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
	    	conn.commit();
	    	rs.close();
	    	s.close();
	    	conn.close();
	    }
	    catch (SQLException sqle)
	    {
	         dc.printSQLException(sqle);
	    }
	}
	
	public static void saveAntragsteller(){
		
		Derby_Conn dc = new Derby_Conn();
		conn = dc.start(Derby_Conn.getStandardDB());
		Statement s;
	    ResultSet rs = null;    
	    Antragsteller.antragstellerListe.clear();
	    
	    try{	
	    	s = conn.createStatement();
	    	rs = s.executeQuery("SELECT * FROM Antragsteller ORDER BY AntragstellerID");
	    	while(rs.next()){
	    		Antragsteller.antragstellerListe.add(new Antragsteller(
	    			rs.getInt("AntragstellerID"), 
	    			rs.getInt("FamilieID"),
	    			rs.getInt("DienstdatenID"), 
	    			rs.getInt("BeihilferegelungenID")));

	    	}
	    	conn.commit();
	    	rs.close();
	    	s.close();
	    	conn.close();
	    }
	    catch (SQLException sqle)
	    {
	         dc.printSQLException(sqle);
	    }
	}
	
	public static void saveRechnungen(){
		
		Derby_Conn dc = new Derby_Conn();
		conn = dc.start(Derby_Conn.getStandardDB());
		Statement s;
	    ResultSet rs = null;    
	    Rechnungen.rechnungenListe.clear();
	    
	    try{	
	    	s = conn.createStatement();
	    	rs = s.executeQuery("SELECT * FROM Rechnungen ORDER BY RechnungenID");
	    	while(rs.next()){
	    		Rechnungen.rechnungenListe.add(new Rechnungen(
	    			rs.getInt("RechnungenID"), 
	    			rs.getInt("FamilieID"),
	    			rs.getInt("RechnungsstellerID"), 
	    			rs.getInt("KostenartenID"),
	    			rs.getInt("Rechnungsnummer"), 
	    			rs.getFloat("Kennziffer"),
	    			rs.getDate("Datum"))); 
	    		
	    	}
	    	conn.commit();
	    	rs.close();
	    	s.close();
	    	conn.close();
	    }
	    catch (SQLException sqle)
	    {
	         dc.printSQLException(sqle);
	    }
	}
	
	
		
}