package JanuaryLongChallenge;
import java.util.*;
public class testWatching {

	
	public static void main(String [] args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		while(t-- !=0){
		int n=scan.nextInt();
		int k=scan.nextInt();
		int h[]=new int[n];
		LinkedHashSet<Integer> h1=new LinkedHashSet<Integer>();

		int sum=0;
		for(int i=0;i<n;i++){
			h[i]=scan.nextInt();
		}
		Arrays.sort(h);
		h1.add(h[n-1]);
		sum=h[n-1];
		int z=-1;
		for(int i=n-2;i>=0;i--){
			System.out.println();
			System.out.println();
			LinkedHashSet<Integer> h2=new LinkedHashSet<Integer>();
			sum=sum+h[i];
			System.out.println(" h1 : " + h1);
			System.out.println(" sum : " + sum);
			Iterator i1=h1.iterator();
			while(i1.hasNext()){
				System.out.println();
				System.out.println("inside while : ");
				int p=(int)(i1.next());
				System.out.println(" p : " + p);
				h2.add(p);
				System.out.println("h2" + h2);
				System.out.println(" h[i] : " + h[i]);
				h2.add(h[i]);
				System.out.println("h2" + h2);
				h2.add(p+h[i]);
				
				System.out.println("h2" + h2);
				if(((p+h[i])>=k)&&((sum-p-h[i])>=k)){
					z=n-i;
					System.out.println("if1 z : " + z);
					break;
					
				}
				if(((h[i])>=k)&&((sum-h[i])>=k)){
					z=n-i;
					System.out.println("if2 z : " + z);
					break;
				}
			}
			if(z!=-1){
				break;
			}
			h1=h2;
		}
		System.out.println(z);
		}
	}
}
