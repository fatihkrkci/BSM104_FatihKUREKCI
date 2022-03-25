package week_5;

import java.util.*;

public class SortExample {

	public static void main(String[] args) {
		
		ArrayList<String> words = new ArrayList<String>();
		
		words.add("Kalem");
		words.add("Bilgisayar");
		words.add("Bartin");
		words.add("Kitap");
		
		System.out.println("Siralanmadan Once: " + words);
		System.out.println(words.get(0));
		
		// A'dan Z'ye siralama
		Collections.sort(words);
		System.out.println("Siralandiktan Sonra: " + words);
		
		// Rastgele Sýralama
		Collections.shuffle(words);
		System.out.println("After Shuffle: " + words);

	}

}
