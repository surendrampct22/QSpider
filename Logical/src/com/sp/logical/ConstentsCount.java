package com.sp.logical;

import java.util.Scanner;

public class ConstentsCount {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		
		int i=0;
		int j=s.length();
		int count=0;
		while (i <j) {
			
			char ch=s.charAt(i);
			if (ch != 'a' || ch != 'e' || ch != 'i' || ch != 'o' || ch != 'u') {
				//count++;
				count++;
			}
			i++;

		}
		System.out.println( count);

	}

}
