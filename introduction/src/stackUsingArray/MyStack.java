package stackUsingArray;

import stackUsingArray.*;

public class MyStack {


	int stack[];
	int size;
	int top = -1;
	public MyStack(int size) {
		this.size = size;
		stack = new int[size];
	}
	
	
	
	
	public void push(int data) throws Exception{
	
		if(top == size) {
			throw new Exception("Stack Overflow!!");
		} else {
			stack[++top] = data;
			
		}
		
			

			
//		}
		
	}
	public int pop() throws Exception{
		if(top < 0) {
			throw new Exception("Stack UnderFlow!!");
		} else {
			int toShow = top;
			top = top - 1;
			return stack[toShow];
		}
	}
	public int peek() throws Exception{
		if(top < 0) {
			throw new Exception("Stack is Empty!!");
		} else {
			return stack[top];
		}
	}
	public boolean isEmpty() {
		if(top < 0) {
			return true;
		} else {
			return false;
		}
		
	}
	public int sizeOfStack() {
		return top + 1;
	}
	public void printStack() throws Exception {
		if(top < 0) {
			throw new Exception("can't print empty stack!!");
		} else {
			for(int i=0;i<=top;i++) {
				System.out.println(stack[i]);
			}
		}
	}
}
