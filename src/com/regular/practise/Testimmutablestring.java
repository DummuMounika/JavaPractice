package com.regular.practise;

public class Testimmutablestring {
	public static void main(String args[]) {
		String s = "Sachin";
//		s.concat(" Tendulkar");
//	    System.out.println(s);//will print Sachin because strings are immutable objects  
//	
		s = s.concat(" Tendular");
		System.out.println(s);
	}
	
	
	

}
