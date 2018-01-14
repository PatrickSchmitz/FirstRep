package db.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Derby_Conn {

	private static String framework = "embedded";
	private static String protocol = "jdbc:derby:";
	private static Connection conn = null;
	private static String standardDB = "BeihilfeDB";
	
	public Connection start(String dbName){
		try
		{
			conn = DriverManager.getConnection(protocol + dbName);
			/**Da Transaktionen manuell kontrolliert werden sollen, wird
			 * AutoCommit deaktiviert. AutoCommit ist bei JDBC standartmäßig aktiviert.*/
			conn.setAutoCommit(false);
			
			return conn;
		}
		catch (SQLException sqle)
		{
	         printSQLException(sqle);
	    }	  
		
		return conn;
	}
	
	public void close(Connection closeConn){
		if (framework.equals("embedded"))
        {
            try
            {
                /** shutdown=true schaltet die Derby Datenbank aus*/
                DriverManager.getConnection("jdbc:derby:;shutdown=true");
                
                //Zum Abschalten einer bestimmten Datenbank
                //DriverManager.getConnection("jdbc:derby:" + dbName + ";shutdown=true");
            }
            catch (SQLException se)
            {
                if (( (se.getErrorCode() == 50000)
                        && ("XJ015".equals(se.getSQLState()) ))) {
                    /** Bei dem erwarteten ErrorCode ist alles normal verlaufen.*/
                    System.out.println("Derby shut down normally");
                    // Beim Abschalten einer einzelnen DB
                    // SQL state = "08006" und error code = 45000.
                } else {
                    /** Wenn ErrorCode und SQLState nicht den erwarteten Werten entspricht */
                    System.err.println("Beim ausschalten der Derby DB ist etwas schiefgelaufen.");
                    printSQLException(se);
                }
            }finally
            {
            	try {
                    if (closeConn != null) {
                    	closeConn.close();
                    	closeConn = null;
                    }
                } catch (SQLException sqle) {
                    printSQLException(sqle);
                }
            }
        }
	}
	
	public void create(String dbName){
		try
		{
			conn = DriverManager.getConnection(protocol + dbName + ";create=true");
			System.out.println("Datenbank"+ dbName +" erstellt.");
			
			SQL_querys_create sql = new SQL_querys_create();
			ArrayList<Statement> statements = new ArrayList<Statement>(); // list of Statements, PreparedStatements
		    Statement s;
		    			
			s = conn.createStatement();
	    	statements.add(s);
	    		
	    	s.execute(sql.getCreateFamilie());
	    	System.out.println("Tabelle Familie erstellt!");
	    	
	    	s.execute(sql.getCreateRechnungssteller());         
	    	System.out.println("Tabelle Rechnungssteller erstellt!");
	    	
	    	s.execute(sql.getCreateBeihilferegelungen());
	    	System.out.println("Tabelle Beihilferegelungen erstellt!");
	    	
	    	s.execute(sql.getCreateKostenarten());
	    	System.out.println("Tabelle Kostenarten erstellt!");
	    	
	    	s.execute(sql.getCreateDienstanschrift());
	    	System.out.println("Tabelle Dienstanschritft erstellt!");
	    	
	    	s.execute(sql.getCreateDienstdaten());
	    	System.out.println("Tabelle Dienstdaten erstellt!");
	    	
	    	s.execute(sql.getCreateAntragsteller());
	    	System.out.println("Tabelle Antragsteller erstellt!");
	    	
		    s.execute(sql.getCreateRechnungen());
		    System.out.println("Tabelle Rechnungen erstellt!");
		    
		    conn.commit();
//		    close(conn);
		}
		catch (SQLException sqle)
	    {
	         printSQLException(sqle);
	    }
	}
	
	public void delete(String dbName){
		try
		{
			Connection deleteConn = start(dbName);
			ArrayList<Statement> statements = new ArrayList<Statement>();
		    Statement s;
			s = deleteConn.createStatement();
	    	statements.add(s);
	    		
	    	s.execute("DROP TABLE Rechnungen");
	    	System.out.println("Tabelle Rechnungen geloescht!");
	    	
	    	s.execute("DROP TABLE Antragsteller");
	    	System.out.println("Tabelle Antragsteller geloescht!");
	    	
	    	s.execute("DROP TABLE Familie");
	    	System.out.println("Tabelle Familie geloescht!");
	    	
	    	s.execute("DROP TABLE Rechnungssteller");
	    	System.out.println("Tabelle Rechnungssteller geloescht!");
	    	
	    	s.execute("DROP TABLE Beihilferegelungen");
	    	System.out.println("Tabelle Beihilferegelungen geloescht!");
	    	
	    	s.execute("DROP TABLE Kostenarten");
	    	System.out.println("Tabelle Kostenarten geloescht!");
	    	
	    	s.execute("DROP TABLE Dienstdaten");
	    	System.out.println("Tabelle Dienstdaten geloescht!");
	    	
	    	s.execute("DROP TABLE Dienstanschrift");
	    	System.out.println("Tabelle Dienstanschrift geloescht!");
	    	
	    	deleteConn.commit();
//	    	close(deleteConn);

		}
		catch (SQLException sqle)
	    {
	         printSQLException(sqle);
	    }
	}
	
	public void printSQLException(SQLException e)
	 {
	     /** Fehler und deren Gründe werden angezeigt.*/
	     while (e != null)
	     {
	         System.err.println("\n----- SQLException -----");
	         System.err.println("  SQL State:  " + e.getSQLState());
	         System.err.println("  Error Code: " + e.getErrorCode());
	         System.err.println("  Message:    " + e.getMessage());
	         // Informationen zu den Fehlercodes derby.log  oder das unkommentieren
	         //e.printStackTrace(System.err);
	         e = e.getNextException();
	     }
	 }

	public static String getStandardDB() {
		return standardDB;
	}

	public static void setStandardDB(String standardDB) {
		Derby_Conn.standardDB = standardDB;
	}
	
	
}
