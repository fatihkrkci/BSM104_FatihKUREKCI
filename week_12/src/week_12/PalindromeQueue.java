package week_12;

import java.util.*;

public class PalindromeQueue {

	public static void main(String[] args) {

		System.out.println("Lutfen Bir String Giriniz: ");
		Scanner in = new Scanner(System.in);
		String inputString = in.nextLine();
		
		Queue queue = new LinkedList();
		
		for (int index=inputString.length()-1; index >= 0; index--) {
			queue.add(inputString.charAt(index));
		}
		
		String reverseString = "";
		while(!queue.isEmpty()) {
			reverseString = reverseString + queue.remove();
		}
		
		if(inputString.equals(reverseString)) {
			System.out.println("Girilen String Palidromdur!");
		}
		else {
			System.out.println("Girilen String Palindrom Deðildir!");
		}

	}

}
