package com.kodnest.arrays.level5;

import java.util.Scanner;

public class BubbleSortApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of array elements");
		int arr[]=new int[sc.nextInt()];
		System.out.println("Enter "+arr.length+" of elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array Elements  Before Sorting");
		for (int a : arr) {
			System.out.print(a+" ");
		}
		BubbleSort bs = new BubbleSort();
		bs.bubbleSort(arr);
		System.out.println();
		System.out.println("Array Elements after sorting");
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}

}
