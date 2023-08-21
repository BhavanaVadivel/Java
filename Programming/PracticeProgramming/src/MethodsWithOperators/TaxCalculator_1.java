package MethodsWithOperators;

import java.util.Scanner;

public class TaxCalculator_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the purchase amount:");
		double purchaseAmount=sc.nextDouble();
		System.out.println("Enter the tax rate (in decimal form):");
		double taxRate=sc.nextDouble();
		double res = calculateTotalWithTax(purchaseAmount,taxRate);
		System.out.println("Total cost including tax: "+res);
	}
	static double calculateTotalWithTax(double purchaseAmount,double taxRate) {
		double taxAmount=purchaseAmount * taxRate;
		double totalCost=taxAmount+purchaseAmount;
		return totalCost;
	}
}
