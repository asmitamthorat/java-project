package com.brid;

import java.util.Scanner;

public class reversestring {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	 String str1;
	 System.out.println("enter the string");
	 str1=scanner.nextLine();
	 String reverse = "";
		
		
		for(int i = str1.length() - 1; i >= 0; i--)
		{
			reverse = reverse + str1.charAt(i);
		}
		
		System.out.println("Reversed string is:");
		System.out.println(reverse);
			
			
		
		
	

}
}