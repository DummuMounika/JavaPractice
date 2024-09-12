package com.regular.practise;

public class Student {
	 int rollno;  
	 String name;  
	 String city;  
	  
	 public Student(int rollno, String name, String city){  
		 this.rollno=rollno;  
		 this.name=name;  
		 this.city=city;  
	 }
	 
	 public String toString(){//overriding the toString() method  
		  return rollno+" "+name+" "+city;  
		 }
}
