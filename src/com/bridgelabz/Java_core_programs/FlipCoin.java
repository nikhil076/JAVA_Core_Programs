package com.bridgelabz.Java_core_programs;

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of flips required :");
		int NUMBER_OF_FLIPS = sc.nextInt();
		int HEAD = 1;
		int HEAD_COUNT = 0;
		
		if(NUMBER_OF_FLIPS>0)
		{
			for(int i=0;i<NUMBER_OF_FLIPS;i++)
			{
				double FLIP = Math.floor(Math.random() * 10) % 2 ;
				if(FLIP == HEAD)
				{
					HEAD_COUNT++;
				}
			}
			int HEAD_PERCENTAGE = (HEAD_COUNT*100) / NUMBER_OF_FLIPS;
			System.out.println("Head percentage is :"+HEAD_PERCENTAGE);
			int TAIL_PERCENTAGE = 100 - HEAD_PERCENTAGE;
			System.out.println("Tail percentage is :"+TAIL_PERCENTAGE);
		}
		else 
		{
			System.out.println("number of flips cannot be negative");
		}
	}

}
