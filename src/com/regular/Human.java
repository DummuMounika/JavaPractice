package com.regular;

public class Human {
	
		private int age; //instance variable
		private  String name;
		
		//private variables are access only with their own methods
		public int getAge() {
			return age;
		}
		
		public void setAge(int age) { //age - local variable
			this.age = age;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		//constructor
		//no return type
		//it have same name as class name
		
		public Human() { //Default Constructor
			System.out.println("Created object");
			System.out.println("In Constructor");
			age = 21;
			name = "Venu";
		}
		
		public Human(int age, String name) { //Parameterized constructor
			this.age = age;
			this.name = name;
		}
   }
	