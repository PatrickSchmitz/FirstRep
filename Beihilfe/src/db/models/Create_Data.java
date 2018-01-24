package db.models;

public class Create_Data {
	

	public static void main(String[] args){
		
		bspDatenFamilie();
		System.out.println(Long.MAX_VALUE);
		
	}
	
	public static void bspDatenFamilie() {
		
		Familie f1 = new Familie("Mayer", "Hanz", "Antragsteller", 0.8f, "Neustr", 1, "Bocholt", 46397, 12345678910L);
		f1.insertData();
		Familie f2 = new Familie("Mayer", "Anna", "Frau", 0.8f, "Neustr", 1, "Bocholt", 46397, 12345678910L);
		f2.insertData();
		Familie f3 = new Familie("Mayer", "Lisa", "Kind", 0.8f, "Neustr", 1, "Bocholt", 46397, 12345678910L);
		f3.insertData();
	}
}
