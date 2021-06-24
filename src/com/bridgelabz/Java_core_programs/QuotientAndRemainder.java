package com.bridgelabz.java_core_programs;

import java.util.Scanner;

public class QuotientAndRemainder {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the divisor :");
		int Divisor = scanner.nextInt();
		System.out.println("Enter the Dividend :");
		int Dividend = scanner.nextInt();
		int remainder = Divisor % Dividend;
		int quotient = Divisor / Dividend;
		System.out.println("The quotient is :"+quotient);
		System.out.println("The reaminder is :"+remainder);
	}
}
