package com.brid;

public class Harmonic {
	public static void main(String [] args)
	{
		
		int n =Integer.parseInt(args[0]);
		int i;
		double sum=0.00;
		for(i=1;i<=n;i++)
		{
		 sum= sum +1.0/i;	
		 System.out.println(sum);
		}
		}
	

}
