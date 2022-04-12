package week_7;

import java.util.*;

public class StackExample {

	public static void main(String[] args) {

		String data[] = {"Java", "PHP", "Python", "C", "C++"};
		
		Stack<String> s = new Stack<String>();
		
		for(String word:data) {
			s.push(word);
		}
		
		System.out.println("Stack: " + s);
		System.out.println("Peek: " + s.peek());
		System.out.println("Pop: " + s.pop());
		System.out.println("Stack: " + s);
		System.out.println("Stack's Size: " + s.size());

	}

}
