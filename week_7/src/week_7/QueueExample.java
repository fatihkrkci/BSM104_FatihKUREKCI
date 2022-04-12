package week_7;

import java.util.*;

public class QueueExample {

	public static void main(String[] args) {

		String data[] = {"Java", "PHP", "Python", "C", "C++"};
		
		Queue<String> q = new LinkedList<String>();
		
		for(String word:data) {
			q.add(word);
		}
		
		System.out.println("Queue: " + q);
		System.out.println("Peek: " + q.peek());
		System.out.println("Queue's Size: " + q.size());
		
	}

}
