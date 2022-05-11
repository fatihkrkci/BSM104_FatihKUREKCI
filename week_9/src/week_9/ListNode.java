package week_9;

public class ListNode {

	public int data;
	public ListNode next;
	
	public ListNode(int data, ListNode next) {
		this.data = data;
		this.next = next;
	}
	
	public ListNode() {
		this(0,null);
	}
}
