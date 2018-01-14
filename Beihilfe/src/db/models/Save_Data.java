package db.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Save_Data {

	
	private String dbName = "BeihilfeDB";
	private static Connection conn = null;
	
	public static void main(String[] args){
		
	     new Create_Derby_DB().go(args);   
	}
	
	void go(String[] args){
		
		Derby_Conn dc = new Derby_Conn();
		
		conn = dc.start(dbName);
	    
	    System.out.println("Datenbank " + dbName + " erstellt und gestartet");
	    
		ArrayList<Statement> statements = new ArrayList<Statement>(); // list of Statements, PreparedStatements
	    PreparedStatement psInsert;
	    PreparedStatement psUpdate;
	    Statement s;
	    ResultSet rs = null;    
	    SQL_querys_create sql = new SQL_querys_create();
	    
	    try
	    {	
	    	s = conn.createStatement();
	    	statements.add(s);
	    		
	    	s.execute(sql.getCreateFamilie());
	    	System.out.println("Tabelle Familie erstellt");

         
		    conn.close();
	    }
	    catch (SQLException sqle)
	    {
	         dc.printSQLException(sqle);
	    }   
	    
	    
	}
}
