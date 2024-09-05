package com.sp.logical;

public class SwapNoWithOutThirdVariable {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		System.out.println("Before " + x + " " + y);

		x = x + y;
		y = x - y;
		x = x - y;

		System.out.println("After Swap " + x + " " + y);
	}

}
