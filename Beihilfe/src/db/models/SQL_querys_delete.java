package db.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SQL_querys_delete {

	public static void deleteFamilie(int familieID) {
		
		Derby_Conn dc = new Derby_Conn();
		Connection conn = dc.start(Derby_Conn.getStandardDB());
		
		try
	    {
			String query = "DELETE FROM Familie WHERE FamilieID=?";
			PreparedStatement preparedStmt = conn.prepareStatement(query);
			
			preparedStmt.setInt(1, familieID);
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
	
	public static void deleteRechnungssteller(int rechnungsstellerID) {
		
		Derby_Conn dc = new Derby_Conn();
		Connection conn = dc.start(Derby_Conn.getStandardDB());
		
		try
	    {
			String query = "DELETE FROM Rechnungssteller WHERE RechnungsstellerID=?";
			PreparedStatement preparedStmt = conn.prepareStatement(query);
			
			preparedStmt.setInt(1, rechnungsstellerID);
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
	
	public static void deleteBeihilferegelungen(int beihilferegelungenID) {
		
		Derby_Conn dc = new Derby_Conn();
		Connection conn = dc.start(Derby_Conn.getStandardDB());
		
		try
	    {
			String query = "DELETE FROM Beihilferegelungen WHERE BeihilferegelungenID=?";
			PreparedStatement preparedStmt = conn.prepareStatement(query);
			
			preparedStmt.setInt(1, beihilferegelungenID);
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
	
	public static void deleteKostenarten(int kostenartenID) {
		
		Derby_Conn dc = new Derby_Conn();
		Connection conn = dc.start(Derby_Conn.getStandardDB());
		
		try
	    {
			String query = "DELETE FROM Kostenarten WHERE KostenartenID=?";
			PreparedStatement preparedStmt = conn.prepareStatement(query);
			
			preparedStmt.setInt(1, kostenartenID);
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
	
	public static void deleteDienstanschrift(int dienstanschriftID) {
		
		Derby_Conn dc = new Derby_Conn();
		Connection conn = dc.start(Derby_Conn.getStandardDB());
		
		try
	    {
			String query = "DELETE FROM Dienstanschrift WHERE DienstanschriftID=?";
			PreparedStatement preparedStmt = conn.prepareStatement(query);
			
			preparedStmt.setInt(1, dienstanschriftID);
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
	
	public static void deleteDienstlicheDaten(int dienstlicheDatenID) {
		
		Derby_Conn dc = new Derby_Conn();
		Connection conn = dc.start(Derby_Conn.getStandardDB());
		
		try
	    {
			String query = "DELETE FROM Dienstdaten WHERE DienstdatenID=?";
			PreparedStatement preparedStmt = conn.prepareStatement(query);
			
			preparedStmt.setInt(1, dienstlicheDatenID);
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
	
	public static void deleteAntragsteller(int antragstellerID) {
		
		Derby_Conn dc = new Derby_Conn();
		Connection conn = dc.start(Derby_Conn.getStandardDB());
		
		try
	    {
			String query = "DELETE FROM Antragsteller WHERE AntragstellerID=?";
			PreparedStatement preparedStmt = conn.prepareStatement(query);
			
			preparedStmt.setInt(1, antragstellerID);
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

	public static void deleteRechnung(int rechnungID) {
		
		Derby_Conn dc = new Derby_Conn();
		Connection conn = dc.start(Derby_Conn.getStandardDB());
		
		try
	    {
			String query = "DELETE FROM Rechnungen WHERE RechnungenID=?";
			PreparedStatement preparedStmt = conn.prepareStatement(query);
			
			preparedStmt.setInt(1, rechnungID);
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
