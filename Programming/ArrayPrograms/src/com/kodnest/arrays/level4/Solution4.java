package com.kodnest.arrays.level4;

public class Solution4 {
	int[] replaceNegative(int arr1[]) {
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]<0) {
				arr1[i]=0;
			}
		}
		return arr1;
	}
}
