package com.practise.collections;
import java.util.*;  

public class PriorityQueueExample {
	public static void main(String[] args){ 
		Queue<String> queue = new PriorityQueue<>();
		queue.add("Amit");  
		queue.add("Vijay");  
		queue.add("Karan");  
		queue.add("Jai");  
		queue.add("Rahul");  
		queue.offer("Mounika");
		System.out.println("head:"+queue.element());  
		System.out.println("head:"+queue.peek());  
		System.out.println("iterating the queue elements:");
		
		Iterator itr=queue.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		
		queue.remove();  
		queue.poll();  
		queue.element();
		
		System.out.println("after removing two elements:");  
		Iterator<String> itr2=queue.iterator();  
		while(itr2.hasNext()){  
		System.out.println(itr2.next());  
		}  	
		
	}

}
