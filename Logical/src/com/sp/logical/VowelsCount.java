package com.sp.logical;

import java.util.Scanner;

public class VowelsCount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		
		stringVowels(s);
	}

	private static void stringVowels(String s) {
		int count=0;
		int i=0;
		int j=s.length();
		while(i<j) {
			char ch=s.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count++;
			}
			
			i++;
		}
		System.out.println(count);
		
	}

}
