package com.assignments;
import java.util.Scanner;

public class WorkerPaymentCalculator {

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object for input
        int noOfEmployees = 0;  // Initialize the counter for the total number of employees
        double finalSalary = 0.0;  // Initialize the accumulator for the total salary

        while (true) {  // Start an infinite loop
            System.out.print("Enter your working hours: ");
            double hours = scanner.nextDouble();  // Read the working hours from the user

            if (hours == -1) {  // Check for the sentinel value to end input
                break;  // Exit the loop if the sentinel value is entered
            }

            System.out.print("Enter hourly wage: ");
            double wage = scanner.nextDouble();  // Read the hourly wage from the user

            double salary;  // Declare a variable to store the salary

            if (hours <= 40) {  // Check if hours are 40 or less
                salary = hours * wage;  // Calculate salary without overtime
            } else {
                double overtimeHours = hours - 40;  // Calculate overtime hours
                salary = (40 * wage) + (overtimeHours * wage * 1.5);  // Calculate salary with overtime pay
            }

            System.out.printf("Salary is $%.2f%n", salary);  // Print the calculated salary

            noOfEmployees++;  // Increment the employee counter
            finalSalary += salary;  // Add the salary to the total salary accumulator
        }


        if (noOfEmployees > 0) {  // Check if there were any employees processed
            double averageSalary = finalSalary / noOfEmployees;  // Calculate the average salary
            System.out.printf("Number of employee: %d%n", noOfEmployees);  // Print the total number of employees
            System.out.printf("Total salary: $%.2f%n", finalSalary);  // Print the total salary
            System.out.printf("Average salary: $%.2f%n", averageSalary);  // Print the average salary
        } else {
            System.out.printf("No employee data was entered.%n");  // Print a message if no employees are there.
        }
    }
}
