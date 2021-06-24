package com.bridgelabz.java_core_programs;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the 1st Number :");
		int NUMBER1 = scanner.nextInt();
		System.out.println("Enter the 2nd Number :");
		int NUMBER2 = scanner.nextInt();
				
		NUMBER1 = NUMBER2+NUMBER1;
		NUMBER2 = NUMBER1-NUMBER2;
		NUMBER1 = NUMBER1-NUMBER2;
		
		System.out.println("Number 1 is swaped to :"+NUMBER1);
		System.out.println("Number 2 is swaped to :"+NUMBER2);
	}

}
