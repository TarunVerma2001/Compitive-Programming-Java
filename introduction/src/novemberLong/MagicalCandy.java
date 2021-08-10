package novemberLong;
import java.util.*;
public class MagicalCandy {
	static int modulo = 1000000007;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		for(int o = 0;o<t;o++) {
			int n = sc.nextInt();
			int A[] = new int[n];
			for(int i =0;i<n;i++) {
				A[i] = sc.nextInt();
			}
			int q = sc.nextInt();
			boolean Chef = true;
			boolean Chefu = false;
			int ChefS = 0;
			int ChefuS = 0;
			if(A[0] == 1) {
				int i = 1;
				for(;q>0;q--) {
					int r = sc.nextInt();
					for(;i<=r;i++) {
						if(((i - 1) % n) == 0) {
							Chef = true;
							Chefu = false;
						}
						if(Chef == true) {
							ChefS += (A[(i-1) % n] % modulo);
							Chef = false;
							Chefu = true;
						} else {
							if(A[(i - 1) % n] % 2 == 0) {
								ChefuS += (A[(i - 1) % n] % modulo);
								Chefu = true;
								Chef = false;
							}
						}
					}
					System.out.println(ChefS);
				}
			} else if(A[n-1] == 1){
				int i = 1;
				for(;q>0;q--) {
					int r = sc.nextInt();
					for(;i<=r;i++) {
						if(((i - 1) % n) == 0) {
							Chef = true;
							Chefu = false;
						}
						if(Chef == true) {
							if((i+1) % n == 0) {
								if(A[(i-1) % n] % 2 == 0) {
									ChefS += (A[(i-1) % n] % modulo);
									continue;
								} else {
									ChefS += ((A[(i-1) % n] - 1) % modulo );
									continue;
								}
							} else {
								if(A[(i - 1) % n] == 1) {
									ChefS += (1 % modulo);
									Chef = false;
									Chefu = true;
									continue;
								}
								if((A[(i - 1) % n] % 2 == 0) && A[(i - 1) % n] != 1) {
									ChefS += (A[(i - 1) % n] % modulo);
									continue;
								} else if((A[(i - 1) % n] % 2 != 0) && A[(i - 1) % n] != 1) {
									ChefS += ((A[(i - 1) % n] - 1) % modulo );
									continue;
								}
							}
						} 
					}
					System.out.println(ChefS);
				}
			} else {
				int i = 1;
				for(;q>0;q--) {
					int r = sc.nextInt();
					for(;i<=r;i++) {
						if(((i - 1) % n) == 0) {
							Chef = true;
							Chefu = false;
						}
						if(Chef == true) {
							if(i % n == 0) {
								if(A[(i - 1) % n] % 2 == 0) {
									ChefS += ((A[(i - 1) % n] - 1) % modulo);
									Chef = false;
									Chefu = true; 
									continue;
								} else {
									ChefS += (A[(i - 1) % n] % modulo);
									Chef = false;
									Chefu = true;
									continue;
								}
							}
							if((((i - 1) % n) + 1) < n) {
								if(A[((i - 1) % n) + 1] != 1) {
									if(A[(i - 1) % n] % 2 == 0) {
										ChefS += (A[(i - 1) % n] % modulo);
										continue;
									} else {
										ChefS += ((A[(i - 1) % n] - 1 ) % modulo );
										continue;
									}
								} else {
									if(A[(i - 1) % n] % 2 == 0) {
										ChefS += ((A[(i - 1) % n] - 1) % modulo);
										Chef = false;
										Chefu = true;
										continue;
									} else {
										ChefS += (A[(i - 1) % n] % modulo );
										Chef = false;
										Chefu = true;
									}
								}
							} else {
								if(A[(i - 1) % n] % 2 == 0) {
									ChefS += (A[(i - 1) % n] % modulo );
									continue;
								} else {
									ChefS += ((A[(i - 1) % n] - 1) % modulo);
									continue;
								}
							}
						} else {
							ChefuS += (A[(i - 1) % n] % modulo);
							Chef = true;
							Chefu = false;
							continue;
						}
					}
					System.out.println(ChefS);
				}
				
			}
		}
	}

}


