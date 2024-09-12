package com.regular;

public class Person {
	  //Default variables
	  String fname = "John";
	  String lname = "Doe";
	  String email = "john@doe.com";
	  int age = 24;
	  
	  //Protected variables
	  protected String fname1 = "Mounika";
	  protected String lname1 = "Dummu";
	  protected String email1 = "Mounika@dummu.com";
	  protected int age1 = 23;
	  
	  //Private variables
	  private String fname2 = "Venu";
	  private String lname2 = "Dummu";
	  private String email2 = "Venu@dummu.com";
	  private int age2 = 26;
	  
	  
	  public String getFname2() {
			return fname2;
		}
	  
	  public void setFname2(String fname2) {
			this.fname2 = fname2;
		}
	  
	  public String getLname2() {
			return lname2;
		}
	  
	  public void setLname2(String lname2) {
			this.lname2 = lname2;
		}
	  public String getEmail2() {
			return email2;
		}
	  
	  public void setEmail2(String email2) {
			this.email2 = email2;
		}
	  public int getAge2() {
			return age2;
		}
	  
	  public void setAge2(int age2) {
			this.age2 = age2;
		}
	  
	  
}
