package com.regular;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestArrayList1 {

	public static void main(String[] args) {
		//Creating a list of fruits  
		ArrayList <String> list = new ArrayList<String>();
		list.add("Mango");
		list.add("Apple");
		list.add("Pear");
		list.add("Grapes");
		list.add("Banana");	

        //System.out.println(list);
		
		//Traversing list through Iterator
//		Iterator itr =list.iterator(); //getting the Iterator  
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		//accessing the element
		System.out.println("Returning element:"+list.get(1));////it will return the 2nd element, because index starts from 0  
		
		//changing the element
		list.set(1, "Avacodo");
		//Sorting the list
		Collections.sort(list);
		//Traversing list through for-each loop
		for (String fruit: list) {
			System.out.println(fruit);
		}
		
	}

}
