package com.sp.logical;

import java.util.Scanner;

public class StringPalindrom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.nextLine();
		String actualValue = s;

		String reverseString = stringPalindromCheck(s);

		String reverseString2 = stringPalindromCheckSecondWay(s);

		// This is rerverse String

		System.out.println(reverseString);

		System.out.println(reverseString2);

		// it is check palindrom or not

		if (actualValue.equals(reverseString))
			System.out.println("This is Palindrom");
		else
			System.out.println("This is not Palindrom");
	}

	// 1st way 
	private static String stringPalindromCheckSecondWay(String s) {

		String s1 = "";
		int i = 0;
		int j = s.length();
		while (i < j) {
			s1 = s.charAt(i) + s1;

			i++;

		}
		return s1;
	}

	//Second way
	private static String stringPalindromCheck(String s) {

		String s1 = "";
		int i = 0;
		int j = s.length() - 1;
		while (j >= 0) {

			s1 = s1 + s.charAt(j);

			j--;

		}
		return s1;

	}

}
