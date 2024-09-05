package com.sp.logical;

public class Program8_7 {
	public static void main(String[] args) {
		int num=1;
		int result=0;
		while(num<=3) {
			result=result+(num*num)*(num+1);
			num++;
		}
		System.out.println(result);
	}

}
