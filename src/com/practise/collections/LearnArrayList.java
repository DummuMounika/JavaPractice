package com.practise.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {
	public static void main(String[] args) {
		List <Integer> clgIdList = new ArrayList<>();
		
//		while(loopItr.hasNext()) {
//			System.out.println(loopItr.next());
//		}
//	 
		System.out.println(clgIdList.isEmpty());
		clgIdList.add(101);
		clgIdList.add(0, 100);
		System.out.println(clgIdList);
		clgIdList.add(0,99);
		clgIdList.add(2,99);
		System.out.println(clgIdList);
		System.out.println(clgIdList.contains(99));
		System.out.println(clgIdList.getClass());
//		System.out.println(clgIdList.listIterator());
		Iterator<Integer> loopItr1 = clgIdList.iterator();	
		Iterator<Integer> loopItr = clgIdList.listIterator();
		while(loopItr.hasNext()) {
			System.out.println(loopItr.next());
		}
		clgIdList.set(0,98);
		clgIdList.set(1, 99);
		clgIdList.set(2,100);
		clgIdList.set(3,101);
		System.out.println(clgIdList.toString());
		clgIdList.removeIf(str->str.equals(98));
		System.out.println(clgIdList.toString());
		System.out.println(clgIdList.isEmpty());
	    System.out.println(clgIdList.size());
		}
	
	
	

}
