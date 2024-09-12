package com.practise.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LearnHashSet {
	public static void main(String args[]) {
		Set<String> set = new HashSet<>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Two");
		Iterator<String> i = set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		set.remove("Two");
		System.out.println(set);
		
	}

}
