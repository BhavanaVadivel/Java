package com.kodnest.arrays.practice1;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of array elements");
		int arr[]=new int[sc.nextInt()];
		System.out.println("Enter "+arr.length+" of elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array Elements are");
		for (int a : arr) {
			System.out.print(a+" ");
		}
		System.out.println();
		int res = findMinimum(arr);
		System.out.println("The smallest element in the array is "+res);
	}
	public static int findMinimum(int arr[]) {
		int min = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}

}
