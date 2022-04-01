package week_6;

import java.util.*;

public class Sets {

	public static void main(String[] args) {
		
		ArrayList<String> lists = new ArrayList<String>();
		
		lists.add("Kalem");
		lists.add("Masa");
		lists.add("Bilgisayar");
		lists.add("Defter");
		lists.add(3, "Dolap");
		lists.add("Kalem");
		lists.add("Masa");
		
//		System.out.println(lists);
//		System.out.println(lists.size());
//		lists.get(0);
		
		// treeSet -> sıralı çıktı verir, hashSet -> random çıktı verir
		Set<String> sets = new TreeSet<String>();
		
		sets.add("Kalem");
		sets.add("Masa");
		sets.add("Bilgisayar");
		sets.add("Defter");
		sets.add("Kalem");
		sets.add("Masa");
		
		System.out.println(sets);
		System.out.println(sets.size());
		System.out.println(sets.contains("Dolap"));
		
		sets.clear();
		System.out.println(sets);
		
		sets.addAll(lists);
		System.out.println(sets);
		
		System.out.println(lists.get(2));

	}

}
