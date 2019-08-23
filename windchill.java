package com.brid;

public class windchill {
	public static void main(String [] args)
	{
		
		int t =Integer.parseInt(args[0]);
		int v =Integer.parseInt(args[1]);
		double w= (35.74 + 0.6215*t+(0.4275*t-35.75)*v);
		System.out.println(w);
		
	}

}
