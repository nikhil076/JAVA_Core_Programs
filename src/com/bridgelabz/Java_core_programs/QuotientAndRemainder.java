package com.bridgelabz.Java_core_programs;

import java.util.Scanner;

public class QuotientAndRemainder {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the divisor :");
		int Divisor = sc.nextInt();
		System.out.println("Enter the Dividend :");
		int Dividend = sc.nextInt();
		int remainder = Divisor % Dividend;
		int quotient = Divisor / Dividend;
		System.out.println("The quotient is :"+quotient);
		System.out.println("The reaminder is :"+remainder);
	}
}
