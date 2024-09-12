package com.regular.practise;

public class StringBufferExample {
	public static void main(String args[]){  
		StringBuffer sb=new StringBuffer("Hello ");  
		
		sb.insert(1,"Java");//now original string is changed  
		System.out.println(sb);//prints HJavaello  
		
		StringBuffer sb1=new StringBuffer("Hello ");  
		sb1.append("Java");//now original string is changed  
		System.out.println(sb1);//prints Hello Java
		
		StringBuffer sb2=new StringBuffer("Hello ");  
		sb2.replace(1,3,"Java");  
		System.out.println(sb2);//prints HJavalo  
		
		StringBuffer sb3=new StringBuffer("Hello");  
		sb3.delete(1,3);  
		System.out.println(sb3);//prints Hlo  
		
		StringBuffer sb4=new StringBuffer("Hello");  
		sb4.reverse();  
		System.out.println(sb4);//prints olleH  
		
		StringBuffer sb5=new StringBuffer();  
		System.out.println(sb5.capacity());//default 16
		
		
		
		
		
	}
}
