package com.regular.practise;

enum Laptop {
	Macbook(2000), HP(1800), Surface(1300), Thinkpad(1600), Samsung;
	
	private int price;
	
	private Laptop() {
		price = 2400;
	}
	
	private Laptop(int price) {
		this.price = price;
        System.out.println("in Laptop " + this.name());
	}
	
	public int getPrice() {
		return price;
	}
	
	/**
	 * This
	 * @return
	 */
	@Deprecated
	public int calculatePrice() {
		return price*100;
	}
	
	
	public int calculatePrice2() {
		return price*200;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
}
