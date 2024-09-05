package com.sp.logical;

import java.util.Scanner;

public class PrintAllEOddDigit {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		
		printOddDigit(num);
	}
	
	private static void printOddDigit(int num) {
		
		while(num>0) {
			int rem=0;
			rem=num%10;
			if(rem%2!=0) {
				System.out.println(num+" print all odd digit "+rem);
			}
			num=num/10;
			
		}
	}
	
	
	

}
