package com.practise.collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String args[]){  
		Map<Integer,String> map=new HashMap<Integer,String>();  
		map.put(100,"Amit");  
		map.put(101,"Vijay");  
		map.put(102,"Rahul");  
		
		map.putIfAbsent(103, "Mounika");
		map.replace(100, "Amit", "Venu");
		
		for(Map.Entry m:map.entrySet()){  
			System.out.println(m.getKey()+" "+m.getValue());  
		}  
	}
	
}