package com.kodnest.strings.level4;

import java.util.Arrays;

public class Program1Anagram {
	//Approach 1
	/*static boolean isAnagram(String a, String b) {
		if(a.length()!=b.length())
			return false;
		int suma=0;
		int sumb=0;
		
		b=b.toLowerCase();
		char[] arra=a.toLowerCase().toCharArray();
		char[] arrb=b.toCharArray();      
		for(int i=0;i<a.length();i++)
		{
			suma+=arra[i];
			sumb+=arrb[i];
		}
		if(suma==sumb)
			return true;

		return false;
	}*/
	//Approach 2
	static boolean isAnagram(String str1,String str2)
	{
		char[] arr1 = str1.toLowerCase().toCharArray();
		char[] arr2 = str2.toLowerCase().toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for(int i=0;i<=arr1.length-1;i++)
		{
			if(arr1[i]!=arr2[i])
			{
				return false;
			}
			else
			{
				continue;
			}
		}
		return true;
	}
}
