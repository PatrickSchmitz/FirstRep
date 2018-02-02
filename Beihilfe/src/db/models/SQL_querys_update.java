package db.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SQL_querys_update {

	public static void AV_True(int rechnungID) {
		
		Derby_Conn dc = new Derby_Conn();
		Connection conn = dc.start(Derby_Conn.getStandardDB());
		
		try
	    {
			String query = "UPDATE Rechnungen SET AV=true WHERE RechnungenID=" + rechnungID;
			PreparedStatement preparedStmt = conn.prepareStatement(query);
			
			conn.commit();
			preparedStmt.close();
			conn.close();
	    }
	    catch (SQLException sqle)
	    {
	      dc.printSQLException(sqle);
	    }
	}
	 
}
