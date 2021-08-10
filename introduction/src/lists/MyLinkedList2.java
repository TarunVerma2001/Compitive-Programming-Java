package lists;

public class MyLinkedList2 {

	//we need a head
	Node head;
	
	void add(int data) {
		Node toAdd = new Node(data);
		
		if(isEmpty()) {
			head = toAdd;
			return;
		}
		
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = toAdd;
	}
	void print() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data +" ");
			temp = temp.next;
		}
	}
	
	boolean isEmpty() {
		return head == null;
	}
	
	static class Node{
		int data;
		Node next;//refrence of next node
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
}