package com.kodnest.strings.level1;

import java.util.Scanner;

public class ReverseStringApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to reverse ");
		String s1=sc.nextLine();
		System.out.println("The original array is "+s1);
		ReverseString r=new ReverseString();
		String res = r.reverseArray(s1);
		System.out.println("The reversed array is "+res);
	}
}
