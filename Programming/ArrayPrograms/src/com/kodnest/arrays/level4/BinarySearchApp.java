package com.kodnest.arrays.level4;

import java.util.Scanner;

public class BinarySearchApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of array elements");
		int arr[]=new int[sc.nextInt()];
		System.out.println("Enter "+arr.length+" of elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the key");
		int key=sc.nextInt();
		BinarySearch bs=new BinarySearch();
		int res = bs.binarySearch(arr, key);
		if(res==-1) {
			System.out.println("Key not Found");
		}
		else {
			System.out.println("Key Found At Index "+res);
		}
	}

}
