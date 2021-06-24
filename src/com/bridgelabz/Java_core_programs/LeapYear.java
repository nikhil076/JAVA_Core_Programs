package com.bridgelabz.java_core_programs;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the year to check for leap year :");
		int YEAR = scanner.nextInt();
		
		if(YEAR>999 && YEAR<=9999)
		{
		      if (((YEAR % 4 == 0) && (YEAR % 100!= 0)) || (YEAR%400 == 0))
		      {
		    	  System.out.println(YEAR+" is a Leap Year");
		      }
		      else
		    	  System.out.println(YEAR+" is not a leap year");

		}
		else
		{
			System.out.println("Entered Year is not valid, should be 4 digit");
		}
	}

}
