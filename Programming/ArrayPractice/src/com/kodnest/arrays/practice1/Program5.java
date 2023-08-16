package com.kodnest.arrays.practice1;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length");
		int arr[]=new int[sc.nextInt()];
		System.out.println("Enter the income from transaction");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int res = sumOfPositiveNumbers(arr);
		System.out.println("Sum of positive Numbers is "+res);
	}
	public static int sumOfPositiveNumbers(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0)
			sum=sum+arr[i];
		}
		return sum;
	}

}
