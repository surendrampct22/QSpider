package com.sp.logical;

public class SumOfNumber {

	static int mod = 0;
	static int sum = 0;

	private static void sum(int num) {

		while (num > 0) {

			mod = num % 10;
			sum = sum + mod;
			// sum += mod;
			num = num / 10;

		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		int num = 1234;
		sum(num);

	}

}
