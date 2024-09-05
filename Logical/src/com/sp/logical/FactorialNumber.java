package com.sp.logical;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number");
		int num = sc.nextInt();
		
		
		int fact = 1;
		int i = 1;
		while (i <= num) {
			fact = fact * i;
			i++;
		}
		System.out.println(num + " factorial is " + fact);
	}

}
