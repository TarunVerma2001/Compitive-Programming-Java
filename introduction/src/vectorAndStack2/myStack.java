package vectorAndStack2;

import lists2.MyLinkedList;

public class myStack<E> {

	MyLinkedList<E> ll = new MyLinkedList<>();
	
	void push(E e) {
		ll.add(e);
	}
	E pop() throws Exception {
		if(ll.isEmpty()) {
			
			throw new Exception("Cannot pop from empty list"); 
		}
		return ll.removeLast();
	}
	E peek() throws Exception{
		if(ll.isEmpty()) {
			throw new Exception("Cannot peek from empty list"); 
		}
		return ll.getLast();
	}
	
}
