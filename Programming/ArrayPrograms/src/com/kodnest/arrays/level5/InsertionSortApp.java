package com.kodnest.arrays.level5;

import java.util.Scanner;

public class InsertionSortApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Length");
		int arr[]=new int[sc.nextInt()];
		System.out.println("Enter "+arr.length+" Number of Elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array Elements Before Sorting");
		for (int a : arr) {
			System.out.print(a+" ");
		}
		System.out.println();
		InsertionSort ss = new InsertionSort();
		ss.insertionSort(arr);
		System.out.println("Array Elements After Sorting");
		for (int a : arr) {
			System.out.print(a+" ");
		}
	}

}
