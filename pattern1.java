package com.brid;

public class pattern1 
{
	public static void main(String[] args) 
	{
	int i,j,k;
	{
		for(i=0;i<=9;i++)
		{
			for(j=0;j<1;j++)
			{
				
				System.out.print("*");
			}
			for(k=5;k<=9;k++)
			{
				if(k==i||k==9-i)
				{
					System.out.print("*");
					
				}
				else
				{
					
					System.out.print(" ");
				}
		
			
			}
			System.out.println(" ");
			
			
		}
		
		//D
		for(i=0;i<=4;i++)
		{
			for(j=0;j<1;j++)
			{
				
				System.out.print("*");
				
			}
			for(k=0;k<=4;k++)
			{
			   if(k==4||i==0||i==4)
			   {
				System.out.print("*");
			   }
			   else
			   {
				System.out.print(" ");
				
			   }
		     }
		System.out.println("");
	}

}
	}
}
	