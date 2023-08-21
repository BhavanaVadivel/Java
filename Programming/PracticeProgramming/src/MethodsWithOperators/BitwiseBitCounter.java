package MethodsWithOperators;

import java.util.Scanner;

public class BitwiseBitCounter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer:");
		int n=sc.nextInt();
		int res = countSetBits(n);
		System.out.println("Number of set bits:"+res);
	}
	static int countSetBits(int n) {
		int count=0;
		while(n>0) {
			count+=n & 1;
			n>>=1;
		}
		return count;
	}
}
