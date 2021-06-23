package com.bridgelabz.Java_core_programs;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Nth number to check for harmonic value :");
		int N = sc.nextInt();
 
        System.out.print(nthHarmonic(N));
 
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
