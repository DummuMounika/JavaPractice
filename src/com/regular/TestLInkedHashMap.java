package com.regular;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestLInkedHashMap {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> hm = new LinkedHashMap<Integer,String>();
		hm.put(100,"Mounika");
		hm.put(101,"Venu");
		hm.put(102,"Akhila");
		
//		for(Map.Entry m:hm.entrySet()) {
//			System.out.println(m.getKey()+""+m.getValue());
//		}
		 //Fetching key  
	       System.out.println("Keys: "+hm.keySet());  
	       //Fetching value  
	       System.out.println("Values: "+hm.values());  
	       //Fetching key-value pair  
	       System.out.println("Key-Value pairs: "+hm.entrySet()); 
	       
	       System.out.println("Before invoking remove() method: "+hm);     
	       hm.remove(102);  
	       System.out.println("After invoking remove() method: "+hm);
	       
	     //Creating map of Books    
	       Map<Integer,Book> map=new LinkedHashMap<Integer,Book>();
	       //Creating Books    
	       Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);    
	       Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
	       Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
	       //Adding Books to map   
	       map.put(2,b2);  
	       map.put(1,b1);  
	       map.put(3,b3);  
	         
	       //Traversing map  
	       for(Map.Entry<Integer, Book> entry:map.entrySet()){    
	           int key=entry.getKey();  
	           Book b=entry.getValue();  
	           System.out.println(key+" Details:");  
	           System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   
	       }
	       }

}
