package com.regular;
public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = new int[4];
		nums[0] = 7;
		nums[1] = 6;
		nums[2] = 9;
		nums[3] = 1;
		
		//for each loop
		//Enhanced Forloop
        for(int n: nums) {
        	System.out.println(n);
        }
	}

}
