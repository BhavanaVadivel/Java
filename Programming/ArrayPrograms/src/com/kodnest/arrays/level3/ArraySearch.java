package com.kodnest.arrays.level3;
import java.util.Scanner;
public class ArraySearch {

	public static void main(String[] args) {
		
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter Array Length");
			int arr[]=new int[scan.nextInt()];
			System.out.println("Enter "+arr.length+" number of elements");
			for(int i=0;i<=arr.length-1;i++)
			{
			arr[i]=scan.nextInt();
			}
			System.out.println("Enter target to serach");
			int key=scan.nextInt();
			Search search=new Search();
			boolean res=search.isPresent(arr,key);
			if(res==true)
			{
			System.out.println("Targer Found in Array");
			}
			else
			{
			System.out.println("Target Not Found");
			}
			}
	
}
