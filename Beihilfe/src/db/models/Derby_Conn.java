package db.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Derby_Conn {

	private static String framework = "embedded";
	private static String protocol = "jdbc:derby:";
	private static Connection conn = null;
	
	public static void start(String dbName){
		try
		{
			conn = DriverManager.getConnection(protocol + dbName);
			/**Da Transaktionen manuell kontrolliert werden sollen, wird
			 * AutoCommit deaktiviert. AutoCommit ist bei JDBC standartmäßig aktiviert.*/
			conn.setAutoCommit(false);
		}
		catch (SQLException sqle)
		{
	         printSQLException(sqle);
	    }	     
	}
	
	public static void create(String dbName){
		try
		{
			conn = DriverManager.getConnection(protocol + dbName + ";create=true");
		}
		catch (SQLException sqle)
	    {
	         printSQLException(sqle);
	    }
	}
		
	public static void close(){
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
                    if (conn != null) {
                        conn.close();
                        conn = null;
                    }
                } catch (SQLException sqle) {
                    printSQLException(sqle);
                }
            }
        }
	}
	
	public static void printSQLException(SQLException e)
	 {
	     /** Fehler und deren gründe werden angezeigt.*/
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
}
