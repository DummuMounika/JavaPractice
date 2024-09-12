package com.algorithm.sorting;

public class InsertionSorting {

	public static void main(String[] args) {
		InsertionSorting obj1 = new InsertionSorting();
		int arr[] = {9,1,4,6,7};
		int result[] = obj1.insertionSortingIterative(arr);
		
		System.out.println("Sorted array: ");
		for (int i=0;i < result.length; i++) {
			System.out.print(result[i] + " ");
		}

	}
	
	public int[] insertionSortingIterative(int arr[]) {
		for (int i=1;i<arr.length;i++) {
			int current = arr[i];
			int j = i-1;
			while (j >= 0 && current < arr[j]) {
				arr[j+1] = arr[j];
				j -= 1;
			}
			arr[j+1] = current;
		}
		return arr;
	}

}
