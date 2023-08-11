package com.kodnest.arrays.level1;

import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements of array");
		int arr[]=new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the element "+i);
			arr[i]=sc.nextInt();
		}
		System.out.println("The array Contents are...");
		for (int i : arr) {
			System.out.print(i+5+" ");
		}
	}

}
