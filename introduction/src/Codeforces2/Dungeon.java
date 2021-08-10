package Codeforces2;
import java.util.*;
public class Dungeon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		for(int o = 0;o<t;o++) {
			int a, b, c;
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
//			if(a == b && a == c) {
//				if(a % 3 != 0) {
//					System.out.println("No");
//					
//				}
//			}
			for(int i = 1;i>=0;i++) {
				if(i % 7 == 0) {
					if(a > 0 || b > 0 || c > 0) {
						if(a != 0) 
							a-=1;
						else if(b!=0)
							b-=1;
						else if(c!=0)
							c-=1;
						if(a == 0 && b == 0 && c == 0) {
							System.out.println("Yes");
							break;
						}
					} else {
						System.out.println("No");
						break;
					}
				}
				if(a > 0 || b > 0 || c > 0) {
					if((i+2) % 3 == 0) {
						if(a!=0)
							a-=1;
						else if(b != 0)
							b-=1;
						else 
							c-=1;
						
						if(a == 0 && b == 0 && c == 0)
							System.out.println("No");
					}
				else if((i+1) % 3 == 0) {
					if(b!=0)
						b-=1;
					else if(a != 0)
						a-=1;
					else 
						c-=1;
					
					if(a == 0 && b == 0 && c == 0) {
						System.out.println("No");
						break;
					}
				} else if(i % 3 == 0) {
					if(c!=0)
						c-=1;
					else if(a != 0)
						a-=1;
					else 
						b-=1;
					
					if(a == 0 && b == 0 && c == 0) {
						System.out.println("No");
						break;
					}
				}
			}
		}
		}
		}

}
