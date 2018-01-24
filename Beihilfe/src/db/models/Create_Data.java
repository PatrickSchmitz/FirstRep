package db.models;

public class Create_Data {
	

	public static void main(String[] args){
		
		bspDatenFamilie();
		bspDatenRechnungssteller();		
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
		
//		Rechnungssteller f1 = new Rechnungssteller("Mayer", "Hanz", "Antragsteller", 0.8f, "Neustr", 1, "Bocholt", 46397, 12345678910L);
//		f1.insertData();
//		Rechnungssteller f2 = new Rechnungssteller("Mayer", "Anna", "Frau", 0.8f, "Neustr", 1, "Bocholt", 46397, 12345678910L);
//		f2.insertData();
//		Rechnungssteller f3 = new Rechnungssteller("Mayer", "Lisa", "Kind", 0.8f, "Neustr", 1, "Bocholt", 46397, 12345678910L);
//		f3.insertData();
	}
}
