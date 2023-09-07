package com.kodnest.strings.level2;

public class ReverseString {
	String reverseStringWord(String str)
	{
		String wordarr[]=str.split(" ");
		String revword=null;
		String revString="";
		for(int i=0;i<=wordarr.length-1;i++)
		{
			String word=wordarr[i];
			char wa[]=word.toCharArray();
			char rwa[]=new char[wa.length];
			int j=rwa.length-1;
			for(int k=0;k<=wa.length-1;k++)
			{
				rwa[j]=wa[k];
				j--;
			}
			revword=new String(rwa);
			revString=revString+revword+" ";
		}
		return revString;
	}
	}
