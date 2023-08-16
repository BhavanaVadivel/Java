package com.kodnest.arrays.practice1;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[]=new int[7];
		System.out.println("Enter the Temperature for a week ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int res = temperatureRecords(arr);
		System.out.println("Average Temperature is "+res);
	}
	public static int temperatureRecords(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		int avg = sum/7;
		return avg;
	}
}
