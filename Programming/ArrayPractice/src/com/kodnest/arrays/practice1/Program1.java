package com.kodnest.arrays.practice1;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Students");
		int arr[]=new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter "+i+" Student's Grade");
			arr[i]=sc.nextInt();
		}
		int res = countingGrades(arr);
		System.out.println("The number of students scored above 75 are "+res);
	}
	public static int countingGrades(int arr[]) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>75) {
				count++;
			}
		}
		return count;
	}
}
