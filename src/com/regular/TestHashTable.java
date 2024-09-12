package com.regular;

import java.util.Hashtable;
import java.util.Map;

public class TestHashTable {

	public static void main(String[] args) {
		Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
		  
		  hm.put(100,"Amit");  
		  hm.put(102,"Ravi");  
		  hm.put(101,"Vijay");  
		  hm.put(103,"Amit"); 
		  hm.put(101,"monu");  
		  
		  for(Map.Entry m:hm.entrySet()){  
			  System.out.println(m.getKey()+" "+m.getValue()); 
		  }
		  System.out.println("Before remove: "+ hm);    
	       // Remove value for key 102  
	       hm.remove(102);  
	       System.out.println("After remove: "+ hm);  

	       //Here, we specify the if and else statement as arguments of the method  
	       System.out.println(hm.getOrDefault(101, "Not Found"));  
	       System.out.println(hm.getOrDefault(105, "Not Found"));  
	}

}
