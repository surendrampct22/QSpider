package com.sp.logical;

import java.util.Scanner;

public class Program11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number");
		int total = sc.nextInt();
		int first = 0;
		int second = 1;
		int next = 0;
		System.out.print(first);
		System.out.print(" " + second);

		for (int i = 2; i < total; i++) {
			next = first + second;
			first = second;
			second = next;
			System.out.print(" " + next);
		}

	}

}
