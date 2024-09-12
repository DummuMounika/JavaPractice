package com.assignments;

import java.util.Scanner;

public class VehicleAvgSpeed {
	//Method to calculate average speed
	public static int calucateAvgSpeed (int tMiles,int tHours) {
		//Calculate the average speed
		int tAvgSpeed = tMiles/tHours;
		//Return the average speed
		return tAvgSpeed;
	}
	//Main Method
	public static void main(String[] args) {
		Scanner promptScanner = new Scanner(System.in);
		
        //Prompt the user to enter the number of trips
        System.out.print("Enter number of trips: ");
        int tripsToGo = promptScanner.nextInt();
        
        //Initialize variables to store total miles and total hours
        int totMiles = 0;
        int totHours = 0;
        int tripNumber = 1; // Variable to keep track of the current trip number
        
        
        //Loop to get input for each trip
        while (tripNumber <= tripsToGo) {
        	//Prompt the user to enter miles for the current trip
            System.out.print("Enter miles for trip " + tripNumber + ": ");
            int miles = promptScanner.nextInt();
            
            //Prompt the user to enter hours for the current trip
            System.out.print("Enter hours for trip " + tripNumber + ": ");
            int hours = promptScanner.nextInt();
            
            //Update total miles and total hours
            totMiles += miles;
            totHours += hours;
            tripNumber++; //Increment trip number
        }
        
        //Calculate average speed using the method
        int averageSpeed = calucateAvgSpeed(totMiles, totHours);
        
        //Output the result
        System.out.println("You drive " + totMiles + " miles in " + totHours + " hours. Your speed is " + averageSpeed + " miles/hour.");
        

	}

}
