package com.regular;

import java.util.Iterator;
import java.util.Stack;

public class TestStack {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>(); 
		// checking stack is empty or not  
		boolean result = stack.empty();
		System.out.println("Is the stack empty? " + result);  
		
		// pushing elements into stack
		stack.push("Ayush");  
		stack.push("Garvit");  
		stack.push("Amit");  
		stack.push("Ashish");  
		stack.push("Garima");  
		stack.pop();  
		Iterator<String> itr=stack.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		//prints elements of the stack  
		System.out.println("Elements in Stack: " + stack);  
		result = stack.empty();  
		System.out.println("Is the stack empty? " + result);  
		// Search an element  
		int location = stack.search("Amit");  
		System.out.println("Search Value:" +location);
		
		// Find the size of the Stack  
		int x=stack.size();  
		System.out.println("The stack size is: "+x);

	}

}
