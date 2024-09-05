package com.sp.logical;

public class EvenProgram {

	static int n;

	private static void even() {
		while (n <= 100) {

			if (n % 2 == 0) {
				System.out.println("All even number " + n);
			}
			n++;
		}

	}

	public static void main(String[] args) {

		EvenProgram.even();

	}

}
