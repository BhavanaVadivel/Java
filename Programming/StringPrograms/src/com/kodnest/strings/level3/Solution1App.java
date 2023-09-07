package com.kodnest.strings.level3;

import java.util.Scanner;

public class Solution1App {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String str=scan.nextLine();
		String str2 = new String();
		for(int i=0;i<str.length();i++) {
			if(!str2.contains(String.valueOf(str.charAt(i)))) {
				str2=str2+str.charAt(i);
			}
		}
		System.out.println(str2);
	}
	
}


