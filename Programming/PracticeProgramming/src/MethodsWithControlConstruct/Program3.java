package MethodsWithControlConstruct;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two range of numbers in which you need to find the prime numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		for(int i=a;i<=b;i++) {
			int res = findPrime(i);
			if(res!=0) {
			System.out.print(res+" ");
			}
		}
	}
	public static int findPrime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return 0;
			}
		}
		return n;
	}
}
