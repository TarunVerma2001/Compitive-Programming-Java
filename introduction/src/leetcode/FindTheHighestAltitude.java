package leetcode;
import java.util.*;

public class FindTheHighestAltitude {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
		int n = 2;
		for(int i = 0;i<=m;i++) {
			ArrayList<Integer> temp = new ArrayList<Integer>();
			temp.add(0);
			temp.clear();
			map.put(i, temp);
		}
		for(int i = 0;i<m;i++) {
			for(int j = 0;j<n;j++) {
				ArrayList<Integer> temp = map.get(languages[i][j]);
				temp.add(i+1);
				
			}
		}
	}

}
