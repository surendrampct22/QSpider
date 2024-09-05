package com.sp.logical;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		int temp = 1;
		int count = 0;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		while (temp <= num/2) {
			if (num % temp == 0) {
				System.out.println(num + " Factor are " + temp);
				count++;
			}
			++temp;
		}
		System.out.println("Total number of factor " + count);
	}

}
