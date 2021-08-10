package vectorAndStack;

import java.util.Stack;
import java.util.Vector;

public class MainClass {

	public static void main(String[] args) throws Exception {


		
		MyStack<Integer> stack = new MyStack();


		
		System.out.println("putting elements in stack (1, 2, 3, 4, 5)");
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		System.out.println("peeking last element");
		System.out.println(stack.peek());
		System.out.println("removing last element");
		System.out.println(stack.pop());
		System.out.println("removing second last element");
		System.out.println(stack.pop());
	}

}
