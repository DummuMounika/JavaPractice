package com.practise.collections;

import java.util.*;

enum days {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY  
}
public class EnumSetExample {
	public static void main(String[] args) {  
		Set<days> set = EnumSet.of(days.FRIDAY, days.MONDAY);
		System.out.println(set);
	}

}
