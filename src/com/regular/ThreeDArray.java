package com.regular;
public class ThreeDArray {

    public static void main(String[] args) {
        // Declare and initialize a three-dimensional array
        int[][][] nums = new int[3][4][5];

        // Populate the array with random integer values
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                for (int k = 0; k < nums[i][j].length; k++) {
                    nums[i][j][k] = (int) (Math.random() * 10);
                }
            }
        }

        // Access and print the elements of the array
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                for (int k = 0; k < nums[i][j].length; k++) {
                    System.out.print(nums[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

}
