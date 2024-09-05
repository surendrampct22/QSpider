package com.sp.logical;

import java.util.Scanner;

public class StringConverCharReverseOrder {

	
	// String indexing start with 0 and length start with 1
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");

		String s = sc.nextLine();
		
		

		stringConvertCharReverse(s);
	}

	private static void stringConvertCharReverse(String s) {

		int i = 0;
		int j = s.length() - 1;
		while (j >= i) {

			System.out.println(s.charAt(j));
			j--;
		}
	}

}
