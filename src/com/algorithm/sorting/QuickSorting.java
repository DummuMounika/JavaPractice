package com.algorithm.sorting;

public class QuickSorting {

	public static void main(String[] args) {
		QuickSorting obj1 = new QuickSorting();
		int arr[] = {12,11,13,3,2,90,7,6,1,8,9};
		int low = 0;
		int high = arr.length -1;
	    obj1.quickSort(arr, low, high);
		
		System.out.println("Sorted array: ");
		for (int i=0;i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
	}
	
	public int partition(int arr[],int low,int high) {
		
		int pivot = arr[high];
		int i = low-1;
		
		for(int j=low;j<arr.length;j++) {
			if(arr[j]<pivot) {
				//swap i and j
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		
		i++;
		int temp = arr[i];
		arr[i] = pivot;
		arr[high] = temp;
		
		return i;
	}
	
	
	public int mergePartitionPart(int arr[],int low,int high){
		int pivot = arr[low];
		int i = low;
		int j = high;
		while (i < j) {
			
			while (i < high && arr[i] <= pivot) {
				i ++;
			}
			while (arr[j] > pivot) {
				j --;
			}
			if (i < j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		arr[low] = arr[j];
		arr[j] = pivot;
		return j;
	}
	
	public void quickSort(int arr[],int low,int high){
		
		if (low < high) {
			int pIndex = partition(arr, low, high);
			quickSort(arr, low, pIndex -1);
			quickSort(arr, pIndex + 1, high);
		}
	}

}
