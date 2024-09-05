
// Get a Factor number
package com.sp.logical;

import java.util.Scanner;

public class Program5 {

	static int temp = 1;

	private static void getFactor(int num) {
		while (temp <= num / 2) {
			if (num % temp == 0) {
				System.out.println(num + " Factor are " + temp);
			}
			++temp;
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Program5.getFactor(num);

	}

}
