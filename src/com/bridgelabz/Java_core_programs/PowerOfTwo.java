package com.bridgelabz.java_core_programs;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number till the power of 2 required :");
		int N = scanner.nextInt();
		int POWER_OF_TWO = 1;
		if(0<=N && N<31)
		{
			for(int i = 1; i<=N;i++)
			{
				POWER_OF_TWO = POWER_OF_TWO * 2;
				System.out.println(i+" "+POWER_OF_TWO);
			}
		}
		else
		{
			System.out.println("overflow of integer type");
		}
	}
}
