package com.kodnest.arrays.level3;

import java.util.Scanner;

public class CalculateSumOfarray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array Length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" number of elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		int res = calculateSum(arr);
		System.out.println(res);
	}
	public static int calculateSum(int arr[]) {
		int sum=0;
		System.out.println("The sum of the elements of the array are");
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		return sum;
	}

}
