package com.kodnest.arrays.practice1;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of array elements");
		int arr[]=new int[sc.nextInt()];
		System.out.println("Enter "+arr.length+" of elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int res = findEven(arr);
		System.out.println("The number of even numbers are "+res);
	}
	public static int findEven(int arr[]) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				count++;
				//System.out.println("The number "+arr[i]+" is even");
			}
		}
		return count;
	}
}
