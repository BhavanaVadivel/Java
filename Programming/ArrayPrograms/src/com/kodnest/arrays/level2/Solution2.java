package com.kodnest.arrays.level2;

public class Solution2 {
	public static void printArray(int arr[]) {
		System.out.println("Forward direction");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Reverse direction");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
}
