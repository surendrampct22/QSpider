package com.sp.logical;

import java.util.Scanner;

public class CountNumOfDigit {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int result=countDigit(num);
		System.out.println("Total digit of : "+result);
	}

	private static int countDigit(int num) {
		int count=0;
		while(num>0) {
			int rem=0;
			
			rem=num%10;
			count++;
			
			num=num/10;
		}
		return count;
		
	}

}
