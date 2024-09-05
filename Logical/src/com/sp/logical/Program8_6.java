package com.sp.logical;

public class Program8_6 {
	public static void main(String[] args) {
		int num=1;
		int result=0;
	
		
		while(num<=99) {
			result=result+num*(num+1)*(num+1);
			num++;
		}
		System.out.println(result);
	}

}
