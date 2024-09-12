package com.regular;

import java.util.ArrayList;

public class TestArrayList3 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("Initial list of elements: "+al);
		//Adding elements to the end of the list  
		al.add("Monu");
		al.add("Venu");
		al.add("Akhi");
		System.out.println("After invoking add(E e) method: "+al);  
		//Adding an element at the specific position
		al.add(1,"Gaurav");
		System.out.println("After invoking add(int index, E element) method: "+al);  
		
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("Rns");
		al2.add("Kavya");
		//Adding second list elements to the first list  
		al.addAll(al2);
		System.out.println("After invoking addAll(Collection<? extends E> c) method: "+al);  
	    
		ArrayList<String> al3=new ArrayList<String>();  
        al3.add("John");  
        al3.add("Rahul");  
        //Adding second list elements to the first list at specific position  
        al.addAll(1, al3);  
        System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: " +al);
	
        //Removing specific element from arraylist
        al.remove("Rahul");  
        System.out.println("After invoking remove(object) method: "+al);   
        //Removing element on the basis of specific position  
        al.remove(1);  
        System.out.println("After invoking remove(index) method: "+al);   
        
        //Creating another arraylist  
        ArrayList<String> al31=new ArrayList<String>();    
        al31.add("Ravi");    
        al31.add("Hanumat");    
        //Adding new elements to arraylist  
        al.addAll(al31);  
        System.out.println("Updated list : "+al);
        
        //Removing all the new elements from arraylist  
        al.removeAll(al31);  
        System.out.println("After invoking removeAll() method: "+al);   
	    
        //Removing elements on the basis of specified condition  
         al.removeIf(str -> str.contains("Monu"));   //Here, we are using Lambda expression   
         System.out.println("After invoking removeIf() method: "+al);  
	    
         //Removing all the elements available in the list 
         System.out.println("Before invoking clear() method: "+al);
         //isEmpty() method
         System.out.println("Is ArrayList Empty: "+al3.isEmpty());  
         al3.clear();  
         System.out.println("After invoking clear() method: "+al3); 
         System.out.println("After removing");  
         System.out.println("Is ArrayList Empty: "+al3.isEmpty());   
	}

}
