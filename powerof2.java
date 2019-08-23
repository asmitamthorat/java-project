package com.brid;

public class powerof2 {
	public static void main(String [] args)
	{
		
		int n =Integer.parseInt(args[0]);
		int i;
		int power=1;
		System.out.println(n);
		  
	for(i=1;i<=n;i++)
	{
		power=2*power;
		System.out.println(power);
		
	}
	
	
	}
    
}
