package com.sp.logical;

import java.util.Scanner;

public class CountEvenDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		
		int result=countEvenDigitNum(num);
		System.out.println("Total event digit : "+result);
	}

	private static int countEvenDigitNum(int num) {
		int count=0;
		
		while(num>0) {
			int rem=0;
			rem=num%10;
			if(rem%2==0)
				count++;
			
			num=num/10;
		}
		
		return count;
	}

}
