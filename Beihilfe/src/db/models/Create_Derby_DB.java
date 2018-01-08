package db.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Create_Derby_DB {
	
	private String dbName = "BeihilfeDB";
	private static Connection conn = null;
	
	public static void main(String[] args){
		
	     new Create_Derby_DB().go(args);
	     
	     
	}
	
	void go(String[] args){
		
		Derby_Conn dc = new Derby_Conn();
//		dc.create(dbName);
//		System.out.println("BeihilfeDB erstellt.");
//		dc.delete(dbName);
//		System.out.println("Alle tabellen der BeihilfeDB geloescht.");
		
		conn = dc.start(dbName);
	    
	    System.out.println("Datenbank " + dbName + " erstellt und gestartet");
	    
		ArrayList<Statement> statements = new ArrayList<Statement>(); // list of Statements, PreparedStatements
	    PreparedStatement psInsert;
	    PreparedStatement psUpdate;
	    Statement s;
	    ResultSet rs = null;    
	    SQL_querys sql = new SQL_querys();
	    
	    try
	    {	
	    	s = conn.createStatement();
	    	statements.add(s);
	    		
	    	s.execute(sql.getCreateFamilie());
	    	System.out.println("Tabelle Familie erstellt");
	    	
	    	s.execute(sql.getCreateRechnungssteller());         
	    	System.out.println("Tabelle Rechnungssteller erstellt");
	    	
	    	s.execute(sql.getCreateBeihilferegelungen());
	    	System.out.println("Tabelle Beihilferegelungen erstellt");
	    	
	    	s.execute(sql.getCreateKostenarten());
	    	System.out.println("Tabelle Kostenarten erstellt");
	    	
	    	s.execute(sql.getCreateDienstanschrift());
	    	System.out.println("Tabelle Dienstanschritft erstellt");
	    	
	    	s.execute(sql.getCreateDienstdaten());
	    	System.out.println("Tabelle Dienstdaten erstellt");
	    	
	    	s.execute(sql.getCreateAntragsteller());
	    	System.out.println("Tabelle Antragsteller erstellt");
	    	
		    s.execute(sql.getCreateRechnungen());
		    System.out.println("Tabelle Rechnungen erstellt");
         
		    conn.close();
	    }
	    catch (SQLException sqle)
	    {
	         dc.printSQLException(sqle);
	    }   
	    
	    
	}
}
