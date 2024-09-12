package com.practise.collections;

import java.util.*;

public class TreeSetExample {
	public static void main(String args[]){  
		  //Creating and adding elements  
		  Set<String> al=new TreeSet<>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		 
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
//		  
//		  Iterator<String>i=al.descendingIterator();  
//	         while(i.hasNext())  
//	         {  
//	             System.out.println(i.next());  
//	         }  
//		 }  
	
	}
}

