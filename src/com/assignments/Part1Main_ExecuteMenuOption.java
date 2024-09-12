package com.assignments;

import java.util.Scanner;

public class Part1Main_ExecuteMenuOption {

	public static void main(String[] args) {
		Scanner promptScanner = new Scanner(System.in);
		Part1M1_IntegerPower obj1 = new Part1M1_IntegerPower();
		Part1M2_ReverseANumber obj2 = new Part1M2_ReverseANumber();
		Part1M3_DisplayMenuOption obj3 = new Part1M3_DisplayMenuOption();
		int chooseOption;
		
		do {
			obj3.menu();
			System.out.println("Enter your option choice: ");
			chooseOption = promptScanner.nextInt();
			
			switch(chooseOption) {
			case 1:
				System.out.println("Enter number for base value: ");
				int baseValue = promptScanner.nextInt();
				
				System.out.print("Enter number for exponent value: ");
                int exponentValue = promptScanner.nextInt();
                
                int result = obj1.integerPower(baseValue, exponentValue);
                System.out.println("The Integer Power of " +baseValue + "^" + exponentValue + " is " + result);
                break;
                
			case 2:
                System.out.print("Enter an integer to reverse the integer: ");
                int number = promptScanner.nextInt();
                int reversedNumber = obj2.reverse(number);
                System.out.println("The Reversed integer is : " + reversedNumber);
                break;
                
            case 3:
                System.out.println("You Clicked Exit Option, closing....");
                break;
                
            default:
                System.out.println("You've entered invalid option. Please try again by selecting only menu options.");
      
              
			}
		} while (chooseOption != 3);
	}

}
