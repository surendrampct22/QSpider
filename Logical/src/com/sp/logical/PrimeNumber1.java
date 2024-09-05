package com.sp.logical;

import java.util.Scanner;

public class PrimeNumber1 {
	static int i = 2;

	private static boolean primeNumber(int num) {

		if (num <= 1) { // its condition only check for 1st number because 1 is not prime number
			return false;
		}
		while (i < num / 2) { // while (i <= Math.sqrt(num)) both are same // while(i*i<=n)
			if (num % i == 0) {
				return false;
			}
			i++;
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();

		PrimeNumber1.primeNumber(num);

		if (primeNumber(num)) {
			System.out.println("It is prime number");

		} else
			System.out.println("It is not prime number");

	}

}
