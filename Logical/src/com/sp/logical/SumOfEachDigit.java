package com.sp.logical;

import java.util.Scanner;

public class SumOfEachDigit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		int result=sumEachhDigit(num);
		System.out.println(num+" Sum of each digit : "+result);
	}

	private static int sumEachhDigit(int num) {
		int sum=0;
		while(num>0) {
			int rem=0;
			
			rem=num%10;
			sum=sum+rem;
			num=num/10;
			
		}
		
		return sum;
	}

}
