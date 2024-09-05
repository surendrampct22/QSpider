package com.sp.logical;

public class Program8_3 {
	public static void main(String[] args) {
		int num=1;
		int result=0;
		while(num<=100) {
			result+=num*(num)*(num);
			num++;
		}
		System.out.println(result);
	}

}
