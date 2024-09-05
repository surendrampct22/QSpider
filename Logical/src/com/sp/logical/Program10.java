package com.sp.logical;

import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");
		int num = sc.nextInt();

		System.out.println("Enter a Power of");
		int powerOf = sc.nextInt();
		int power = powerOf;

		int result = 1;

		while (powerOf != 0) {
			result = result * num;
			--powerOf;
		}

		// System.out.println(Math.pow(num, powerOf));
		System.out.println(num + " Power of " + power + " Number = " + result);
	}

}
