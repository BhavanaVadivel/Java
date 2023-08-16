package com.kodnest.arrays.practice1;

import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number to find factorial");
			int num = sc.nextInt();
			int res = factorial(num);
			System.out.println("Factorial of num "+num +" is "+res);
	}
	public static int factorial(int num) {
		int fact = 1;
		for(int i=2;i<=num;i++) {
			fact = fact*i;
		}
		return fact;
	}
}
