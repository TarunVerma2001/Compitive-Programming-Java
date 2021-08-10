package Algoriths;
import java.util.*;
public class JobSequencing {
		char jobId;
		int deadline, profit;
		public JobSequencing() {
			// TODO Auto-generated constructor stub
		}
		JobSequencing(char jobId, int deadline, int profit){
			this.jobId = jobId;
			this.deadline = deadline;
			this.profit = profit;

	}
	public static void Solve(ArrayList<JobSequencing> arr, int t) {
		Collections.sort(arr, (a, b) -> b.profit - a.profit);
		
		boolean result[] = new boolean[t];
		char[] job = new char[t];
		for(int i =0;i<arr.size();i++) {
			for(int j = Math.min(t - 1, arr.get(i).deadline -1);j>=0;j--) {
				System.out.println("i : " + i);
				System.out.println("j : " +j);
				if(result[j] == false) {
					System.out.println("Inside");
					result[j] = true;
					job[j] = arr.get(i).jobId;
					break;
				}
			}
		}
		for(char temp: job) {
			System.out.println(temp);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		ArrayList<JobSequencing> arr = new ArrayList<JobSequencing>();
		arr.add(new JobSequencing('a', 2, 100));
		arr.add(new JobSequencing('b', 1, 19));
		arr.add(new JobSequencing('c', 2, 27));
		arr.add(new JobSequencing('d', 1, 25));
		arr.add(new JobSequencing('e', 3, 15));
		
		JobSequencing job = new JobSequencing();
		job.Solve(arr, 3);
	}

}
