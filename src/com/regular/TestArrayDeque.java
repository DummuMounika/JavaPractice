package com.regular;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestArrayDeque {

	public static void main(String[] args) {
		//Creating Deque and adding elements  
		   Deque<String> deque = new ArrayDeque<String>();  
		   deque.add("Ravi");    
		   deque.add("Vijay");     
		   deque.add("Ajay");
		   deque.offer("arvind");
		   deque.offerFirst("jai");  
		   System.out.println("After offerFirst Traversal...");  
		   //Traversing elements  
		   for (String str : deque) {  
		   System.out.println(str);  
		   }  
		   deque.pollLast();  
		   System.out.println("After pollLast() Traversal...");  
		   for (String str : deque) {  
			   System.out.println(str);  
			   }  
	}

}
