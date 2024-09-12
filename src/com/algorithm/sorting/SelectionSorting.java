package com.algorithm.sorting;

public class SelectionSorting {

	public static void main(String[] args) {
		SelectionSorting obj1 = new SelectionSorting();
		int arr[] = {7,8,2,5,1,4};
		int result[] = obj1.selectionSortingIterative(arr);
		
		System.out.println("Sorted array: ");
		for (int i=0;i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
	
	public int[] selectionSortingIterative(int arr[]){
		for (int i=0;i < arr.length-1;i++) {
			int smallest = i;
			for (int j=i+1;j < arr.length;j++) {
				if (arr[smallest] > arr[j]) {
					smallest = j;
				}	
			}
			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}

}
