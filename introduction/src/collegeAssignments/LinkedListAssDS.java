package collegeAssignments;

import java.util.*;

class myll {
	int data;
	Node pre;
	Node next;
	
	public Node head;
	
	public void add(int data) {
		
		Node toAdd = new Node(data);
		
		if(head == null) {
			head = toAdd;
			return;
		}
		Node temp = toAdd;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = toAdd;
	}
	public int removeLast() throws Exception{
		
		Node temp = head;
		
		if(head == null) {
			throw new Exception("Cannot remove last element from empty list");
		}
		if(temp.next == null) {
			Node toRemove = head;
			head = null;
			return toRemove.data;
		}
		while(temp.next.next != null) {
			 temp = temp.next;
		}
		Node toRemove = temp.next;
		temp.next = null;
		return toRemove.data;
	}
	
	public Node(int data) {
		this.data = data;
		next = null;
		pre = null;
	}
}

public class LinkedListAssDS {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		Node obj = new Node
		
	}

}
