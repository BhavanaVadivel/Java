package com.kodnest.strings.level3;

public class Solution2ReplaceCharacters {
	String replace(String str) {
		char arr[]= str.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==' ') {
				arr[i]=(int)99;
			}
		}
		str = new String(arr);
		return str;
	}
}
