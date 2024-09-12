package com.regular;

public class Laptop {
	String model;
	int price;
	
	public String toString(){
		//return "Hey";
		return model + " and " + price;
	}
	
	public boolean equals(Laptop thatObj) {
		return (this.model.equals(thatObj.model) && this.price == thatObj.price);
	}
}
