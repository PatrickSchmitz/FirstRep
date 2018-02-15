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
			String query = "UPDATE Rechnungen SET AV=? WHERE RechnungenID=?";
			PreparedStatement preparedStmt = conn.prepareStatement(query);
			
			preparedStmt.setBoolean(1, true);
			preparedStmt.setInt(2, rechnungID);
			preparedStmt.executeUpdate();
			
			conn.commit();
			preparedStmt.close();
			conn.close();
	    }
	    catch (SQLException sqle)
	    {
	      dc.printSQLException(sqle);
	    }
	}
	
	public static void AV_False(int rechnungID) {
		
		Derby_Conn dc = new Derby_Conn();
		Connection conn = dc.start(Derby_Conn.getStandardDB());
		
		try
	    {
			String query = "UPDATE Rechnungen SET AV=? WHERE RechnungenID=?";
			PreparedStatement preparedStmt = conn.prepareStatement(query);
			
			preparedStmt.setBoolean(1, false);
			preparedStmt.setInt(2, rechnungID);
			preparedStmt.executeUpdate();
			
			conn.commit();
			preparedStmt.close();
			conn.close();
	    }
	    catch (SQLException sqle)
	    {
	      dc.printSQLException(sqle);
	    }
	}
	
	public static void AB_True(int rechnungID) {
		
		Derby_Conn dc = new Derby_Conn();
		Connection conn = dc.start(Derby_Conn.getStandardDB());
		
		try
	    {
			String query = "UPDATE Rechnungen SET AB=? WHERE RechnungenID=?";
			PreparedStatement preparedStmt = conn.prepareStatement(query);
			
			preparedStmt.setBoolean(1, true);
			preparedStmt.setInt(2, rechnungID);
			preparedStmt.executeUpdate();
			
			conn.commit();
			preparedStmt.close();
			conn.close();
	    }
	    catch (SQLException sqle)
	    {
	      dc.printSQLException(sqle);
	    }
	}
	
	public static void AB_False(int rechnungID) {
		
		Derby_Conn dc = new Derby_Conn();
		Connection conn = dc.start(Derby_Conn.getStandardDB());
		
		try
	    {
			String query = "UPDATE Rechnungen SET AB=? WHERE RechnungenID=?";
			PreparedStatement preparedStmt = conn.prepareStatement(query);
			
			preparedStmt.setBoolean(1, false);
			preparedStmt.setInt(2, rechnungID);
			preparedStmt.executeUpdate();
			
			conn.commit();
			preparedStmt.close();
			conn.close();
	    }
	    catch (SQLException sqle)
	    {
	      dc.printSQLException(sqle);
	    }
	}
	
	public static void VV_True(int rechnungID) {
		
		Derby_Conn dc = new Derby_Conn();
		Connection conn = dc.start(Derby_Conn.getStandardDB());
		
		try
	    {
			String query = "UPDATE Rechnungen SET VV=? WHERE RechnungenID=?";
			PreparedStatement preparedStmt = conn.prepareStatement(query);
			
			preparedStmt.setBoolean(1, true);
			preparedStmt.setInt(2, rechnungID);
			preparedStmt.executeUpdate();
			
			conn.commit();
			preparedStmt.close();
			conn.close();
	    }
	    catch (SQLException sqle)
	    {
	      dc.printSQLException(sqle);
	    }
	}
	
	public static void VV_False(int rechnungID) {
		
		Derby_Conn dc = new Derby_Conn();
		Connection conn = dc.start(Derby_Conn.getStandardDB());
		
		try
	    {
			String query = "UPDATE Rechnungen SET VV=? WHERE RechnungenID=?";
			PreparedStatement preparedStmt = conn.prepareStatement(query);
			
			preparedStmt.setBoolean(1, false);
			preparedStmt.setInt(2, rechnungID);
			preparedStmt.executeUpdate();
			
			conn.commit();
			preparedStmt.close();
			conn.close();
	    }
	    catch (SQLException sqle)
	    {
	      dc.printSQLException(sqle);
	    }
	}
	
	public static void VB_True(int rechnungID) {
		
		Derby_Conn dc = new Derby_Conn();
		Connection conn = dc.start(Derby_Conn.getStandardDB());
		
		try
	    {
			String query = "UPDATE Rechnungen SET VB=? WHERE RechnungenID=?";
			PreparedStatement preparedStmt = conn.prepareStatement(query);
			
			preparedStmt.setBoolean(1, true);
			preparedStmt.setInt(2, rechnungID);
			preparedStmt.executeUpdate();
			
			conn.commit();
			preparedStmt.close();
			conn.close();
	    }
	    catch (SQLException sqle)
	    {
	      dc.printSQLException(sqle);
	    }
	}
	
	public static void VB_False(int rechnungID) {
		
		Derby_Conn dc = new Derby_Conn();
		Connection conn = dc.start(Derby_Conn.getStandardDB());
		
		try
	    {
			String query = "UPDATE Rechnungen SET VB=? WHERE RechnungenID=?";
			PreparedStatement preparedStmt = conn.prepareStatement(query);
			
			preparedStmt.setBoolean(1, false);
			preparedStmt.setInt(2, rechnungID);
			preparedStmt.executeUpdate();
			
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
