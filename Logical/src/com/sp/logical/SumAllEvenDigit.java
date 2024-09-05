package com.sp.logical;

import java.util.Scanner;

public class SumAllEvenDigit {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		int result=sumEvenDigit(num);
		System.out.println(num+"  Sum all even digit are : "+result);
	}

	private static int sumEvenDigit(int num) {
		int sum=0;
		 while(num>0) {
			 int rem=0;
			 rem=num%10;
			 if(rem%2==0) {
				 sum=sum+rem;
			 }
			 num=num/10;
		 }
		 return sum;
		
	}

}
