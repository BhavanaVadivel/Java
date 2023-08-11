package com.kodnest.arrays.level3;

public class Search {
	 boolean isPresent(int arr[],int target) {
		for(int i=0;i<arr.length;i++) {
			if(target==arr[i]) {
				return true;
			}
		}
		return false;
	}
}
