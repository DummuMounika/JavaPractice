package com.regular.practise;

public class ObjectAndClass {
	int acc_no;
	String acc_name;
	float acc_amount;
	
	public void insert(int acc_no,String acc_name,float acc_amount)
	{
		this.acc_no = acc_no;
		this.acc_name = acc_name;
		this.acc_amount = acc_amount;
	}
	public void deposit(float amt) {
		acc_amount = acc_amount + amt;
		System.out.println(amt+ "deposited");
	}
	public void withdraw(float amt) {
		if (acc_amount < amt) {
			System.out.println("Insufficient Balance");  
		}
		else {
			acc_amount = acc_amount - amt;
			System.out.println(amt+"Withdrawn");  
		}
	}
	public void checkBalance() {
		System.out.println("Balance is:"+acc_amount);
	}
	public void display() {
		System.out.println(acc_no+" "+acc_name+" "+acc_amount);
	}  
	
	public static void main(String[] args) {
		ObjectAndClass a1=new ObjectAndClass();  
		a1.insert(832345,"Mounika",1000.00f);  
		a1.display();  
		a1.checkBalance();  
		a1.deposit(40000);  
		a1.checkBalance();  
		a1.withdraw(15000);  
		a1.checkBalance();  
		} 
	}

