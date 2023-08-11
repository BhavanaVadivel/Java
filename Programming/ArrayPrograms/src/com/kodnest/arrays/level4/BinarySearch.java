package com.kodnest.arrays.level4;

public class BinarySearch {
	int binarySearch(int arr[],int key) {
		int low=0;
		int high=arr.length-1;
				
		while(low<=high) {
			int mid=(low+high)/2;

			if(key==arr[mid]) {
				//System.out.println("Key found at index "+mid);
				return mid;
			}
			else if(arr[mid]>key) {//key<arr[mid]
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		//System.out.println("Key Not Found");
		return -1;
	}
}