package com.sp.logical;

public class ReverseString {

	static String reverse_Name = "";
	static String name = "madama";

	public static void main(String[] args) {
		reverse(name);
		System.out.println(reverse_Name);
		
		if(name.equals(reverse_Name)) {
			System.out.println("Its is Palindorm");
		}
		else
		System.out.println("It is not Palindrom");
	}

	private static String reverse(String name) {

		for (int i = name.length() - 1; i >= 0; i--) {

			reverse_Name = reverse_Name + name.charAt(i);

		}
		return reverse_Name;
	
	}
}
