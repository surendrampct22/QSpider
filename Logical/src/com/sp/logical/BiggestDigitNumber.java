package com.sp.logical;

import java.util.Scanner;

public class BiggestDigitNumber {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int result=bigDigit(num);
		System.out.println(num+": The Big digit are :"+result);
	}

	private static int bigDigit(int num) {
		int bigDigit=0;
		while(num>0) {
			int rem=num%10;
			if(rem>bigDigit)
				bigDigit=rem;
			
			num=num/10;
			
		}
		return bigDigit;
		
	}

}
