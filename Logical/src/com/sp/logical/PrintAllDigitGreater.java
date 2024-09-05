package com.sp.logical;

import java.util.Scanner;

public class PrintAllDigitGreater {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");

		int num = sc.nextInt();

		printAllDigit(num);
	}

	private static void printAllDigit(int num) {
		while (num > 0) {
			int rem = 0;
			 rem = num % 10;
			if (rem > 5) 
				System.out.println(num + " Print all digit greater than 5 : " + rem);
		
			num = num / 10;
		}

	}

}
