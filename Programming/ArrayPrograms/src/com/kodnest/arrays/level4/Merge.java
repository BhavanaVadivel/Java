package com.kodnest.arrays.level4;

public class Merge {
	int[] mergeArray(int arr1[],int arr2[]) {
		int arr3[]=new int[arr1.length+arr2.length];
		int i=0;
		int index=0;
		while(i<arr1.length) {
			arr3[index]=arr1[i];
			i++;
			index++;
		}
		i=0;
		while(i<arr2.length) {
			arr3[index]=arr2[i];
			i++;
			index++;
		}
		return arr3;
	}
}
