package com.regular;

public class MultiDimensionalArray {
	public static void main(String[] args) {
		int nums[][] = new int[3][4];
		
		//random values comes with double type:
				for(int i=0;i<3;i++)
				{
					for(int j=0;j<4;j++)
					{
						nums[i][j] = (int)(Math.random() * 10);
//						System.out.print(nums[i][j] + " ");
					}
					//System.out.println();
				}
	    //For 0 elements printing
//		for(int i=0;i<3;i++)
//		{
//			for(int j=0;j<4;j++)
//			{
//				System.out.print(nums[i][j] + " ");
//			}
//			System.out.println();
//		}
		
	    //Enhaced for loop
		for(int n[]: nums) //n is array
		{
			for(int m: n)
			{
				System.out.print(m + " ");
			}
		    System.out.println();
		}
		
		
		
	}

}
