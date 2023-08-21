package MethodsWithOperators;

import java.util.Scanner;

public class LogicalOperatorValidator_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Is input valid (true/false) ");
		boolean a=sc.nextBoolean();
		System.out.println("Does input meet a certain condition (true/false):");
		boolean b=sc.nextBoolean();
		isValidInput(a,b);
	}
	static void isValidInput(boolean a,boolean b) {
		if(a && b==true) {
			System.out.println("Input is valid.");
		}
		else if(a || b==false){
			System.out.println("Input is not valid.");
		}
		else {
			System.out.println("Input is not valid.");
		}
	}
}
