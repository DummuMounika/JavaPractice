package com.assignments;

//For User Input - Import Scanner class
import java.util.Scanner; 

//Main Class for BMR calculations
class Part1_BMRCalculator {
	
	
	//Method to calculate Men's BMR
	public static double calculateMenBmr(double manWeight, double manHeight, int manAge) {
		//Calculate Men BMR by given formula
		return 66.47 + (13.75 * manWeight / 2.2) + (5.0 * manHeight * 2.54) - (6.75 * manAge);
	}
	    
	//Method to calculate Woman's BMR
	public static double calculateWomanBmr(double womanWeight, double womanHeight, int womanAge) {
		//Calculate Woman BMR by given formula
		return 665.09 + (9.56 * womanWeight / 2.2) + (1.84 * womanHeight * 2.54) - (4.67 * womanAge);
	}
    
	//Main Method
	public static void main(String[] args) {
		
		//To read input from user - Create a promptScanner object
		Scanner promptScanner = new Scanner(System.in);
		
		/*
		 Woman's BMR Calculation
		 */
		
		//Ask user to enter woman's weight and define the variable and read the input
  		System.out.print("Please enter the woman's weight in pounds: ");
        double womanWeight= promptScanner.nextDouble();
        //Ask user to enter woman's height and define the variable and read the input
        System.out.print("Please enter the woman's height in inches: ");
        double womanHeight = promptScanner.nextDouble();
        //Ask user to enter woman's age and define the variable and read the input
        System.out.print("Please enter the woman's age in years: ");
        int womanAge = promptScanner.nextInt();
        
        //Calculate and display woman's BMR using the provided inputs
        double bmrWoman = calculateWomanBmr(womanWeight, womanHeight, womanAge);
        
        //Display the Woman BMR formatted to 2 decimal places
        System.out.printf("Her BMR is %.2f%n", bmrWoman);
        
        /*
		 Men's BMR Calculation
		 */
        
		//Ask user to enter men's weight and define the variable and read the input
		System.out.print("Please enter the men's weight in pounds: ");
        double menWeight= promptScanner.nextDouble();
        //Ask user to enter men's height and define the variable and read the input
        System.out.print("Please enter the men's height in inches: ");
        double menHeight = promptScanner.nextDouble();
        //Ask user to enter men's age and define the variable and read the input
        System.out.print("Please enter the men's age in years: ");
        int menAge = promptScanner.nextInt();
        
        //Calculate and display men's BMR using the provided inputs
        double bmrMen = calculateMenBmr(menWeight, menHeight, menAge);
        
        //Display the men BMR formatted to 2 decimal places
        System.out.printf("His BMR is %.2f%n", bmrMen);
        
        	
	}
    

}
