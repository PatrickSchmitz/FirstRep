package db.models;

/**Erstellt oder Löscht die Datenbank. 
 * Wird lediglich zum testen benötigt.*/
public class Create_Derby_DB {
	
	public static void main(String[] args){
		
	     new Create_Derby_DB().go(args);   
	}
	
	void go(String[] args){
		
		Derby_Conn dc = new Derby_Conn();
	//	ceateDB(dc);
		deleteDB(dc);
	}
	
	void ceateDB(Derby_Conn dc){
		dc.create(Derby_Conn.getStandardDB());
		System.out.println(Derby_Conn.getStandardDB() + " erstellt.");
	}
	
	void deleteDB(Derby_Conn dc){
		dc.delete(Derby_Conn.getStandardDB());
		System.out.println("Alle tabellen der " + Derby_Conn.getStandardDB() + " geloescht.");
	}
}
