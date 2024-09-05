package com.sp.logical;

public class Program8_5 {
	public static void main(String[] args) {
		int num=1;
		int result=0;
		while(num<=100) {
			result=result+num*(num+1);
			num++;
		}
		System.out.println(result);
	}

}
