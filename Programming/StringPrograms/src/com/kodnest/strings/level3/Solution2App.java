package com.kodnest.strings.level3;

import java.util.Scanner;

public class Solution2App {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String str=scan.nextLine();
		System.out.println("Original String is "+str);
		String res= str.replace(" ","99");
		//Solution2ReplaceCharacters r = new Solution2ReplaceCharacters();
		//String res = r.replace(str);
		System.out.println("Replaced string is "+res);
	}

}

