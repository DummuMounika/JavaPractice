package com.practise.collections;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class LearnStack {
	public static void main(String[] args) {
		Stack<String> places = new Stack<>();
		places.push("Texas");
		places.push("Atlanta");
		places.push("Newyork");
		System.out.println("Showing the added places:  " +places);
		places.pop();
		System.out.println("Showing the added places:  " +places);
		System.out.println(places.elementAt(0));
		places.insertElementAt("Boston", 1);
		Iterator<String> itr = places.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(places.peek());
		
		System.out.println(places.capacity());
		System.out.println(places.toString());
		}
	

}

