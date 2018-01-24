package db.models;

public class Create_Data {
	

	public static void main(String[] args){
		
		bspDatenFamilie();
		bspDatenRechnungssteller();	
		bspDatenKostenarten();
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
		Kostenarten k3 = new Kostenarten("Allgenmein");
		k3.insertData();
	}
}
