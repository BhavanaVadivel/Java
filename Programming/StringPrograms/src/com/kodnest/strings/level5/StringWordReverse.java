package com.kodnest.strings.level5;
import java.util.Scanner;
import java.util.regex.Pattern;
public class StringWordReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		String res = reverseWords(str);
		System.out.println(res);
	}

	// Method to reverse words of a String
	static String reverseWords(String str)
	{
		Pattern pattern = Pattern.compile("\\s");

		String[] temp = pattern.split(str);
		String result = "";

		for (int i = 0; i < temp.length; i++) {
			if (i == temp.length - 1)
				result = temp[i] + result;
			else
				result = " " + temp[i] + result;
		}
		return result;
		//return new String(result);
	}
	/*
	    public static void main(String[] args) {
	        String input = "hello world";
	        String[] words = input.split(" ");
	        
	        StringBuilder reversedString = new StringBuilder();
	        
	        for (int i = words.length - 1; i >= 0; i--) {
	            reversedString.append(words[i]);
	           
	            if (i > 0) {
	                reversedString.append(" ");
	            }
	        }
	        
	        // Convert the StringBuilder back to a String
	        String output = reversedString.toString();
	        
	        // Print the reversed string
	        System.out.println("Output: " + output);
	    }
	}
*/

}

