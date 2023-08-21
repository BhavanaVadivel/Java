package MethodsWithControlConstruct;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check sum of perfect numbers");
		int num = sc.nextInt();
		int res = checkPerfect(num);
		System.out.println("The sum of the perfect numbers is "+res);
	}
	public static int checkPerfect(int num) {
		int sum=0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				sum = sum+i;
				System.out.println(i);
			}
		}
		return sum;
	}
}
