package com.regular;

public class StringBufferAndBuilder {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Mounika");
		System.out.println(sb.capacity()); // 16 + 7
		System.out.println(sb.length());
		
		sb.append(" Dummu");
		System.out.println(sb);
		System.out.println(sb.length());
		
		sb.deleteCharAt(0);
		System.out.println("Delete M: " +sb);
		System.out.println("Length after deleting: " +sb.length());
		
		sb.insert(0, "M");
		System.out.println("Added M: "+sb);
		System.out.println("length after adding: " + sb.length());
		
		//to convert string buffer to string
		String str = sb.toString();
		System.out.println("Printing String: " + str);
		
		
		

	}

}
