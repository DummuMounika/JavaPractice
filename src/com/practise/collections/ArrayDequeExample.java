package com.practise.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
	public static void main(String[] args) {  
	//Creating Deque and adding elements  
	Deque<String> deque = new ArrayDeque<>();
	deque.add("Ravi");    
	deque.add("Vijay");     
	deque.add("Ajay");  
	deque.offer("monu");  
    deque.offerFirst("venu");  
	//Traversing elements  
	for (String str : deque) {  
	System.out.println(str);  
	}  
	
	deque.pollLast();  
	System.out.println("After pollLast() Traversal...");  
    for(String s:deque){  
        System.out.println(s);  
    }  


}
}