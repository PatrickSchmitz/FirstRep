package db.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
		Connection conn = dc.start(Derby_Conn.getStandardDB());
		
		try
	    {			
			String query = " INSERT INTO Beihilferegelungen (Zeitgrenze, Mindestbetrag) values (?, ?)";
			PreparedStatement preparedStmt = conn.prepareStatement(query);	

			preparedStmt.setString (1, " ");
			preparedStmt.setString (2, " ");
		      
			preparedStmt.execute();
			
			preparedStmt.close();
	    }
		catch (SQLException sqle)
	    {
	      dc.printSQLException(sqle);
	    }
		
	}
}
