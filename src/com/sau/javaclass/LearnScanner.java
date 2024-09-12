package com.sau.javaclass;

import java.util.Scanner;

public class LearnScanner {
	public static void main(String[] args) {

		//		Scanner scanner = new Scanner(System.in);
		//		System.out.println("Please enter your name");
		//		String name = scanner.next();
		//      String name = scanner.nextLine();
		//		System.out.println("Hello " +name);
		//		
		//		Scanner scanner1 = new Scanner(System.in);
		//		System.out.println("enter a number");
		//		int numb = scanner1.nextInt();
		//		System.out.println("Entered number "+numb);
		//		
		//		Scanner scanner2 = new Scanner(System.in);
		//		System.out.println("Are you Indian ?");
		//		boolean youIndian = scanner2.nextBoolean();
		//		System.out.println("I acknowledge as "+youIndian);

		Scanner scanner3 = new Scanner(System.in);
		System.out.println("Enter your calorie intake per day ?");
		double calorie = scanner3.nextDouble();
		System.out.println("You eat " + calorie + " calories per day.");

	}
}
