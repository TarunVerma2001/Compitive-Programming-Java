package novemberLong;
import java.util.*;;
public class MagicaCandySol {
	
	static int modulo = 1000000007;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int test = sc.nextInt();
		for(int o = 0;o<test;o++) {
			int n = sc.nextInt();
			int a[]= new int[n];
			int l = 0;
			int t = -1;
			for(int i = 0;i<n;i++) {
				a[i] = sc.nextInt();
				if(a[i] == 1) {
					if(i == 0) {
						l = 1;
					} else if(i != n-1) {
						l = 2;
						t = i;
					}
					
				}
			}
			if(l == 1) {
				int q = sc.nextInt();
				for(;q>0;q--) {
					int ans;
					int r = sc.nextInt();
					if(r%n == 0) {
						ans = (r/n) % modulo;
					} else {
						if(r%n == 1 && r>n) {
							ans = (r/n) % modulo;
						} else {
							ans = (r / n + 1) % modulo;
						}
					}
					System.out.println(ans);
				}
			} else if(l == 2) {
				long sum = 0;
				long arr[] = new long[100000];
				for(int i = 0;i<n-1;i++) {
					if(i == t-1) {
						if(a[i] % 2 == 0) {
							sum += (a[i] - 1);
							arr[i] = sum;
						} else {
							sum += a[i];
							arr[i] = sum;
						}
					} else {
						if(a[i]%2==0){
							sum+=a[i];
							arr[i]=sum;
						}
						else{
							sum+=a[i]-1;
							arr[i]=sum;
						}
					}
				}
				if(a[n-1]%2==0){
					sum+=a[n-1]-1;
				} else{
					sum=sum+=a[n-1];
				}
				int q = sc.nextInt();
				for(;q>0;q--) {
					long r = sc.nextLong();
					if(r%n==0){
						if(a[n-1]%2==0){
							System.out.println(((r/n)*sum+1) % modulo);
						}
						else{
							System.out.println(((r/n)*sum) % modulo);
						}
					}
					else{
						if(t==r%n-1){
							if(a[t-1]%2==0){
//								System.out.println("in this : " + arr[(int) (r%n-1)]);
								System.out.println(((r/n)*sum+2+arr[(int) (r%n-1)]) % modulo);
							}
							else{
								System.out.println(((r/n)*sum+arr[(int) (r%n-1)]) % modulo);
							}
						}
						else if(t-1==r%n-1){
							if(a[t-1]%2==0){
								System.out.println(((r/n)*sum+arr[(int) (r%n-1)]+1) % modulo);
							}
							else{
								System.out.println(((r/n)*sum+arr[(int) (r%n-1)]) % modulo);
							}
						}
						else{
							if(a[(int) (r%n-1)]%2!=0){
								System.out.println(((r/n)*sum+arr[(int) (r%n-1)]+1) % modulo);
							}
							else{
								System.out.println(((r/n)*sum+arr[(int) (r%n-1)]) % modulo);
							}
						}
					}
				}	
			} else {
				long sum = 0;
				long arr[] = new long[100000];
				for(int i =0 ;i<n-1;i++) {
					if(a[i]%2==0){
						sum+=a[i];
						arr[i]=sum;
					}
					else{
						sum+=a[i]-1;
						arr[i]=sum;
					}
				}
				if(a[n-1]%2==0){
					sum+=a[n-1]-1;
				} else {
					sum=sum+=a[n-1];
				}
				int q = sc.nextInt();
				for(;q>0;q++) {
					long r = sc.nextLong();
					if(r%n==0){
						if(a[n-1]%2==0){
							System.out.println(((r/n)*sum+1) % modulo);
						}
						else{
							System.out.println(((r/n)*sum) % modulo);
						}
					} else {
						if(a[(int) (r%n-1)]%2!=0){
							System.out.println(((r/n)*sum+arr[(int) (r%n-1)]+1) % modulo);
						} else {
							System.out.println((((r/n)*sum+arr[(int) (r%n-1)]) % modulo)+1-1);
						}
					}
				}
			}
		}

	}

}
