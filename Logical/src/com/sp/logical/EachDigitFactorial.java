package com.sp.logical;

import java.util.Scanner;

public class EachDigitFactorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		factDigitCount(num);
		
	}

	private static void factDigitCount(int num) {
		
		while(num>0) {
			int rem=0;
			rem=num%10;
			int i=1;
			int fact=1;
			while(i<=rem) {
				fact=fact*i;
				i++;
				
			}
			System.out.println(rem+"!= "+fact);
			num=num/10;
		}
		
	}

}
