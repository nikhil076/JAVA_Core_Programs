package com.bridgelabz.java_core_programs;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to check for its prime factors");
		int N = scanner.nextInt();
		
		for(int i = 2; i< N; i++) {
	         while(N%i == 0) {
	            System.out.println(i+" ");
	            N = N/i;
	         }
	      }
	      if(N >2) {
	         System.out.println(N);
	      }
	}

}
