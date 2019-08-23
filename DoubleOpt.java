package com.brid;

import java.util.Scanner;

import Utility.utility;

public class DoubleOpt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		utility utility=new utility();

		double Fristnumber;
		double Secondnumber;
		double Thirdnumber;
		 
		System.out.println("Enter frist Number");

		Fristnumber=scanner.nextInt();
		System.out.println("Enter Second Number");
		Secondnumber=scanner.nextInt();
		System.out.println("Enter Third Number");
		Thirdnumber=scanner.nextInt();
		utility.doublea( Fristnumber, Secondnumber,Thirdnumber);
		scanner.close();
	}

}
