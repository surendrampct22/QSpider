package com.sp.logical;

import java.util.Scanner;

public class CountOddDigitNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		int result = countOddDigit(num);
		System.out.println("Total odd digit are : " + result);

	}

	private static int countOddDigit(int num) {
		int count = 0;
		
		while(num>0) {
			int rem=0;
			rem=num%10;
			if(rem%2!=0)
				count++;
			
			num=num/10;
				
		}
		
		return count;
	}

}
