package Algoriths;

import java.util.ArrayList;
import java.util.Collections;

public class ActivitySelection {

	int start;
	int end;
	
	public ActivitySelection() {
		// TODO Auto-generated constructor stub
	}
	public ActivitySelection(int start, int end) {
		// TODO Auto-generated constructor stub
		this.start = start;
		this.end = end;
	}
	
	public static void Solve(ArrayList<ActivitySelection> arr) {
//		ArrayList<ActivitySelection> arr = new ArrayList<ActivitySelection>();
//		System.out.println(arr);
		Collections.sort(arr, (a, b) -> a.end - b.end);
		
		int i = 0;
		System.out.print(i + " ");
		for(int j = 1;j<arr.size();j++) {
			if(arr.get(j).start >= arr.get(i).end) {
				System.out.print(j + " ");
				i = j;
			}
		}
		System.out.println();
//		System.out.println("jhi");
		
//		System.out.println(arr);
//		for(ActivitySelection it: arr) {
//			System.out.println(it.start + " " + it.end);
//		}
		
	}
	public static void main(String[] args) {
		
		ArrayList<ActivitySelection> a = new ArrayList<ActivitySelection>();
		a.add(new ActivitySelection(1, 2));
		a.add(new ActivitySelection(3, 4));
		a.add(new ActivitySelection(0, 6));
		a.add(new ActivitySelection(5, 7));
		a.add(new ActivitySelection(8, 9));
		a.add(new ActivitySelection(5, 9));
		
		Solve(a);
		

	}

}
