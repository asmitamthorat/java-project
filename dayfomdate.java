package com.brid;

public class dayfomdate {
	
	static int dayofweek(int d, int m, int y) 
	{ 
	    int y0=(y-(14-m)/12);
	    int x=(y0+y0/4-y0/100+y0/400);
	    int m0=m+12*((14-m)/12)-2;
	    int d1=(d+x+31*m0/12)%7;
		return d1;
	    
	} 
	  
	
	public static void main(String arg[]) 
	{ 
	    int day = dayofweek(19,02, 2010); 
	    System.out.print(day); 
	} 
	} 
	  

