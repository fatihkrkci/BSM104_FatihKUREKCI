package week_7;

import java.util.*;

public class ParenthesisMatching {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Kontrol Etmek Istediginiz Ifadeyi Girin: ");
		
		String exp = input.next();
		if(isMatching(exp)) {
			System.out.println("Girilen Ýfade Dengeli!");
		}
		else {
			System.out.println("Girilen Ýfade Dengeli Deðil!");
		}

	}

	public static boolean isMatching(String exp) {
		
		Stack<Character> s = new Stack<Character>();
		
		for(int i=0; i<exp.length(); i++) {
			
			if(exp.charAt(i) == '(') {
				s.push(exp.charAt(i));
			}
			
			else if(exp.charAt(i) == ')'){
				if(!s.empty()) {
					s.pop();
				}
				else {
					return false;
				}
			}
		}
		
		return (s.isEmpty());
		
	}
	
}
