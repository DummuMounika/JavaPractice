package com.algorithm.sorting;

public class BubbleSorting {

	public static void main(String[] args) {
		BubbleSorting obj1 = new BubbleSorting();
		int arr[] = {7,9,5,8,1};
		int result[] = obj1.BubbleSortingIterative(arr);
		
		//System.out.println(result);
		
		System.out.println("Sorted array: ");
		for (int i=0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}

	}
	
	public  int[] BubbleSortingIterative(int arr[]) {
		for (int i=0;i < arr.length-1;i++) {
			for (int j=0;j <(arr.length-i-1);j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
		
	}

}
