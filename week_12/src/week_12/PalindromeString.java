package week_12;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {

		System.out.println("Lutfen Bir String Giriniz: ");
		Scanner in = new Scanner(System.in);
		String inputString = in.nextLine();
		
		String reverseString = "";
		
		int length = inputString.length();
		
		for(int index=length-1; index >= 0; index--) {
			reverseString = reverseString + inputString.charAt(index);
		}
		
		if(inputString.equals(reverseString)) {
			System.out.println("Girilen String Palidromdur!");
		}
		else {
			System.out.println("Girilen String Palindrom Deðildir!");
		}
		
	}

}
