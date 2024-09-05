package com.sp.logical;

public class RangeProgram3 {

	public static void main(String[] args) {

		int startNumber = 0;
		while (startNumber <= 1000) {
			if (startNumber % 10 == 8 && startNumber % 8 == 0) {
				System.out.println(startNumber);
			}
			startNumber++;
		}

	}

}
