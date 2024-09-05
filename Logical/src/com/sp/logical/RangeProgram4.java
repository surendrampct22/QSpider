package com.sp.logical;

import java.util.Scanner;

public class RangeProgram4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a Start Number");
		int startNumber = scanner.nextInt();
		System.out.println("Entea end number");
		int endNumber = scanner.nextInt();
		int count = 0;

		while (startNumber <= endNumber) {
			if (startNumber % 10 == 7 && startNumber % 7 == 0) {
				System.out.println(startNumber);
				count++;
			}
			startNumber++;
		}
		System.out.println("Total number count " + count);

	}

}
