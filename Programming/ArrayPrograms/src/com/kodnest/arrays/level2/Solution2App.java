package com.kodnest.arrays.level2;

import java.util.Scanner;

public class Solution2App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int arr[]=new int[sc.nextInt()];
		System.out.println("Enter "+arr.length+" Elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		Solution2 s = new Solution2();
		s.printArray(arr);
	}

}
