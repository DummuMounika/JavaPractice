package com.revising.oopsconcept;
//Access modifier
public class Account {
	public String name;
	private String password;
	protected String email;
	
	//getter and setter
	public String getpassword() {
		setpassword("abc2");
		return this.password;
	}
	public void setpassword(String passw) {
		this.password = passw;
	}

}
