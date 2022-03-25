package week_5;

import java.util.*;

public class StarAdd {

	public static void main(String[] args) {
		
		ArrayList<String> words = new ArrayList<String>();
		
		words.add("Kalem");
		words.add("Bilgisayar");
		words.add("Bartin");
		words.add("Kitap");

		System.out.println("Dongu Oncesi: " + words);
		System.out.println("Dongu Oncesi Liste Uzunlugu: " + words.size());
		for(int index = 0; index < words.size(); index += 2) {
			words.add(index, "*");
		}
		System.out.println("Dongu Sonrasi: " + words);
		System.out.println("Dongu Sonrasi Liste Uzunlugu: " + words.size());
		
		// ***** Artan Yönde Silme *****
		//for(int index = 0; index < words.size(); index++) {
		//	words.remove(index);
		//}
		
		// ***** Azalan Yönde Silme *****
		for(int index = words.size()-2; index >=0 ; index -= 2) {
			words.remove(index);
		}
		System.out.println("Silme Sonrasi: " + words);
		System.out.println("Silme Sonrasi Liste Uzunlugu: " + words.size());
	}

}
