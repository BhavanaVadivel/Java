package com.kodnest.arrays.practice1;

import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length");
		int arr[]=new int[sc.nextInt()];
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int res = multiplyElements(arr);
		System.out.println("The multiple of all numbers is "+res);
	}
	public static int multiplyElements(int arr[]) {
		int mul=1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0)
			mul=mul*arr[i];
		}
		return mul;

	}

}
