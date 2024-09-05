package com.sp.logical;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number");
		int number = sc.nextInt();
		if (primeNumber(number)) {
			System.out.println("It is prime number");

		} else
			System.out.println("It is not prime number");

	}

	private static boolean primeNumber(int number) {

		if (number <= 1) { // its condition only check for 1st number because 1 is not prime number
			return false;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;

	}

}
