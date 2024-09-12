package com.assignments;

//For User Input - Import Scanner class
import java.util.Scanner; 

//Main Class for Time Converter
class Part2_TimeConverter {
     
	//Main Method
	 public static void main(String[] args) {
		    //To read input from user - Create a promptScanner object
	        Scanner promptScanner = new Scanner(System.in);

	        //Ask user to enter the total number of seconds and define the variable and read the input as Integer
	        System.out.print("Please enter the total number of seconds: ");
	        
	        int inputSeconds = promptScanner.nextInt();

	        int outputHours = inputSeconds / 3600;
	        
	        int outputMinutes = (inputSeconds % 3600) / 60;
	        
	        int outputSeconds = inputSeconds % 60;

	        //Display the result in hours, minutes, and seconds
	        System.out.printf("The time is %d hours, %d minutes, and %d seconds.\n", outputHours, outputMinutes, outputSeconds);
	        
	    }
	}


   
