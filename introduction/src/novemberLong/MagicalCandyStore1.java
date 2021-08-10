package novemberLong;
import java.util.*;
public class MagicalCandyStore1 {
	
	static int modulo = 1000000007;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		for(int o = 0;o<t;o++) {
			int n = sc.nextInt();
			long [] A = new long[n];
			for(int i = 0;i<n;i++) {
				A[i] = sc.nextLong();
			}
			int q = sc.nextInt();
			long ChefS = 0;
			long ChefuS = 0;
			boolean Chef = false;
			boolean Chefu = true;
			int i = 1;
			for(;q>0;q--) {
				long r = sc.nextLong();
//				int i = 1;
				for(;i<=r;i++) {
					System.out.println("(i + (n - 1)) % n : " + (i + (n - 1)) % n);
					if((i + (n - 1)) % n == 0) {
						Chef = !Chef;
						Chefu = !Chefu;
						System.out.println("INININ");
						System.out.println(Chef);
						System.out.println(Chefu);
						if(Chef == true) {
							if(A[(i - 1) % n] == 1) {
								ChefS += (1 % modulo);
								Chef = false;
								Chefu = true;
								continue;
							}
						}
					} else if(((i + 1) % n) == 0) {
						if(A[(i - 1) % n + 1] == 1) {
							if(Chef == true) {
								if(A[(i - 1) % n] % 2 == 0) {
									ChefS += (A[(i - 1) % n] % modulo);
									continue;
								} else {
									ChefS += ((A[(i - 1) % n] - 1) % modulo);
									continue;
								}
							} else {
								Chef = true;
								Chefu = false;
								continue;
							}
						} else {
							if(Chef == true) {
								if(A[(i - 1) % n] == 1) {
									ChefS += (1 % modulo);
									Chef = false;
									Chefu = true;
									continue;
								} else {
									if(A[(i - 1) % n] % 2 == 0) {
										ChefS += (A[(i - 1) % n] % modulo);
										continue;
									} else {
										ChefS += ((A[(i - 1) % n] - 1) % modulo);
										continue;
									}
								}
							} else {
								continue;
							}
						}
					} else if(i % n == 0) {
						if(Chef == true) {
							if(A[(i - 1) % n] == 1) {
								ChefS += (1 % modulo);
								Chef = false;
								Chefu = true;
								continue;
							} else {
								if(A[(i - 1) % n] % 2 != 0) {
									ChefS += (A[(i - 1) % n] % modulo);
									Chef = false;
									Chefu = true;
									continue;
								} else {
									ChefS += ((A[(i - 1) % n] - 1) % modulo);
									Chef = false;
									Chefu = true;
									continue;
								}
							}
						} else {
							if(A[(i - 1) % n] == 1) {
								Chef = true;
								Chefu = false;
								continue;
							} else {
								Chef = true;
								Chefu = false;
								continue;
							}
						}
					}
					else {
						System.out.println("IN ELSE");
						System.out.println(" Chef : " + Chef);
						System.out.println("Chefu : " +Chefu);
						if(Chef == true) {
							System.out.println("in if : ");
							if(A[((i - 1) % n) + 1] == 1) {
								if(A[(i - 1) % n] % 2 == 0) {
									ChefS += ((A[(i - 1) % n] - 1) % modulo);
									continue;
								} else {
									ChefS += (A[(i - 1) % n] % modulo);
									continue;
								}
							} else if(A[(i - 1) % n] == 1) {
								System.out.println("in thos as well");
								ChefS += (1 % modulo);
								Chef = false;
								Chefu = true;
								continue;
							} else {
								if(A[(i -1) % n] % 2 == 0) {
									ChefS += (A[(i - 1) % n] % modulo);
									continue;
								} else {
									ChefS += ((A[(i - 1) % n] - 1) % modulo);
									continue;
								}
							}
						} else {
							if(A[(i - 1) % n + 1] == 1) {
								Chefu = false;
								Chef = true;
								continue;
							} else {
								System.out.println("in this");
								continue;
							}
						}
					}
				}
				System.out.println("ChefS : " + ChefS);
			}
		}

	}

}
