package com.regular;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class TestArrayList2 {
	public static void main(String[] args) {
		//Creating a list of numbers
		ArrayList <Integer> list = new ArrayList<Integer>();
		list.add(21);
		list.add(11);
		list.add(31);
		list.add(41);
		list.add(51);
		System.out.println("Sorting numbers...");  
		Collections.sort(list);
		for(Integer number:list)
			System.out.println(number);
		
		//Here, element iterates in reverse order
		System.out.println("Traversing list through List Iterator:");  
		ListIterator<Integer> list1 = list.listIterator(list.size());
		while(list1.hasPrevious())
		{
			Integer num = list1.previous();
			System.out.println(num);
		}
		//For loop
		 System.out.println("Traversing list through for loop:");  
         for(int i=0;i<list.size();i++)  
         {  
          System.out.println(list.get(i));     
         }
         //ForEach() method with lambda expression
         System.out.println("Loop is printing by lambda expression");  
         list.forEach(a ->{
        	 System.out.println(a);
         });
         
         
		
	}

}
