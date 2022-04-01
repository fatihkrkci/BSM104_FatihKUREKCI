package week_6;

import java.util.*;
import java.io.*;

public class Sets2 {

	public static void main(String[] args) throws FileNotFoundException {
		
		Set<String> words = new HashSet<String>();
		
		words = read();
		System.out.println(words);
		
		// words.addAll(read());
		for(String word:read()) {
			words.add(word);
		}
		
		System.out.println(words);

	}
	
	public static Set<String> read() throws FileNotFoundException {
		
		System.out.println("Okumak Ýstediðiniz Dosya Ýsmi: ");
		Scanner input = new Scanner(System.in);
		
		String file = input.next();
		Scanner in = new Scanner(new File(file));
		
		Set<String> temp = new HashSet<String>();
		
		while(in.hasNext()) {
			String word = in.nextLine().toLowerCase();
			temp.add(word);
		}
		
		return temp;
		
	}

}
