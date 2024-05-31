package com.regular;

public class ForLoop {
	public static void main(String a[]) {
		//for loop with increment
		for(int i=0;i<=4;i++) 
		{
			System.out.println("Hi" +i);
			
		}
		//for loop with decrement
		for(int j=4;j>=0;j--)
		{
			System.out.println("Bye" +j);
		}
		//Nested for loop
		for(int i=1;i<=5;) 
		{
			System.out.println("DAY " +i);
			
			for(int j=1;j<=9;j++) 
			{
				System.out.println("   "+ (j+8)+"-"+(j+9));
			}
			i++;	
		}
		
		
	}

}
