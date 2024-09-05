package com.sp.logical;

import java.util.Scanner;

public class PrintAllEvenDigit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();

		printEvenDigit(num);

	}

	public static void printEvenDigit(int num) {
		while (num > 0) {
			int rem = 0;
			rem = num % 10;
			if (rem % 2 == 0) {
				System.out.println(num + " all even digit print " + rem);

			}
			num = num / 10;

		}

	}
}
