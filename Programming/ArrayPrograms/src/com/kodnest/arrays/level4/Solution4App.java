package com.kodnest.arrays.level4;

import java.util.Scanner;

public class Solution4App {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array 1 Length");
		int arr1[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr1.length+" number of elements");
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr1[i]=scan.nextInt();
		}
		System.out.println("The Original array is");
		for(int a:arr1) {
			System.out.print(a+" ");
		}
		System.out.println();
		Solution4 s=new Solution4();
		int res[] = s.replaceNegative(arr1);
		System.out.println("The Resultant array is");
		for(int a:res) {
			System.out.print(a+" ");
		}
	}

}
