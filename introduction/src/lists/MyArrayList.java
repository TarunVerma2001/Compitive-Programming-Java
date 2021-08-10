package lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {

		List<String> fruits = new LinkedList<>();
		List<String> vegetables = new ArrayList<>();
//		we can also use list in place of the Array List
		fruits.add("Apple");
//		fruits.add(23);
		fruits.add("hii");
		fruits.add("orange");
//		vegetables.add("potato");
//		vegetables.add("tomato");
//		 fruits.addAll(vegetables);
//		System.out.println(fruits.get(1));
//		fruits.set(1, "banana");
//		fruits.remove(1);
		System.out.println(fruits);
//		List<String> toRemove = new ArrayList();
//		toRemove.add("Apple");
//		toRemove.add("hii");
	
//		fruits.removeAll(toRemove);
////		fruits.clear();
		
//		System.out.println(fruits.size());
//		System.out.println(fruits);
//		System.out.println(fruits.contains("Apple"));
//		System.out.println(fruits.isEmpty());
		
		String temp[] = new String[fruits.size()];
		fruits.toArray(temp);
		for(String e: temp) {
			System.out.println(e);
		}
				
//		Pair<String, Integer> p1 = new Pair("Anuj", 457);
//		Pair<Boolean, String> p2 = new Pair(true, "Hello");
//		
//		p1.getDescription();
//		p2.getDescription();
		
	}

}
