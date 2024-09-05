package com.sp.logical;

import java.util.Scanner;

public class PrintEachDigit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();

		int result = eachDigit(num);
		// System.out.println(result);
	}

	private static int eachDigit(int num) {

		while (num > 0) {
			int rem = 0;
			rem = num % 10;
			System.out.println(num+" :print Each digit: "+rem);
			num = num / 10;
		}

		return num;

	}

}
