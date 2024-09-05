package com.sp.logical;

import java.util.Scanner;

public class EachDigitFactorialSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();

		int result = factDigitSum(num);

		System.out.println("Total sum of factorial : " + result);

	}

	private static int factDigitSum(int num) {

		int sum = 0;
		while (num > 0) {
			int rem = 0;
			rem = num % 10;
			int i = 1;
			int fact = 1;

			while (i <= rem) {

				fact = fact * i;
				i++;

			}

			sum = sum + fact;
			num = num / 10;
		}
		return sum;

	}

}
