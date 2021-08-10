package Algoriths;
import java.util.*;
import java.lang.*;
import java.io.*;
public class FrationalKnapsack {
	public static class Items {
	    int value, weight, index;
	    Double cost;
	    Items(int value, int weight, int index){
	        this.value = value;
	        this.weight = weight;
	        this.index = index;
	        this.cost = new Double((double) value / (double) weight);
	    }
	}
	public static double solve(int val[], int wt[], int n, int capacity) {
		Items[] a = new Items[n];
        for(int i = 0;i<n;i++){
//            a[i].value = val[i];
//            a[i].weight = wt[i];
//            a[i].index = i;
            a[i] = new Items(val[i], wt[i], i);
//            a[i].cost = new Double((double) a[i].value / (double) a[i].weight);
        }
        Arrays.sort(a, new Comparator<Items>(){
        	public int compare(Items a, Items b) {
    			return b.cost.compareTo(a.cost);
    		}
        });
        double totalValue = 0d;
        
        for (Items i : a) {
 
            int curWt = (int)i.weight;
            int curVal = (int)i.value;
 
            if (capacity - curWt >= 0) {
                // this weight can be picked while
                capacity = capacity - curWt;
                totalValue += curVal;
            }
            else {
                // item cant be picked whole
                double fraction
                    = ((double)capacity / (double)curWt);
                totalValue += (curVal * fraction);
                capacity
                    = (int)(capacity - (curWt * fraction));
                break;
            }
        }
 
        return totalValue;
        
	}
//	public class sortByCost implements Comparator<Items>{
//		@Override
//		public int compare(Items a, Items b) {
//			return a.cost.compareTo(b.cost);
//		}
//	}
	
	

	public static void main(String[] args) {
		int[] weight = { 10, 40, 20, 30 };
        int[] value = { 60, 40, 100, 120 };
        int capacity = 50;
        int n = 4;
        double max = solve(value, weight, n, capacity);
        System.out.println(max);
	}
}
