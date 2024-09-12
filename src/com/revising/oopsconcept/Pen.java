package com.revising.oopsconcept;

class Pen { //It's a blueprint of object
		String color; //properities (data)
		String type;  //properities
		
		public void write() { //methods (members)
			System.out.println("writing something");
		}
		
		public void printColor() {
			System.out.println(this.color);
		}
}
