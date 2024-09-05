package com.sp.logical;

import java.util.Scanner;

public class AllDigitProductEvenOrOdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		boolean result=resultproductEvenOrOdd(num);
		
		if(result) {
			System.out.println(num+" : Product is even");
		}else {
			System.out.println(num+" : Product is Odd");
		}
		
	}

	private static boolean resultproductEvenOrOdd(int num) {

		while(num>0) {
			int rem=0;
			rem=num%10;
			if(rem%2==0)
				return true;
			
			num=num/10;
		}
		return false;
	}

}
