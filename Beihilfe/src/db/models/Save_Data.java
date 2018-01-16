package db.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Save_Data {

	private String dbName = "BeihilfeDB";
	private static Connection conn = null;
	
	@SuppressWarnings("null")
	public void saveFamilie(){
		
		Derby_Conn dc = new Derby_Conn();
		conn = dc.start(dbName);
		Statement s;
	    ResultSet rs = null;    
	    Familie f = null;
	    f.familienListe = null;
	    
	    try{	
	    	s = conn.createStatement();
	    	rs = s.executeQuery("SELECT * FROM Familie ORDER BY FamilieID");
	    	while(rs.next()){
	    		f.familienListe.add(new Familie(
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
	    		
	    		f.familienListe.add(f);
	    	}
	    	rs.close();
	    	s.close();
	    }
	    catch (SQLException sqle)
	    {
	         dc.printSQLException(sqle);
	    }
	}
	
	@SuppressWarnings("null")
	public void saveRechnungssteller(){
		
		Derby_Conn dc = new Derby_Conn();
		conn = dc.start(dbName);
		Statement s;
	    ResultSet rs = null;    
	    Rechnungssteller r = null;
	    r.rechnungsstellerListe = null;
	    
	    try{	
	    	s = conn.createStatement();
	    	rs = s.executeQuery("SELECT * FROM Rechnungssteller ORDER BY RechnungsstellerID");
	    	while(rs.next()){
	    		r.rechnungsstellerListe.add(new Rechnungssteller(
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
	    		
	    		r.rechnungsstellerListe.add(r);
	    	}
	    	rs.close();
	    	s.close();
	    }
	    catch (SQLException sqle)
	    {
	         dc.printSQLException(sqle);
	    }
	}
	
	@SuppressWarnings("null")
	public void saveBeihilfereglungen(){
		
		Derby_Conn dc = new Derby_Conn();
		conn = dc.start(dbName);
		Statement s;
	    ResultSet rs = null;    
	    Beihilferegelungen b = null;
	    b.beihilferegelungenListe = null;
	    
	    try{	
	    	s = conn.createStatement();
	    	rs = s.executeQuery("SELECT * FROM Beihilferegelungen ORDER BY BeihilferegelungenID");
	    	while(rs.next()){
	    		b.beihilferegelungenListe.add(new Beihilferegelungen(
	    			rs.getInt("RechnungsstellerID"), 
	    			rs.getInt("Zeitgrenze"), 
	    			rs.getFloat("Mindestbetrag"))); 

	    		b.beihilferegelungenListe.add(b);
	    	}
	    	rs.close();
	    	s.close();
	    }
	    catch (SQLException sqle)
	    {
	         dc.printSQLException(sqle);
	    }
	}
	
	@SuppressWarnings("null")
	public void saveKostenarten(){
		
		Derby_Conn dc = new Derby_Conn();
		conn = dc.start(dbName);
		Statement s;
	    ResultSet rs = null;    
	    Kostenarten k = null;
	    k.kostenartenListe = null;
	    
	    try{	
	    	s = conn.createStatement();
	    	rs = s.executeQuery("SELECT * FROM Kostenarten ORDER BY KostenartenID");
	    	while(rs.next()){
	    		k.kostenartenListe.add(new Kostenarten(
	    			rs.getInt("KostenartenID"), 
	    			rs.getString("Name"))); 

	    		k.kostenartenListe.add(k);
	    	}
	    	rs.close();
	    	s.close();
	    }
	    catch (SQLException sqle)
	    {
	         dc.printSQLException(sqle);
	    }
	}
	
	@SuppressWarnings("null")
	public void saveDienstanschrift(){
		
		Derby_Conn dc = new Derby_Conn();
		conn = dc.start(dbName);
		Statement s;
	    ResultSet rs = null;    
	    Dienstanschrift d = null;
	    d.dienstanschriftListe = null;
	    
	    try{	
	    	s = conn.createStatement();
	    	rs = s.executeQuery("SELECT * FROM Dienstanschrift ORDER BY DienstanschriftID");
	    	while(rs.next()){
	    		d.dienstanschriftListe.add(new Dienstanschrift(
	    			rs.getInt("DienstanschriftID"), 
	    			rs.getString("Organisation"), 
	    			rs.getString("Abteilung"),
	    			rs.getString("Strasse"),
	    			rs.getInt("Hausnummer"),
	    			rs.getString("Stadt"),
	    			rs.getInt("PLZ"))); 

	    		d.dienstanschriftListe.add(d);
	    	}
	    	rs.close();
	    	s.close();
	    }
	    catch (SQLException sqle)
	    {
	         dc.printSQLException(sqle);
	    }
	}
	
	@SuppressWarnings("null")
	public void saveDienstlicheDaten(){
		
		Derby_Conn dc = new Derby_Conn();
		conn = dc.start(dbName);
		Statement s;
	    ResultSet rs = null;    
	    DienstlicheDaten d = null;
	    d.dienstlicheDatenListe = null;
	    
	    try{	
	    	s = conn.createStatement();
	    	rs = s.executeQuery("SELECT * FROM Dienstdaten ORDER BY DienstdatenID");
	    	while(rs.next()){
	    		d.dienstlicheDatenListe.add(new DienstlicheDaten(
	    			rs.getInt("DienstdatenID"), 
	    			rs.getInt("DienstanschriftID"),
	    			rs.getLong("Kennziffer"),
	    			rs.getString("Amtsbezeichnung"),
	    			rs.getInt("Verguetungsgruppe"))); 

	    		d.dienstlicheDatenListe.add(d);
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
