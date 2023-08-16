package com.kodnest.arrays.practice1;

import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of array elements");
		int arr[]=new int[sc.nextInt()];
		System.out.println("Enter "+arr.length+" of elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		findDuplicate(arr);
	}
	public static void findDuplicate(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("The duplicate element is "+arr[i]);
				}
			}
		}
	}
}
