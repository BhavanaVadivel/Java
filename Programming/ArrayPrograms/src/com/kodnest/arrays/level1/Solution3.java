package com.kodnest.arrays.level1;

import java.util.Scanner;

public class Solution3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int arr[]=new int[sc.nextInt()];
		System.out.println("Enter "+arr.length+" Elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("The Array Contents are ");
		/*for(int i=0;i<arr.length;i++) {
			if(arr[i]>=0) {
				System.out.print(arr[i]+" ");
			}
		}*/
		for (int i : arr) {
			if(i>=0)
			System.out.print(i+" ");
		}
	}

}
