package com.algorithm.searching;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinearSearch obj1 = new LinearSearch();
		int arr[] = {6,9,14,34,54,67,89,121};
		int target = 89;
		int N = arr.length-1;
		int result = obj1.LinearSearchIterative(arr, N, target);
		if (result != -1) {
 			System.out.println("Element found at index:" +result);
 		}else {
 			System.out.println("Element not found in the array");
 		}

	}
	
	public int LinearSearchIterative(int arr[],int N,int target) {
		for(int i=0;i<=N;i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		return -1;
	}

}
