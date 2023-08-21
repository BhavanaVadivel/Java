package MethodsWithControlConstruct;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to which you need to calculate sum");
		int num = sc.nextInt();
		int res = factorial(num);
		System.out.println("The sum of the factorials is "+res);
	}
	public static int factorial(int num) {
		int sum =0;
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact = fact*i;
		    sum = sum+fact;
		}
		return sum;
	}
}
