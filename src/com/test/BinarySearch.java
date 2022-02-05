package com.test;

public class BinarySearch {
	public static int binarySearch(int [] arr, int low, int high, int element) {
		if(high >= low) {
			int mid = low + (high - low)/2;
			if(arr[mid] == element)
				return mid;
			if(arr[mid] > element)
				return binarySearch(arr, low, mid -1 , element);
			return binarySearch(arr, mid + 1, high, element);
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8};
		System.out.println("Index of 4: "+binarySearch(arr, 0, arr.length -1 , 6));

	}
}
