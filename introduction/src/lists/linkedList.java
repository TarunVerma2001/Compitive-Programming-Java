package lists;
import java.util.*;

public class linkedList {

	public static void main(String[] args) {

//		List<Integer> ll = new LinkedList<>();
//		List<Integer> al = new ArrayList<>();
//		ll.add(12);
//		ll.add(2);
//		ll.add(32);
		

//		getTimeDiff(al);
//		getTimeDiff(ll);
		
		MyLinkedList myLL = new MyLinkedList();
		
		for(int i=0;i<10;i++) {
			myLL.add(i);
		}
		
		myLL.print();
	
	}
	static void getTimeDiff(List <Integer> list) {
		long start = System.currentTimeMillis();
		for(int i=0;i<100000;i++) {
			list.add(0, i);
		}
		long end = System.currentTimeMillis();
		
		System.out.println(list.getClass().getName() + " -->  " + (end - start));
	}

}
