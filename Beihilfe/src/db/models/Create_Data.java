package db.models;

/**Die Klasse Create_Data erstellt Beispieldaten f�r jede einzelne Tabelle der Dtaenbank*/
public class Create_Data {

	public static void main(String[] args){
		
/**		bspDatenFamilie();
		bspDatenRechnungssteller();	
		bspDatenKostenarten();
		
		Save_Data.saveFamilie();
		Save_Data.saveRechnungssteller();
		Save_Data.saveKostenarten();
		
		System.out.println(Familie.familienListe.toString());
		System.out.println(Rechnungssteller.rechnungsstellerListe.toString());
		System.out.println(Kostenarten.kostenartenListe.toString());
		**/
		bspDatenRechnungen();
		
		Save_Data.saveRechnungen();
		
		System.out.println(Rechnungen.rechnungenListe.toString());
		
	}
	
	public static void bspDaten() {
		
		bspDatenFamilie();
		bspDatenRechnungssteller();
		bspDatenKostenarten();
		bspDatenBeihilferegelungen();
		bspDatenDienstanschrift();
		bspDatenDienstlicheDaten();
		bspDatenAntragsteller();
		bspDatenRechnungen();
	}
	
	public static void bspDatenFamilie() {
		
		Familie f1 = new Familie("Mayer", "Hanz", "Antragsteller", 0.8f, "Neustr", 1, "Bocholt", 46397, 12345678910L);
		f1.insertData();
		Familie f2 = new Familie("Mayer", "Anna", "Frau", 0.8f, "Neustr", 1, "Bocholt", 46397, 12345678910L);
		f2.insertData();
		Familie f3 = new Familie("Mayer", "Lisa", "Kind", 0.8f, "Neustr", 1, "Bocholt", 46397, 12345678910L);
		f3.insertData();
	}
	
	public static void bspDatenRechnungssteller() {
		
		Rechnungssteller r1 = new Rechnungssteller("ZahnDoc", "Peter", "Doktor","Einsstr", 1, "Bocholt", 46397, 12345678910L, 10987654321L, "Bank1", "Peter ZahnDoc", 2, 2.8f);
		r1.insertData();
		Rechnungssteller r2 = new Rechnungssteller("HNODoc", "Linda", "Doktor", "Zweistr", 1, "Bocholt", 46397, 12345678910L, 10987654321L, "Bank2", "Linda HNODoc", 3, 12.8f);
		r2.insertData();
		Rechnungssteller r3 = new Rechnungssteller("AllgenmeinDoc", "Franz", "Doktor", "Dreistr", 1, "Bocholt", 46397,  12345678910L, 10987654321L, "Bank3", "Franz AllgenmeinDoc", 5, 22.8f);
		r3.insertData();
	}
	
	public static void bspDatenKostenarten() {
		
		Kostenarten k1 = new Kostenarten("Behandlung");
		k1.insertData();
		Kostenarten k2 = new Kostenarten("Medikament");
		k2.insertData();
		Kostenarten k3 = new Kostenarten("Hilfsmittel");
		k3.insertData();
	}
	
	public static void bspDatenBeihilferegelungen() {
		
		Beihilferegelungen k1 = new Beihilferegelungen(123, 15.87f);
		k1.insertData();
		Beihilferegelungen k2 = new Beihilferegelungen(321, 20.7f);
		k2.insertData();
		Beihilferegelungen k3 = new Beihilferegelungen(213, 9.05f);
		k3.insertData();
	}
	
	public static void bspDatenDienstanschrift() {
		
		Dienstanschrift k1 = new Dienstanschrift("Hochschule", "Wirtschft", "Neustr", 52, "Bocholt", 121234);
		k1.insertData();
		Dienstanschrift k2 = new Dienstanschrift("Universit�t", "Technik", "Altstr", 45, "Rhede", 121234);
		k2.insertData();
		Dienstanschrift k3 = new Dienstanschrift("Stadt", "Geb�udemanagement", "Gutstr", 102, "Wesel", 121234);
		k3.insertData();
	}
	
	public static void bspDatenDienstlicheDaten() {
		
		Save_Data.saveDienstanschrift();
		DienstlicheDaten k1 = new DienstlicheDaten(Dienstanschrift.dienstanschriftListe.get(0).getDienstanschriftID(), 123412341234L, "Professor", 1);
		k1.insertData();
		DienstlicheDaten k2 = new DienstlicheDaten(Dienstanschrift.dienstanschriftListe.get(1).getDienstanschriftID(), 432142314321L, "Professor", 2);
		k2.insertData();
		DienstlicheDaten k3 = new DienstlicheDaten(Dienstanschrift.dienstanschriftListe.get(2).getDienstanschriftID(), 987697869876L, "Angesteller", 3);
		k3.insertData();
	}
	
	public static void bspDatenAntragsteller() {
		
		Save_Data.saveFamilie();
		Save_Data.saveDienstlicheDaten();
		Save_Data.saveBeihilferegelungen();
		
		Antragsteller k1 = new Antragsteller(Familie.familienListe.get(0).getFamilienID(), 
				DienstlicheDaten.dienstlicheDatenListe.get(0).getDienstlicheDatenID(),
				Beihilferegelungen.beihilferegelungenListe.get(0).getBeihilferegelungenID());
		k1.insertData();
		
		Antragsteller k2 = new Antragsteller(Familie.familienListe.get(0).getFamilienID(), 
				DienstlicheDaten.dienstlicheDatenListe.get(1).getDienstlicheDatenID(),
				Beihilferegelungen.beihilferegelungenListe.get(1).getBeihilferegelungenID());
		k2.insertData();
		
		Antragsteller k3 = new Antragsteller(Familie.familienListe.get(0).getFamilienID(), 
				DienstlicheDaten.dienstlicheDatenListe.get(2).getDienstlicheDatenID(),
				Beihilferegelungen.beihilferegelungenListe.get(2).getBeihilferegelungenID());
		k3.insertData();
	}
	
	public static void bspDatenRechnungen() {
		
		Save_Data.saveFamilie();
		Save_Data.saveRechnungssteller();
		Save_Data.saveKostenarten();
		
		Rechnungen k1 = new Rechnungen(Familie.familienListe.get(0).getFamilienID(), 
				Rechnungssteller.rechnungsstellerListe.get(0).getRechnungsstellerID(),
				Kostenarten.kostenartenListe.get(0).getKostenartenID(),
				93782456, 20.45f, datum(), false, false, false, false);
		k1.insertData();
		
		Rechnungen k2 = new Rechnungen(Familie.familienListe.get(0).getFamilienID(), 
				Rechnungssteller.rechnungsstellerListe.get(1).getRechnungsstellerID(),
				Kostenarten.kostenartenListe.get(0).getKostenartenID(),
				23478991, 41.2f, datum(), false, false, false, false);
		k2.insertData();;
		
		Rechnungen k3 = new Rechnungen(Familie.familienListe.get(1).getFamilienID(), 
				Rechnungssteller.rechnungsstellerListe.get(2).getRechnungsstellerID(),
				Kostenarten.kostenartenListe.get(2).getKostenartenID(),
				34753875, 15.2f, datum(), false, false, false, false);
		k3.insertData();
		
		Rechnungen k4 = new Rechnungen(Familie.familienListe.get(2).getFamilienID(), 
				Rechnungssteller.rechnungsstellerListe.get(1).getRechnungsstellerID(),
				Kostenarten.kostenartenListe.get(1).getKostenartenID(),
				92387658, 31.2f, datum(), false, false, false, false);
		k4.insertData();
		
		Rechnungen k5 = new Rechnungen(Familie.familienListe.get(2).getFamilienID(), 
				Rechnungssteller.rechnungsstellerListe.get(2).getRechnungsstellerID(),
				Kostenarten.kostenartenListe.get(1).getKostenartenID(),
				23672683, 76.98f, datum(), false, false, false, false);
		k5.insertData();
	}
	
	/**Diese Methode gibt ein zuf�lliges Datum im Jahr 2017 zurueck.*/
	@SuppressWarnings("deprecation")
	public static java.sql.Date datum(){
		java.sql.Date date = new java.sql.Date(117, (int)(Math.random() * 12), (int)(Math.random() * 32));
		return date;
	}
}
