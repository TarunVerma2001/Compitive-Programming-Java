package queue;
public class MainClass {

	public static void main(String[] args) {
		
//		Queue<Integer> q = new LinkedList<>();
		
//		q.add(12);
//		q.add(23);
//		q.add(34);
		
//		System.out.println(q);
//		System.out.println(q.remove());
//		System.out.println(q.remove());
//		
//		System.out.println(q.element());
//		System.out.println(q.poll());
		
		MyQueue<Integer> mq = new MyQueue<>(); 
		mq.enqueue(12);
		mq.enqueue(2);
		mq.enqueue(123);
		mq.enqueue(45);

		
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		
		mq.enqueue(456);
		
		System.out.println(mq.dequeue());
		
	}

}
