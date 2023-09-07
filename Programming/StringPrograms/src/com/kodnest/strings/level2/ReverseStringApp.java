package com.kodnest.strings.level2;

import java.util.Scanner;

public class ReverseStringApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String str=scan.nextLine();
		System.out.println("Original String Is "+str);
		ReverseString reverse = new ReverseString();
		String reverseStringWord = reverse.reverseStringWord(str);
		System.out.println("Reversed Words String "+reverseStringWord);


	}

}
