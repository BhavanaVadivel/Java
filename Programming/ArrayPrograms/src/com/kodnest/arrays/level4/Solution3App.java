package com.kodnest.arrays.level4;

import java.util.Scanner;

public class Solution3App {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array 1 Length");
		int arr1[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr1.length+" number of elements");
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr1[i]=scan.nextInt();
		}
		//System.out.println("Enter Array 2 Length");
		int arr2[]=new int[arr1.length];
		System.out.println("Enter "+arr2.length+" number of elements");
		for(int i=0;i<=arr2.length-1;i++)
		{
			arr2[i]=scan.nextInt();
		}
		Solution3 s = new Solution3();
		int res[]=s.sumCorresponding(arr1,arr2);
		
		System.out.println("The sum of corresponding elements of the array are ..");
		for (int i : res) {
			System.out.print(i+" ");
		}
	}

}
