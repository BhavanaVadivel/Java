package com.kodnest.strings.level4;

import java.util.Scanner;

public class Program1AnagramApp {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Two Strings");
		String a = scan.next();
		String b = scan.next();
		//scan.close();
		boolean res = Program1Anagram.isAnagram(a, b);
		System.out.println( (res) ? "Anagrams" : "Not Anagrams" );
	}
}
