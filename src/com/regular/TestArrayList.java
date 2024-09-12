package com.regular;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("Ravi");//Adding object in arraylist  
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay"); 
		
		//Traversing list through Iterator  
		Iterator itr=list.iterator();  
		
		while(itr.hasNext()){ 
			System.out.println(itr.next());
		}
		
		for( String listString : list) {
			System.out.println(listString);
		}
		  
	}

}
