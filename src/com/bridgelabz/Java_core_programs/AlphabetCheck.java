package com.bridgelabz.Java_core_programs;

import java.util.Scanner;

public class AlphabetCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character to check if it is vowel or consonant : ");
		char CHARACTER = sc.next().charAt(0);
		
		if(CHARACTER == 'a' || CHARACTER == 'e' || CHARACTER == 'i' || CHARACTER == 'o' || CHARACTER == 'u')	
		{
			System.out.println(CHARACTER+" is a vowel");
		}
		else
			System.out.println(CHARACTER+" is a consonant");
	}
}
