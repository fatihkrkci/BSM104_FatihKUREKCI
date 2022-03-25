package week_5;

import java.util.ArrayList;

public class KisiMain {

	public static void main(String[] args) {
		
		ArrayList<Kisi> bireyler = new ArrayList<>();
		
		bireyler.add(new Kisi("Ahmet", 24));
		bireyler.add(new Kisi("Kaya", 30));
		bireyler.add(new Kisi("Hayri", 40));
		
		// ***** Advanced *****
		bireyler.forEach(birey -> {
			System.out.println("Isim: " + birey.getIsim() + "	Yas: " + birey.getYas());
		});
		
		System.out.println();
		
		// ***** Basic *****
		for(Kisi birey:bireyler) {
			System.out.println("Isim: " + birey.getIsim() + "	Yas: " + birey.getYas());
		}

	}

}
