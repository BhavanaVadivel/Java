package com.kodnest.arrays.level1;

import java.util.Scanner;

public class Solution1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the element "+i);
			arr[i]=sc.nextInt();
		}
		display(n,arr);
	}
	public static void display(int n,int arr[]) {
		System.out.println("The Array contents are ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
