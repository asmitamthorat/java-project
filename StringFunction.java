package com.brid;

import java.util.Arrays;
import java.util.Scanner;

public class StringFunction {
	
	  public static void main(String[] args) {
		  String str1;
		  String str2;
		  
		  Scanner scanner = new Scanner(System.in);
		  System.out.println("enter Frist string");
		  str1 =scanner.nextLine();
		  System.out.println("enter second string");
		  
		  str2=scanner.nextLine();
		  
		  String s1 = str1.replaceAll("\\s", "");  
		  System.out.println("s1="+s1);
	        String s2 = str2.replaceAll("\\s", ""); 
	        System.out.println("s2="+s2);
	        boolean status = true;  
	        if (s1.length() != s2.length()) {  
	            status = false;  
	        }
	        else
	        {  
	            char[] ArrayS1 = s1.toLowerCase().toCharArray();  
	            char[] ArrayS2 = s2.toLowerCase().toCharArray(); 
	            System.out.println("ArrayS1="+ArrayS1);
	            System.out.println("ArrayS2="+ArrayS2);
	            
	            
	            Arrays.sort(ArrayS1);  
	            Arrays.sort(ArrayS2);  
	            status = Arrays.equals(ArrayS1, ArrayS2); 
	            System.out.println("ArrayS1="+ArrayS1+"   ArrayS2="+ArrayS2);
	        }  
	        if (status)
	        {  
	            System.out.println(s1 + " and " + s2 + " are anagrams");  
	        }
	        else
	        {  
	            System.out.println(s1 + " and " + s2 + " are not anagrams");  

	  
	  }


	  }
	  }
