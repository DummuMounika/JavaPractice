package com.regular;

public class CreationOfArray {

	public static void main(String[] args) {
		
		//numbering starts from '0'
		int nums[] = {3,4,5,2}; 
		//System.out.println(nums[2]);
		//updating the value
		nums[2] = 7;
//		System.out.println(nums[2]);
//		System.out.println(nums[0]);
		for(int i=0;i<nums.length;i++){
			System.out.println(nums[i]); 
		}
	
		System.out.println("-------");
		//Dynamic declaration
		int nums1[] = new int[4];
		nums1[0] = 9;
		nums1[1] = 8;
		nums1[2] = 1;
		nums1[3] = 10;
		
		for(int i=0;i<4;i++) {
			System.out.println(nums1[i]);
		}
	}

}
