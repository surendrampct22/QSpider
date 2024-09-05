package com.sp.logical;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number");

		int num = sc.nextInt();

		int result=Strong(num);
		System.out.println(result);
		
		if(result==num) {
			System.out.println("This is armsstrong number");
		}else
			System.out.println("This is not armsstrong number");
		
	}

	private static int Strong(int num) {

		int sum=0;
		while (num > 0) {
			int rem = 0;
			rem = num % 10;
			int i=1;
			int fact=1;
			while(i<=rem) {
			
			fact=fact*i;
			i++;
			
			}
			sum=sum+fact;
			num=num/10;
		}
		return sum;
	}

}
