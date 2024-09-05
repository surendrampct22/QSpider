package com.sp.logical;

public class Program8_9 {
	public static void main(String[] args) {
		int i = 1;
		double sum = 0;

		while (i <= 99) {

			sum = sum + (1.0 / i * i);
			i++;

		}
		System.out.println(sum);
	}

}
