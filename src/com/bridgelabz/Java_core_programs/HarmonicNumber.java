package com.bridgelabz.java_core_programs;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main (String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Nth number to check for harmonic value :");
		int N = scanner.nextInt();
		if(N!=0) {
        System.out.print(nthHarmonic(N));
		}
		else
			System.out.println("Invalid input");
 
	}
	static double nthHarmonic(int N)
	{
	    float harmonic = 1;
	 
	    for (int i = 2; i <= N; i++) {
	        harmonic += (float)1 / i;
	    }
	 
	    return harmonic;
	}
}
