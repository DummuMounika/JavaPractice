package com.algorithm.searching;

public class BinarySearch {

	public static void main(String[] args) {
		BinarySearch Obj1 = new BinarySearch();
		int arr[] = {1,5,7,65,87};
		int target = 87;
	    int result = Obj1.binarySearchRecursive(arr, 0, arr.length-1, target);
 		//int result = Obj1.binarySearchIterative(arr, 0, arr.length-1, 5);
 		if (result != -1) {
 			System.out.println("Element found at index:" +result);
 		}else {
 			System.out.println("Element not found in the array");
 		}
	}
	
	public int binarySearchIterative(int arr[],int low,int high,int target) {
		while (low <= high) {
			int mid = low + (high-low)/2;
			if (arr[mid] == target) {
				return mid;
			}
			else if (target > arr[mid]) {
				low = mid +1;
			}
			else {
				high = mid -1;
			}
		}
		return -1;	
	}
	
	public int binarySearchRecursive(int arr[],int low,int high,int target) {
		if (low <= high) {
			int mid = low + (high-low)/2;
			if (arr[mid] == target) {
				return mid;
			}
			else if (target > arr[mid]) {
				return binarySearchRecursive(arr,mid +1,high,target);
			}
			else {
				return binarySearchRecursive(arr,low,mid-1,target);
			}
		}
		return -1;	
	}
	
}
