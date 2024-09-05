package com.sp.logical;

import java.util.Scanner;

public class StringConverCharNaturalOrder {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a String");
		
		String s=sc.nextLine();
		
		stringConvertChar(s);
		
		
	}

	private static void stringConvertChar(String s) {
		int i =0;
		int j=s.length();
		System.out.println(s.length());
		
		
		while(i<j) {
			
			char ch=s.charAt(i);
			i++;
			
			System.out.println(ch);
		}
		
		
	}
	
	
}
