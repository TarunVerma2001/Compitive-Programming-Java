package collegeAssignments;

import java.util.Scanner;

public class LinkedList {
	
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
	
	public static class Node{
		int data;
		Node next;
		Node pre;
		
		Node(int data){
			this.data = data;
			next = null;
			pre = null;
		}
	}
	
}

