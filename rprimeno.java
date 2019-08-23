package com.brid;

import java.util.Scanner;

public class rprimeno {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		
		int a;
		int b;
		int i;
		int c;
		int flg;
		System.out.println("enter the values of a(start limit) and b(end limit)");
		a=scanner.nextInt();
		b=scanner.nextInt();
		System.out.println("prime no's are");
		
		for(i=a;i<=b;i++)
		{
			flg=0;
			for(c=2;c<i/2;c++)
			{
				
			   if(i%c==0)
			  {
				flg=1;
				break;
			  }
			   
//			   else 
//			   {
//				   
//				   flg=0;
//				
//			   }
			}
		 if (flg==0)
		      {
			   
			   System.out.println(i);
			 
			}
			
			}	
			
		}
	}
	


