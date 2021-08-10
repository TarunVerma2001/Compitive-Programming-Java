package Algoriths;

import java.util.*;
import java.io.*;
public class powerSetUsingBIT {

	public static void printPowerSet(char set[], int set_size) {
		long pow_set_size = (long) Math.pow(2, set_size);
		for(int counter = 0;counter<pow_set_size;counter++) {
			for(int i =0;i<set_size;i++) {
				/* Check if ith bit in the  
                counter is set If set then  
                print jth element from set */
				if((counter & (1 << i)) > 0) {
					System.out.print(set[i]);
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the size of Array : ");
		int set_size = sc.nextInt();
		char set[] = new char[set_size];
		for(int i =0;i<set_size;i++) {
			set[i] = sc.next().charAt(0);
			
		}
		System.out.println("You SubSet List is : " );
		printPowerSet(set, set_size);
		
	}

}
