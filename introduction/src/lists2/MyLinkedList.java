package lists2;

public class MyLinkedList<E> {

	public static class Node<E>{
		E data;
		Node next;
		
		public Node(E data) {
			this.data = data;
			next = null;
		}
	}
	Node head;
	
	public void add(E data) {
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
	public boolean isEmpty() {
		if(head == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public void print() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data + " ");
			temp = temp.next;
		}
	}
	public E removeLast() throws Exception{
		Node<E> temp = head;
		if(temp == null) {
			throw new Exception("Canot remove last element from empty list");
		}
		
		if(temp.next == null) {
			Node<E> toRemove = head;
			head = null;
			return toRemove.data;
		}
		
		while(temp.next.next != null) {
			temp = temp.next;
		}
		Node<E> toRemove = temp.next;
		temp.next = null;
		return toRemove.data;
	}
	public E getLast() throws Exception{
		Node<E> temp = head;
		if(temp == null) {
			throw new Exception("Canot peek last element from empty list");
		}
		
		while(temp.next != null) {
			temp = temp.next;
		}
		return temp.data;
	}
	
	
}
