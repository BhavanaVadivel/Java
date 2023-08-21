package MethodsWithControlConstruct;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to which you need to calculate count of divisors");
		int num = sc.nextInt();
		int res = calculateDivisor(num);
		System.out.println("The number of divisors for given number is "+res);
	}
	public static int calculateDivisor(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		return count;
	}
}
