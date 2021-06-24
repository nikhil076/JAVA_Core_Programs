package com.bridgelabz.java_core_programs;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number to check if it odd or even :");
		int NUMBER = scanner.nextInt();
		
		if(NUMBER%2 ==0)
		{
			System.out.println(NUMBER+" is an even Number");
		}
		else
			System.out.println(NUMBER+" is an odd number");
	}
}
