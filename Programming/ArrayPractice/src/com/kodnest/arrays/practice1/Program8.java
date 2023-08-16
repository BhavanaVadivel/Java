package com.kodnest.arrays.practice1;

import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length");
		int arr[]=new int[sc.nextInt()];
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		findPrime(arr);
			}
	public static void findPrime(int arr[]) {
		for(int i=2;i<arr.length-1;i++) {
			if(arr[i]%i!=0) {
				System.out.println("The number "+arr[i]+" is prime number");
			}
		}
	}
}
