package com.sp.logical;

public class NumberPalindrom {

	static int num = 404;
	static int mod;
	static int reverseNum;
	

	public static void main(String[] args) {

		reverse(num);
		System.out.println(reverseNum);
	}

	private static void reverse(int num) {
		
		while(num>0) {

		mod = num % 10;
		reverseNum = reverseNum*10+mod;
		num = num / 10;
		}
	}

}
