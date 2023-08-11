package com.kodnest.arrays.level2;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int arr[]=new int[sc.nextInt()];
		System.out.println("Enter "+arr.length+" Elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter 2 indexes whose elements has to be swapped");
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("Before Swapping");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		int temp = arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
		System.out.println("After Swapping");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
