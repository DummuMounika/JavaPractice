package com.practise.collections;
import java.util.*;
public class VectorExample {
	public static void main(String args[]){      
		  Vector<String> v=new Vector<String>();//creating vector  
		  v.add("umesh");//method of Collection  
		  v.addElement("irfan");//method of Vector  
		  v.addElement("kumar");  
		  //traversing elements using Enumeration  
		  Enumeration e=v.elements();  
		  while(e.hasMoreElements()){  
		   System.out.println(e.nextElement());  
		  }  
		  
		  System.out.println(v.clone());
		  System.out.println(v.get(0));
	}
}