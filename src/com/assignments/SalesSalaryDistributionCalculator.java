package com.assignments;

import java.util.Scanner;

public class SalesSalaryDistributionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Array to hold counters for each salary range
        int[] salaryRanges = new int[9]; // Index 0 for $200-299, Index 1 for $300-399, ..., Index 8 for $1000+
        
        // Loop to input sales and calculate salaries
        while (true) {
            System.out.print("Enter sales amount (or -1 to end): ");
            int sales = scanner.nextInt();
            
            if (sales == -1) {
                break;
            }
            
            // Calculate salary
            double salary = 200 + 0.09 * sales;
            
            // Determine the salary range and update corresponding counter
            if (salary >= 200 && salary < 300) {
                salaryRanges[0]++;
            } else if (salary >= 300 && salary < 400) {
                salaryRanges[1]++;
            } else if (salary >= 400 && salary < 500) {
                salaryRanges[2]++;
            } else if (salary >= 500 && salary < 600) {
                salaryRanges[3]++;
            } else if (salary >= 600 && salary < 700) {
                salaryRanges[4]++;
            } else if (salary >= 700 && salary < 800) {
                salaryRanges[5]++;
            } else if (salary >= 800 && salary < 900) {
                salaryRanges[6]++;
            } else if (salary >= 900 && salary < 1000) {
                salaryRanges[7]++;
            } else if (salary >= 1000) {
                salaryRanges[8]++;
            }
        }
        
        // Displaying the results
        System.out.println("\nSalary distribution:");
        System.out.println("$200-299: " + generateStars(salaryRanges[0]));
        System.out.println("$300-399: " + generateStars(salaryRanges[1]));
        System.out.println("$400-499: " + generateStars(salaryRanges[2]));
        System.out.println("$500-599: " + generateStars(salaryRanges[3]));
        System.out.println("$600-699: " + generateStars(salaryRanges[4]));
        System.out.println("$700-799: " + generateStars(salaryRanges[5]));
        System.out.println("$800-899: " + generateStars(salaryRanges[6]));
        System.out.println("$900-999: " + generateStars(salaryRanges[7]));
        System.out.println("$1000+: " + generateStars(salaryRanges[8]));
        
        scanner.close();
    }
    
    // Helper method to generate stars based on count
    private static String generateStars(int count) {
        StringBuilder stars = new StringBuilder();
        for (int i = 0; i < count; i++) {
            stars.append("*");
        }
        return stars.toString();
    }
}
