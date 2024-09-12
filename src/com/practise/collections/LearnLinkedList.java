package com.practise.collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LearnLinkedList {
	public static void main(String args[]) {
		List<String> foodlist = new LinkedList<>();
		foodlist.add("AlooParatha");
		foodlist.add(0, "Samosa");
		foodlist.add("Aloo Sabzi");
		System.out.println(foodlist.isEmpty());
		System.out.println(foodlist);
		LinkedList<String> nonFoodList = new LinkedList<>();
		nonFoodList.add("Plates");
		nonFoodList.add("Spoon");
		System.out.println(nonFoodList);
		nonFoodList.addAll(foodlist);
		nonFoodList.addFirst("Forks");
		nonFoodList.addLast("Glasses");
		System.out.println(nonFoodList.peekFirst());
		System.out.println(nonFoodList.peekLast());
		System.out.println(nonFoodList.toString());
		nonFoodList.removeLast();
		System.out.println(nonFoodList.toString());
		Collections.sort(nonFoodList);
		System.out.println(nonFoodList.toString());
		
		
		
		
		
		
	}

}
