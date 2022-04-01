package week_6;

import java.util.*;

public class Maps {

	public static void main(String[] args) {
		
		Map<Integer, String> cities = new TreeMap<Integer, String>();
		
		cities.put(34, "Istanbul");
		cities.put(06, "Ankara");
		cities.put(35, "Izmir");
		cities.put(55, "Samsun");
		
		System.out.println(cities);
		System.out.println("Keys = " + cities.keySet());
		System.out.println("Cities = " + cities.values());
		
		Map <Integer, Set<String>> cities2 = new HashMap<Integer, Set<String>>();
		
		cities2.put(34, new TreeSet<String>());
		cities2.get(34).add("Istanbul");
		cities2.get(34).add("Besiktas");
		cities2.get(34).add("Eminonu");
		
		cities2.put(6, new TreeSet<String>());
		cities2.get(6).add("Ankara");
		cities2.get(6).add("Cankaya");
		
		System.out.println(cities2);
		

	}

}
