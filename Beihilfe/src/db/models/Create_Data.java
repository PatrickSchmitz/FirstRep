package db.models;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Create_Data {
	
	private String dbName = "BeihilfeDB";
	private static Connection conn = null;

	public static void main(String[] args){
		
	     new Create_Derby_DB().go(args);   
	}
	
	void go(String[] args){
		
		Derby_Conn dc = new Derby_Conn();
		conn = dc.start(dbName);
//		PreparedStatement psInsert;
		Statement s;
	    
	    try{	
	    	s = conn.createStatement();
	    	
	    	// Auf AUTO Increment der ID's aufpassen !!!
	    	s.executeUpdate("insert into Familie (Nachname, Vorname, Familienposition, Beihilfeprozentsatz, Strasse, Hausnummer, Stadt, PLZ, Telefon)"
	    			+ " values ('Nachname', 'Vorname', 'Familienposition', 0.8, 'Strasse', 19, 'Stadt', 46399, '02871')");
	       
//	         psInsert = conn.prepareStatement("insert into Familie values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
//
//	         psInsert.setInt(1, 1);
//	         psInsert.setString(2, "Nachname");
//	         psInsert.setString(3, "Vorname");
//	         psInsert.setString(4, "Familienposition");
//	         psInsert.setFloat(5, 0.8f);
//	         psInsert.setString(6, "Strasse");
//	         psInsert.setInt(7, 19);
//	         psInsert.setString(8, "Stadt");
//	         psInsert.setInt(9, 46399);
//	         psInsert.setDouble(10, 02871d);
//	         
//	         psInsert.executeUpdate();
//	         System.out.println("Inserted Familie");
	    	
	    	
	    	s.close();
	    }
	    catch (SQLException sqle)
	    {
	         dc.printSQLException(sqle);
	    }
		
	}
}
