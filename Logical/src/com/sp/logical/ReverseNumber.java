package com.sp.logical;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int reverse=reverseNum(num);
		System.out.println(reverse);
	}

	private static int reverseNum(int num) {

		int rev=0;
		while(num>0) {
			int rem=0;
			rem=num%10;
			
			rev=10*rev+rem;
			
			num=num/10;
		}
		return rev;
	}

}
