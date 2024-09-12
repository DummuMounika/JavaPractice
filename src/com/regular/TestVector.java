package com.regular;

import java.util.Iterator;
import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();  
		//Adding elements using add() method of List  
		v.add("Ayush");  
		v.add("Amit");  
		v.add("Ashish");  
		v.add("Garima");  
		Iterator<String> itr=v.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		//Adding elements using addElement() method of Vector 
		 v.addElement("Rat");  
         v.addElement("Cat");  
         v.addElement("Deer");  
           
         System.out.println("Elements are: "+v); 
         
       //Check size and capacity  
        System.out.println("Size is: "+v.size());  
        System.out.println("Default capacity is: "+v.capacity());  
       
      //Display Vector elements again  
        System.out.println("Elements are: "+v);  
        //Checking if Rat is present or not in this vector         
          if(v.contains("RAT"))  
          {  
             System.out.println("Rat is present at the index " +v.indexOf("Rat")); 
          }else  
          {  
              System.out.println("Rat is not present in the list."); 
          }
          //Get the first element  
          System.out.println("The first element of the vector is = "+v.firstElement());   
          //Get the last element  
          System.out.println("The last animal of the vector is = "+v.lastElement());   
          //Remove the element at index 4  
          System.out.println("Remove element at index 4: " +v.remove(2));  
          System.out.println("New Value list in vector: " +v);  
          

          //Remove an element  
          v.removeElementAt(3);        
          //Checking vector and displays the element  
          System.out.println("Vector element after removal: " +v); 
         
        //Get the element at specified index  
          System.out.println("Element at index 1 is = "+v.get(1)); 
	
	
	
	}
	

}
