package com.sp.logical;

import java.util.Scanner;

public class DiffBigAndSmall {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		int difference=diffBigSmall(num);
		System.out.println("The Difference of biggest and smallest are : "+difference);
	}

	private static int diffBigSmall(int num) {
		int big=0;
		int small=9;
		
		while(num>0) {
			int rem=0;
			rem=num%10;
			if(rem>big) {
				big=rem;
			}else if(rem<small){
				
				small=rem;
			}
			
			num=num/10;
			
		}
		return big-small;
		
	}

}
