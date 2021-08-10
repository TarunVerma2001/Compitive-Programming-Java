package septemberLongChallenge;
import java.util.*;

//import collegeAsignments.LinkedList;
public class BytelandianCoins {

	public static boolean isUnique(String sub) {
		HashSet<Character> a = new HashSet<Character>();
		for(int i =0;i<sub.length();i++) {
			a.add(sub.charAt(i));
		}
		System.out.println("a.size()" + a.size());
		if(a.size() == sub.length()) {
			return true;
		} else {
			return false;
		}
	}
	public static boolean isVowel(char ch) {
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		}
		if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner sc = new Scanner(System.in);
//		for(int i = 0;i<10;i++) {
//			int n = sc.nextInt();
//			int temp = (int)(n/2) + (int)(n/3) + (int)(n/4);
//			System.out.println(Math.max(n, temp));
//		}
//		ArrayList<Character> a= new ArrayList<>();
//		a.con
//		for(int i = 0;i<nums.length;i++) {
//			a.add(nums[i]);
//		}
//		Collections.frequency(a, )
//		a.add(index, element);
//		int nums[] = {3,2,2,3};
//		int val = 3;
//		int i = 0;
//        int j = nums.length-1;
//        while(j != i){
//            if(nums[i] == val){
//                if(nums[j] == val){
//                    j--;
//                    continue;
//                    
//                } else{
//                    int temp = nums[i];
//                    nums[i] = nums[j];
//                    nums[j] = temp;
//                    i++;
//                    j--;
//                }
//            } else{
//            	i++;
//            }
//            System.out.println(i);
//            System.out.println(i + 1);
//        }
//        for( j = 0;j<nums.length;j++) {
//        	System.out.print(nums[j] + " ");
//        }
//		String s = new String();
//		s = "([)]";
//		ArrayList<Character> a = new ArrayList<>();
      
//        int count = 0;
//        Stack<Character> a = new Stack<Character>();
//        a.pu
//        for(int i = 0;i<s.length();i++) {
//        	for(int j = i;j<s.length();j++) {
//        		String sub = s.substring(i, j+1);
//        		System.out.println(sub);
//        		System.out.println(i +" . " + j);
//        		if(isUnique(sub)) {
//        			count = Math.max(count, sub.length());
//        		}
//        	}
//        }
//        System.out.println(count);
//		Stack<Character> a = new Stack<Character>();
//        for(int i = 0;i<s.length();i++){
//            a.push(s.charAt(i));
//        }
//        int simple = 0;
//        int curly = 0;
//        int square = 0;
//        int n = a.size();
//        for(int i = 0;i<n;i++){
//            char temp = a.pop();
//            System.out.println(temp);
//            if(temp == '(')
//                simple++;
//            if(temp == '{')
//                curly++;
//            if(temp == '[')
//                square++;
//            if(temp == ')') {
//                simple--;
//                if(curly != 0 || simple != 0 || square != 0)
//                	return false;
//        
//            }
//            if(temp == '}') {
//            	curly--;
//            	if(curly != 0 || simple != 0 || square != 0)
//                	return false;
//            }
//                
//            if(temp == ']') {
//            	square--;
//            	if(curly != 0 || simple != 0 || square != 0)
//                	return false;
//            }
//                
//        }
//        if(simple == 0 && curly == 0 && square == 0)
//            System.out.println(true);
//        else
//        	System.out.println(false);
        
        String s = new String();
        
        s = "race a car";
        
//        Deque<Character> b = new LinkedList<Character>();
//        for(int i = 0;i<s.length();i++) {
//        	int temp = (int)s.charAt(i);
//        	if((temp >= 65 && temp <= 90) || (temp >= 97 && temp <= 122) || (temp >= 48 && temp <= 57)) {
//        		b.add(Character.toLowerCase(s.charAt(i)));
//        	}
//        }
//        System.out.println(b);
//        boolean res = true;
//        int nn = b.size();
//        int i = 0;
//        int j = nn-1;
//        while(!b.isEmpty()) {
//        	if(b.size() == 1) {
//        		break;
//        	}
//        	int temp1 = b.pollFirst();
//        	int temp2 = b.pollLast();
//        	if(temp1 != temp2) {
//        		res = false;
//        		break;
//        	}
//        }
//        System.out.println(res);
        
        s = "leetcode";
        char arr[] = s.toCharArray();
        int n = s.length();
        if(n == 0)
        	System.out.println(s);
        int i = 0;
        int j = n-1;
        while(i<j) {
        	if(isVowel(arr[i])) {
        		System.out.println("in .");
        		System.out.println("i and k : " + i + " . " + j);
        		if(isVowel(arr[j])) {
        			System.out.println("in ..");
        			System.out.println("i and k : " + i + " . " + j);
        			System.out.println(arr[i] + " . " + arr[j]);
        			char ch = arr[i];
        			arr[i] = arr[j];
        			arr[j] = ch;
//        			s.replace(s.charAt(i), s.charAt(j));
////        			s.
//        			s.replace(s.charAt(j), ch);
        			i++;
        			j--;
        			System.out.println(arr[i] + " . " + arr[j]);
        		} else {
        			j--;
        		}
        	} else {
        		i++;
        	}
        }
        String ss = new String(arr);
        System.out.println(ss);
        
	}
	

}
