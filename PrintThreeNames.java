package com.brid;

import java.util.Scanner;

public class PrintThreeNames 
{
	public static void main(String[] args) 
	{
	
	String[] Str= new String [4];
	System.out.println("enter three names last with hi also");
	for(int i=0;i<Str.length;i++)
	{
		Scanner scanner= new Scanner(System.in);
		Str[i]=scanner.next();
		
		
	}
	for (int i=Str.length-1;i>=0;i--)
		
	{
		
		System.out.println(Str[i]);
	}

	}
}
