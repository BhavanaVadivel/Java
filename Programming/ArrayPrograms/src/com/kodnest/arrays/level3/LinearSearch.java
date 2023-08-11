package com.kodnest.arrays.level3;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements of the Array");
		int arr[]=new int[sc.nextInt()];
		System.out.println("Enter "+arr.length+" Elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the key to search");
		int key = sc.nextInt();
		LinearSearch l = new LinearSearch();
		int res = l.linearSearch(arr,key);
		if(res==-1) {
			System.out.println("Key Not Found");
		}
		else {
			System.out.println("Key Found At "+res);
		}
	}
	int linearSearch(int arr[],int key) {
		for(int i=0;i<arr.length;i++) {
			if(key==arr[i]) {
				return i;
			}
		}
		return -1;
	}
}
