package com.algorithm.sorting;

public class MergeSorting {

	public static void main(String[] args) {
		MergeSorting obj1 = new MergeSorting();
		int arr[] = {12,11,13,3,2,90,7,6,1,8,9};
		int low = 0;
		int high = arr.length -1;
	    obj1.divide(arr, low, high);
		
		System.out.println("Sorted array: ");
		for (int i=0;i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
	}
	
	
	public void divide(int [] arr, int low, int high) {
		if(low < high) {
			int mid = low + (high - low)/2;
			divide(arr ,low , mid);
			divide(arr ,mid+1 , high);
			conquer(arr, low, mid, high);	
		}
	}
	
	
	public void conquer(int arr[],int low,int mid,int high) {
		int[] newArray = new int[high-low+1];
		int i = low;
		int j = mid+1;
		int tempIndex = 0;

		while (i <= mid && j <= high) {
			if (arr[i] <= arr[j]) {
				newArray[tempIndex] = arr[i];
				tempIndex++;
				i++;
			}else {
				newArray[tempIndex] = arr[j];
				tempIndex++;
				j++;
			}
		}
		
		
		while(i <= mid) {
			newArray[tempIndex] = arr[i];
			tempIndex++;
			i++;
		}
		
		while(j <= high) {
			newArray[tempIndex] = arr[j];
			tempIndex++;
			j++;
		}
		
		
		for(int p=0, x=low; p<newArray.length; p++,x++) {
			arr[x] = newArray[p];
		}
		
		
	}

}
