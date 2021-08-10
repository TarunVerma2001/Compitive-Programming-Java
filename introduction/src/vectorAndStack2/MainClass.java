package vectorAndStack2;

public class MainClass {

	public static void main(String[] args) throws Exception {
		
		myStack<Integer> stack= new myStack();
		
		stack.push(45);
		stack.push(34);
		stack.push(56);
		
		int popped = stack.pop();
		System.out.println(popped);
		
		int peeked = stack.peek();
		System.out.println(peeked);
		

	}

}
