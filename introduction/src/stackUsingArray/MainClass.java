package stackUsingArray;

public class MainClass {

	public static void main(String[] args) throws Exception {

		MyStack st = new MyStack(5);
		st.push(23);
		st.push(234);
		st.push(123);
		st.push(12);
		st.push(111);
		System.out.println(st.sizeOfStack());
		System.out.println(st.pop());
		System.out.println(st.sizeOfStack());
		st.printStack();
		
	}

}
