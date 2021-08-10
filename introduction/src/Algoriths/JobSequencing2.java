package Algoriths;
import java.util.*;
import java.util.Arrays;

public class JobSequencing2 {

	public static class Jobs{
		int id, deadLine, profit;
		Jobs(int id, int deadLine, int profit){
			this.id = id;
			this.deadLine = deadLine;
			this.profit = profit;
		}
	}
	
	public static void solve(Jobs arr[], int n) {
		
		Arrays.sort(arr, new Comparator<Jobs>() {
			@Override
			public int compare(Jobs a, Jobs b) {
				return b.profit - a.profit;
			}
		});
		int maxi = 0;
		for(int i = 0;i<n;i++) {
			maxi = Math.max(maxi, arr[i].deadLine);
		}
		int job[] = new int[maxi+1];
		for(int i = 1;i<=maxi;i++) 
			job[i] = -1;
		
		int jobCount = 0;
		int Profit = 0;
		
		for(int i = 0;i<n;i++) {
			for(int j = arr[i].deadLine;j>0;j--) {
				if(job[j] == -1) {
					job[j] = i;
					jobCount++;
					Profit += arr[i].profit;
					break;
				}
			}
		}
		System.out.println(jobCount + " ... " + Profit);
	}
	
	public static void main(String[] args) {
		Jobs arr[] = new Jobs[4];
		arr[0] = new Jobs(1, 4, 20);
		arr[1] = new Jobs(2, 1, 10);
		arr[2] = new Jobs(3, 1, 40);
		arr[3] = new Jobs(4, 1, 30);
		
		solve(arr, 4);
	}
	
}
