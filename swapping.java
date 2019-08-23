package com.brid;

public class swapping {
	static int swapNibbles(int x) 
	{ 
	    return ((x & 0x0F) << 4 | (x & 0xF0) >> 4); 
	} 
	  
	// Driver code 
	public static void main(String arg[]) 
	{ 
	    int x = 12; 
	    System.out.print(swapNibbles(x)); 
	} 

}
